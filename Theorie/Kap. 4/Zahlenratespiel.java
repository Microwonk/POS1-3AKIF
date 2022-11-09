import java.util.Scanner;
import java.util.Random;

public class Zahlenratespiel {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        
        Random r = new Random();

        int guess, tries, random;
        //double randomd;

        //randomd = Math.random()*100;  //randomd, weil die Funktion Math.random nur Doubles erstellt, diese werden dann mit 100 multipliziert, dass Zahlen von 1-100 herauskommen
        tries = 0;  //versuche, anfangend bei 0
       // random = (int)randomd +1;

        random = r.nextInt(1,101);

        do {
            System.out.print("Tipp 1-100 eingeben: ");
            guess = scan.nextInt();
            tries++;  //versuche werden bei jeden Durchlauf erhöhrt

            if (guess>random) {
                System.out.println("Tipp zu hoch!"); //zu hoch
            }
            else if (guess<random) {
                System.out.println("Tipp zu nieder!"); //zu niedrig
            }
            else {
                System.out.println("Tipp ist richtig!");
                System.out.println("Versuche: " + tries);
            }
        } while (guess != random);

        scan.close();
    }
}
