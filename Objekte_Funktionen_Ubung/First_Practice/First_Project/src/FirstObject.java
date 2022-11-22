import java.util.Scanner;

public class FirstObject {
    private static int y;

    /*
     * Constructor for objects of class FirstObject
     */

     public FirstObject() {
        y = 2;
     }


    public static int multiplyMethod(int x) {
        return x*y;
    }

    public String yourName() {

        Scanner s = new Scanner(System.in);

        System.out.println("What is your name?");
        String nameinput = s.nextLine();


        System.out.println("Hello " + nameinput + ", nice to meet you!");
        
        return nameinput;
    }

    
    static void wertbooelan () {
        boolean wert = true;

        while (true) {
            
            if (!wert) {
                break;
            }
        }
    }
}