import java.util.*;


public class SecondObject {
    
    static private int x;
    static private int code;
    static private double y;

    /*
     * Constructor Class of SecondObject
     */
     public SecondObject() {
        x = 69;
        y = 420.69;
        code = 123456789;
     }


     public void memeMethod(int i) {
        for (int j = 0; j < i; j++) {
            System.out.println(x);
            System.out.println(y);
            System.out.println(x*y);

            x = (int)Math.pow(x, y);
            y = (int)Math.sqrt(y)*Math.sqrt(x);
        }
     }

     static void codeGuess(int i) {
         System.out.println("Guess my passcode in " + i + " tries.");
         Scanner s = new Scanner(System.in);
         int input, j = 0;

        do {
            input = s.nextInt();
            j++;

            if (input == code) {
                System.out.println("RICHTIG");
                break;
            }
    
            else {
                System.out.println("FALSCH");
            }

        } while (j < i);

        if (input != code) {
            System.out.println("HAHA DU LUSCHE");
        }

        else {
            System.out.println("OHA");
        }
     }

}
