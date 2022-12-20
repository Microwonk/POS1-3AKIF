package net.mikrowonk.game;

import java.io.IOException;
import java.util.*;

public class Core {
    
    public static Player player = Main.player;
    private List<Enemy> allEnemies = new ArrayList<>();

    public Core() {

    }

    // showing the Menu (home screen)
    public void showMenu () {
        System.out.println("===============Menu=================");
        System.out.println("------------------------------------");
        System.out.println("-- (1) for showing Player Stats ----");
        System.out.println("-- (2) for leveling Menu -----------");
        System.out.println("-- (3) show defeated Enemies ----- ");
        System.out.println("-- (4) for fighting random Enemy ---");
        System.out.println("-- (5) to Quit ---------------------");
        System.out.println("------------------------------------");
        System.out.println("====================================");
        interactMenu();
    }
    
    public void interactMenu() {
        Scanner scan = new Scanner(System.in);
        int input;

        while (true) {
            input = Integer.parseInt(scan.next());
            if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5) {
                break;
            }
            else {
                System.out.println("Error: Invalid Argument");
            }
        }


        // depending on input, starts methods
        switch (input) {
            case 1 -> {
                player.showStats();
                showMenu();
            }
            case 2 -> {
                leveling();
                showMenu();
            }
            case 3 -> {
                showAllEnemies();
                showMenu();
            }
            case 4 -> {
                Enemy enemy = new Enemy();
                Fight f = new Fight(enemy, player);
                f.fight();
                if (f.getWon()) {
                    allEnemies.add(enemy);
                }
                showMenu();
            }
            default -> {
                System.out.println("Do you want to save? (y) (n)");
                String savingDecision = scan.next();
                if (savingDecision.equalsIgnoreCase("y")) {
                    try {
                        Save s = new Save(player);
                        s.saving();

                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
                System.out.println("-==-< Game ended >-==-");
                scan.close();
            }
        }
    }

    private static int pointsSpent = 0;

    private void leveling() {
        Scanner scan = new Scanner(System.in);

        // levelpoints declaration
        int levelpoints = player.getLevel() * 2 - pointsSpent;
        int levelingInput;

        System.out.println("===========Leveling==Menu===========");
        System.out.println("------------------------------------");
        System.out.println("-- (1) Upgrade strength by one -----");
        System.out.println("-- (2) Upgrade health by two -------");
        System.out.println("-- (3) Upgrade " + player.getSpecialMove());
        System.out.println("-- (4) Change name -----------------");
        System.out.println("-- (5) Nevermind -------------------");
        System.out.println("------------------------------------");
        System.out.println("-------- Points: " + levelpoints + " ---------");
        System.out.println("====================================");


        // if there is no value 1-5, it spits out an error
        while (true) {
            System.out.print(": ");
            levelingInput = Integer.parseInt(scan.next());
            if (levelingInput == 1 || levelingInput == 2 || levelingInput == 3 || levelingInput == 4 || levelingInput == 5) {
                break;
            }
            else {
                System.out.println("Error: Invalid Argument");
            }
        }

        // upgrades by the choice made (only if enough points are available)

        if (levelpoints > 0) {
            switch (levelingInput) {
                case 1:
                    pointsSpent++;
                    
                    player.upgradeStrength();
                    System.out.println("<Leveled Strength by one>");
                    
                    leveling();
                    break;
                case 2:
                    pointsSpent++;
                    
                    player.upgradeHealth();
                    System.out.println("<Leveled Health by two>");
                    leveling();
                    break;
                case 3:
                    pointsSpent++;

                    player.upgradeSpecialMoveStrength();
                    System.out.println("<Upgraded " + Starting.specialMove +">");

                    leveling();
                    break;
                case 4:
                    pointsSpent++;
                    System.out.println("Your Pokemons new Name: ");
                    String newName = scan.next();

                    player.changeName(newName);
                default:
            }
        }
        else if (levelingInput != 5) {
            System.out.println("<Not enough Points>");
        }
    }

    public void showAllEnemies() {
        int i = 0;
        Scanner scan = new Scanner(System.in);
        for (Enemy enemy : allEnemies) {
            enemy.showStats();
            System.out.println("Index: " + i);
            System.out.println();
            i++;
        }
        System.out.println("<If you want to fight a previous Pokémon, enter it's index (-1 to leave)>");
        int decision = Integer.parseInt(scan.next());
        if (decision < 0 || decision > i) {
            return;
        }
        Enemy enemy = allEnemies.get(decision);
        Fight f = new Fight(enemy, player);
        f.fight();
        if (f.getWon()) {
            allEnemies.add(enemy);
        }
    }
}
