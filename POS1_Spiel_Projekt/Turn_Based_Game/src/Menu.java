import java.util.Scanner;

public class Menu {

    static Player player = new Player(Game.chosenFighter, Game.strength, Game.stamina, Game.health, Game.specialMove1, Game.specialMove2, Game.name);
    public Menu () {

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
                System.out.println("Will display list of all defeated enemies");
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

    private static void leveling() {

    }

}
