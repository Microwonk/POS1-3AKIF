import java.util.Scanner;

public class DeathValley {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tk, ba, mpg; //tankkapazität, benzinanzeige, meilen pro gallone

        System.out.println("Tankkapazität:");
        tk = scan.nextInt();
        System.out.println("Benzinanzeige (in Prozent):");
        ba = scan.nextInt();
        System.out.println("Meilen pro Gallone:");
        mpg = scan.nextInt();

        System.out.println(((tk*(ba/100.0))*mpg));

        if (((tk*(ba/100.0))*mpg)>200) {
            System.out.println("Tanken!");
        }
        else {
            System.out.println("Weiterfahren...");
        }
        scan.close();
    }
}