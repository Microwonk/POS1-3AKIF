import java.util.*;

public class Menu {
    
    static Player player = new Player(Game.chosenFighter, Game.strength, Game.health, Game.specialMove, Game.name, Game.strength * 2);
    
    public Menu () {

    }

    public static void intro() {
        System.out.println("+-----------------------------------+");
        System.out.println("|        OOO   O   O O  OOO         |");
        System.out.println("|        O O  O O  OO   O           |");
        System.out.println("|        OOO  O O  O    OO          |");
        System.out.println("|        O    O O  OO   O           |");
        System.out.println("|        O     O   O O  OOO         |");
        System.out.println("|                                   |");
        System.out.println("|         O   O   OO   O  O         |");
        System.out.println("|         OO OO  O  O  OO O         |");
        System.out.println("|         OO OO  O  O  OO O         |");
        System.out.println("|         O O O  O  O  O OO         |");
        System.out.println("|         O O O   OO   O  O         |");
        System.out.println("+-----------------------------------+");
        return;
    }
    
    public static void showMenu () {
        System.out.println("===============Menu=================");
        System.out.println("------------------------------------");
        System.out.println("-- (1) for showing Player Stats ----");
        System.out.println("-- (2) for leveling Menu -----------");
        System.out.println("-- (3) for showing Defeated Enemies ");
        System.out.println("-- (4) for fighting random Enemy ---");
        System.out.println("-- (5) to Quit ---------------------");
        System.out.println("------------------------------------");
        System.out.println("====================================");
        interactMenu();
        return;
    }
    
    public static void interactMenu() {
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

        switch (input) {
            case 1:
                player.getStats();
                showMenu();
                break;
            case 2:
                Menu.leveling();
                showMenu();
                break;
            case 3:
                System.out.println("temp level up");
                player.levelUp(30);
                showMenu();
                break;
            case 4:
                Enemy enemy = new Enemy(player.level);
                enemy.getEnemystats();
                enemy.fight();
                showMenu();
                break;
            default:
                System.out.println("-==-< Game ended >-==-");
                break;
        }
    }

    private static int pointsSpent = 0;

    private static void leveling() {
        Scanner scan = new Scanner(System.in);
        // figure out, how many points can be spent
        int levelpoints = player.level * 2 - pointsSpent;

        System.out.println("===========Leveling==Menu===========");
        System.out.println("------------------------------------");
        System.out.println("-- (1) Upgrade strength by one -----");
        System.out.println("-- (2) Upgrade health by two -------");
        System.out.println("-- (3) Upgrade " + Game.specialMove);
        System.out.println("-- (4) Change name -----------------");
        System.out.println("-- (5) Nevermind -------------------");
        System.out.println("------------------------------------");
        System.out.println("---------- Points: " + levelpoints + "------------------");
        System.out.println("====================================");

        int levelingInput;

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

        if (levelpoints > 0) {
            switch (levelingInput) {
                case 1:
                    // Remember - pointsSpent++ when spending levelings
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
                    System.out.println("<Upgraded " + Game.specialMove +">");

                    leveling();
                    break;
                case 4:
                    pointsSpent++;
                    System.out.println("Your Pokemons new Name: ");
                    String newName = scan.next();

                    player.changeName(newName);
                default:
                    return;
            }
        }
        else if (levelingInput != 5) {
            System.out.println("<Not enough Points>");
            return;
        }
        return;
    }
}
