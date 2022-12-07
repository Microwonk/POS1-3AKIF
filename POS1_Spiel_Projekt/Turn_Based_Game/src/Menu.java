import java.util.Scanner;

public class Menu {

    static Player player = new Player(Game.chosenFighter, Game.strength, Game.stamina, Game.health, Game.specialMove, Game.name);
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
    }

    public static void interactMenu() {
        Scanner scan = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(": ");
            input = scan.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5) {
                break;
            }
            else {
                System.out.println("Error: Invalid Argument");
            }
        }
        scan.close();

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
                System.out.println("Will fight random Enemy");
                showMenu();
                break;
            default:
                System.out.println("-==-< Game ended >-==-");
                break;

        }
    }

    private static int pointsSpent = 0;

    private static void leveling() {
        // figure out, how many points can be spent
        int levelpoints = player.level * 2 - pointsSpent;

        System.out.println("===========Leveling==Menu===========");
        System.out.println("------------------------------------");
        System.out.println("-- (1) Upgrade strength by one -----");
        System.out.println("-- (2) Upgrade health by two -------");
        System.out.println("-- (3) Upgrade stamina by five -----");
        System.out.println("-- (4) Upgrade " + Game.specialMove);
        System.out.println("-- (5) Change name -----------------");
        System.out.println("-- (6) Nevermind -------------------");
        System.out.println("------------------------------------");
        System.out.println("------Points: " + levelpoints + "----------");
        System.out.println("====================================");

        Scanner scan = new Scanner(System.in);
        int input;

        while (true) {
            System.out.print(": ");
            input = scan.nextInt();
            if (input == 1 || input == 2 || input == 3 || input == 4 || input == 5 || input == 6 || input == 7) {
                break;
            }
            else {
                System.out.println("Error: Invalid Argument");
            }
        }
        scan.close();

        switch (input) {
            case 1:
                // Remember - pointsSpent++ when spending levelings
                pointsSpent++;

                player.upgradeStrength();
                leveling();
                break;
            case 2:
                pointsSpent++;

                player.upgradeHealth();
                leveling();
                break;
            case 3:
                pointsSpent++;

                player.upgradeStamina();
                leveling();
                break;
            case 4:
                System.out.println("Will fight random Enemy");
                leveling();
                break;
            default:
                System.out.println("-==-< Game ended >-==-");
                break;

        }
    }

}
