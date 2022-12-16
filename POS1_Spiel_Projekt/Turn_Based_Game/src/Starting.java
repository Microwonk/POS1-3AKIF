import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.awt.Desktop;
import java.io.BufferedReader;
import java.io.FileReader;

public class Starting {

    // initialisieren der stat vars
    public static int strength, health, chosenFighter, specialMoveStrength, level, levelxp;
    public static String specialMove, name;
    public static int savingChoice;

    public Starting (){
        
    }
        
    /**
     * starts the Selection of Character
     */
    public static void Selection() {
        Scanner scan = new Scanner(System.in);
        boolean decided = false;
        Desktop d = Desktop.getDesktop();

        System.out.println("New Game(1) or start from Save(2)?");
        savingChoice = scan.nextInt();

        if (savingChoice == 2) {
            try {
                getSave();
            } catch (IOException e) {
                e.printStackTrace();
            }

            Menu.intro();
            Menu.showMenu();
        }

        else {
        System.out.println("<Opening character selection, please view>");
        
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
                System.out.println("<That is not a character, try again>");
            }
        } while (!decided);

        System.out.println("<Now opening preview of your Character>");

        // opening the preview of the chosen character
        
        File fighter = new File("src/"+chosenFighter+".png");

        try {
            d.open(fighter);
        }
        catch (IOException e) {
            e.printStackTrace();
        }
        
        System.out.print("Now give your Pokemon a name:");
        name = scan.next();
        System.out.println();
        
        
        // sets the stats of the player depending on their choice
        
        switch (chosenFighter) {
            case 1:
            strength = 10;
            health = 40;
            specialMove = "Earthquake";
            break;
            case 2:
            strength = 20;
            health = 20;
            specialMove = "Thunder";
            break;
            default:
            strength = 5;
            health = 70;
            specialMove = "Roll";
                break;

            }

            specialMoveStrength = strength * 2;
            
            Menu.intro();
            Menu.showMenu();
        }
        return;
    }

    public static void getSave () throws IOException{
        int i = 0;
        int statcounter = 0;
        int startofnext = 0;
        File save = new File("Save.txt");

        BufferedReader br = new BufferedReader(new FileReader(save));
        String stats = br.readLine();
        int len = stats.length();

        do {
            if (i == len - 1) {
                levelxp = Integer.valueOf(stats.substring(startofnext, len));
                System.out.println(levelxp);
                return;
            }
            if (stats.charAt(i) == ' ') {
                switch (statcounter) {
                    case 0:
                    chosenFighter = Integer.valueOf(stats.substring(0, i));
                        break;
                    case 1:
                    strength = Integer.valueOf(stats.substring(startofnext, i));
                        break;
                    case 2:
                    health = Integer.valueOf(stats.substring(startofnext, i));
                        break;
                    case 3:
                    specialMove = stats.substring(startofnext, i);
                        break;
                    case 4:
                    name = stats.substring(startofnext, i);
                        break;
                    case 5:
                    specialMoveStrength = Integer.valueOf(stats.substring(startofnext, i));
                        break;
                    case 6:
                    level = Integer.valueOf(stats.substring(startofnext, i));
                    System.out.println(level);
                        break;
                    }
                startofnext = i + 1;
                statcounter++;
            }
        
        i++;
    } while (i < len);
        
    br.close();
    return;
    }
}
