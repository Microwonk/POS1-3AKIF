import java.util.Scanner;

public class DeathValley {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tk, ba, mpg; //tankkapazität, benzinanzeige, meilen pro gallone
        double erg;

        System.out.println("Tankkapazität:");
        tk = scan.nextInt();
        System.out.println("Benzinanzeige (in Prozent):");
        ba = scan.nextInt();
        System.out.println("Meilen pro Gallone:");
        mpg = scan.nextInt();
        
        erg = (tk*(ba/100.0))*mpg;

        System.out.println();
        System.out.println(erg);

        if (erg<200) {
            System.out.println("Tanken!");
        }
        else {
            System.out.println("Weiterfahren...");
        }
        scan.close();
    }
}