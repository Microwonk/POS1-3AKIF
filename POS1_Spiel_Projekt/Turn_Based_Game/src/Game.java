import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;

public class Game {

    private static int i = 0;
    private static String gameOverScreen = "=-==-={[G A M E O V E R]}=-==-=";
    
    public static void start() {

        Scanner scan = new Scanner(System.in);

            System.out.println("Press ENTER to continue.");
            String in = scan.nextLine();
    
        //equalsIgnoreCase

        if(in.equals("")) {
            if (i < 0) {
                System.out.println("Finally, you got it.");
            }
            Selection();
            scan.close();
            return;
        }

        switch (i) {
            case 0:
                System.out.println("No, don't type anything, please press ENTER.");
                i++;
                start();
                break;
            case 1:
                System.out.println("E N T E R");
                i++;
                start();
                break;
            case 2:
                System.out.println("No seriously, what is wrong with you, please press E N T E R");
                i++;
                start();
                break;
            case 3:
                System.out.println("NOW SERIOUSLY, CAN YOU NOT JUST PRESS ENTER?");
                i++;
                start();
                break;
            case 4:
                System.out.println("I AM LOSING MY PATIENCE.");
                i++;
                start();
                break;
            case 5:
                System.out.println("THIS IS THE LAST WARNING.");
                i++;
                start();
                break;

            default:
                System.out.println("Okay, you didn't want it any other way.");
                System.out.println(gameOverScreen);
                scan.close();
                return;
        }
        scan.close();
    }

    public static void Selection() {
        Scanner scan = new Scanner(System.in);
        boolean decided = false;
        int chosenFighter;
        Desktop d = Desktop.getDesktop();

        System.out.println("Opening character selection, please view.");
        
        // opening the stat preview of all characters

        File f = new File("src/Fighters.txt");
        try {
            d.open(f);;
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        // asking what character the player wants to choose, until they pick either 1,2 or 3

        do {
            System.out.println();
            System.out.println("Which one of these Pokemon do you want? (1, 2, 3)");
            System.out.print(":");
            chosenFighter = scan.nextInt();
            if (chosenFighter == 1 || chosenFighter == 2 || chosenFighter == 3) {
                decided = true;
            }
            else {
                System.out.println("That is not a character, try again.");
            }
        } while (!decided);

        System.out.println("Now opening preview of your Character.");

        // opening the preview of the chosen character

        File fighter = new File("src/"+chosenFighter+".png");

        try {
            d.open(fighter);
        }
        catch (IOException e) {
            e.printStackTrace();
        }

        end();
    }

    public static void end() {
        
    }
}