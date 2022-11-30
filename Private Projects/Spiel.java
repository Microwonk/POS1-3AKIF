import java.awt.Point;
import java.util.Random;
import java.util.Scanner;

public class Spiel {
    public static void main(String[] args) {
        Random random = new Random();
        int i = 1;
        boolean goldcollect = false;

        int xplayer = random.nextInt(0, 41);
        int xsnake = random.nextInt(0, 41);
        int xgold = random.nextInt(0, 41);
        int xexit = random.nextInt(0, 41);
        
        int yplayer = random.nextInt(0, 11);
        int ysnake = random.nextInt(0, 11);
        int ygold = random.nextInt(0, 11);
        int yexit = random.nextInt(0, 11);

        while ((xplayer == xsnake)&&(xplayer == xgold)&&(xplayer == xexit)&&(xsnake == xgold)&&(xsnake == xexit)&&(xgold == xexit)&&(yplayer == ysnake)&&(yplayer == ygold)&&(yplayer == yexit)&&(ysnake == ygold)&&(ysnake == yexit)&&(ygold == yexit)) {
            if (xplayer == xsnake) {
                xplayer = random.nextInt(0, 40);
            }
            if (xplayer == xgold) {
                xplayer = random.nextInt(0, 40);
            }
            if (xplayer == xexit) {
                xplayer = random.nextInt(0, 40);
            }
            if (xsnake == xgold) {
                xsnake = random.nextInt(0, 40);
            }
            if (xsnake == xexit) {
                xsnake = random.nextInt(0, 40);
            }
            if (xgold == xexit) {
                xgold = random.nextInt(0, 40);
            }
            if (yplayer == ysnake) {
                yplayer = random.nextInt(0, 10);
            }
            if (yplayer == ygold) {
                yplayer = random.nextInt(0, 10);
            }
            if (yplayer == yexit) {
                yplayer = random.nextInt(0, 10);
            }
            if (ysnake == ygold) {
                ysnake = random.nextInt(0, 10);
            }
            if (ysnake == yexit) {
                ysnake = random.nextInt(0, 10);
            }
            if (ygold == yexit) {
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
                    if (!(playerposition.x == x)||(snakeposition.x == x)||(exitposition.x == x)||(goldposition.x == x)) {
                        System.out.print(".");
                    }

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
            System.out.println("_______________________________________");
            System.out.println("Du Hast VERLOREN");
            return;
        }
        if (playerposition.equals(goldposition)) {
            goldcollect = true;
            goldposition = new Point(-1, -1);
        }
        if (playerposition.equals(exitposition) && goldcollect == true) {
            i = 0;
            System.out.println();
            System.out.println("Du Hast GEWONNEN >:)");
            System.out.println("_______________________________________");
            return;
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