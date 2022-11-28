import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class Spiel {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 1;
        boolean goldcollect = false;

        int xplayer = random.nextInt(0, 40);
        int xsnake = random.nextInt(0, 40);
        int xgold = random.nextInt(0, 40);
        int xexit = random.nextInt(0, 40);
        
        int yplayer = random.nextInt(0, 10);
        int ysnake = random.nextInt(0, 10);
        int ygold = random.nextInt(0, 10);
        int yexit = random.nextInt(0, 10);

        while ((xplayer == xsnake)&&(xplayer == xgold)&&(xplayer == xexit)&&(xsnake == xgold)&&(xsnake == xexit)&&(xgold == xexit)) {
            if (xplayer == xsnake) {
                xplayer = random.nextInt(0, 40);
            }
            else if (xplayer == xgold) {
                xplayer = random.nextInt(0, 40);
            }
            else if (xplayer == xexit) {
                xplayer = random.nextInt(0, 40);
            }
            else if (xsnake == xgold) {
                xsnake = random.nextInt(0, 40);
            }
            else if (xsnake == xexit) {
                xsnake = random.nextInt(0, 40);
            }
            else if (xgold == xexit) {
                xgold = random.nextInt(0, 40);
            }
        }
        
        while ((yplayer == ysnake)&&(yplayer == ygold)&&(yplayer == yexit)&&(ysnake == ygold)&&(ysnake == yexit)&&(ygold == yexit)) {
            if (yplayer == ysnake) {
                yplayer = random.nextInt(0, 10);
            }
            else if (yplayer == ygold) {
                yplayer = random.nextInt(0, 10);
            }
            else if (yplayer == yexit) {
                yplayer = random.nextInt(0, 10);
            }
            else if (ysnake == ygold) {
                ysnake = random.nextInt(0, 10);
            }
            else if (ysnake == yexit) {
                ysnake = random.nextInt(0, 10);
            }
            else if (ygold == yexit) {
                ygold = random.nextInt(0, 10);
            }
        }
        
        Point playerposition = new Point(xplayer, yplayer);
        Point snakeposition = new Point(xsnake, ysnake);
        Point goldposition = new Point(xgold, ygold);
        Point exitposition = new Point(xexit, yexit);
        
        //10x40
        while (i == 1) {
            
            
            for (int y = 0; y < 10; y++) {
            for (int x = 0; x < 40 ; x++) {
                Point p = new Point(x,y);
                System.out.print(" ");
                
                if (p.equals(playerposition)) {
                    System.out.print("P");
                }
                
                else if (p.equals(snakeposition)){
                    System.out.print("S");
                }
                
                else if (p.equals(exitposition)) {
                    System.out.print("E");
                }
                
                else if (p.equals(goldposition)) {
                    System.out.print("G");
                }
                
            }
            System.out.println();
        }

        if (snakeposition.equals(playerposition)) {
            i = 0;
            System.out.println();
            System.out.println("Du Hast VERLOREN");
        }
        if (playerposition.equals(goldposition)) {
            goldcollect = true;
            goldposition = new Point(-1, -1);
        }
        if (playerposition.equals(exitposition) && goldcollect == true) {
            i = 0;
            System.out.println();
            System.out.println("Du Hast GEWONNEN >:)");
        }
        System.out.println("_______________________________________");
        System.out.print("MOVE: ");

        movePlayer(playerposition);
        moveSnake(snakeposition, playerposition);

        System.out.println("_______________________________________");
    }
}
    //mit der moveSnake Methode, folgt die Schlange dem Player
    private static void moveSnake (Point snakeposition, Point playerposition) {
        if (playerposition.x < snakeposition.x) {
            snakeposition.x--;
        }
        else if (playerposition.x > snakeposition.x) {
            snakeposition.x++;
        }
        if (playerposition.y < snakeposition.y) {
            snakeposition.y--;
        }
        else if (playerposition.y > snakeposition.y) {
            snakeposition.y++;
        }
    }
    
    
    //mit der movePlayer Methode, kann man den Player bewegen
    private static void movePlayer(Point playerposition) {
        Scanner scan = new Scanner(System.in);
        String input = scan.next();
        
        if (input.equals("w")) {
            if (playerposition.y > 0) {
                playerposition.y--;
            }
            else {
                playerposition.y = 10;
            }
        }
        else if (input.equals("s")){
            if (playerposition.y < 9) {
                playerposition.y++;
            }
            else {
                playerposition.y = 0;
            }
        }
        else if (input.equals("a")) {
            if (playerposition.x > 0) {
                playerposition.x--;
            }
            else {
                playerposition.x = 40;
            }
        }
        else if (input.equals("d")) {
            if (playerposition.x < 39) {
                playerposition.x++;
            }
            else {
                playerposition.x = 0;
            }
        }
    }
}