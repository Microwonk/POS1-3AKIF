import java.util.*;

public class InnerAusser {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int unter, ober, daten;
        int sum = 0, sumgrenze = 0;

        System.out.println("------Grenzeneingabe------");
        System.out.print("Geben sie die Untergrenze ein: ");
        unter = scan.nextInt();
        System.out.print("Geben sie die Obergrenze ein: ");
        ober = scan.nextInt();

        for (daten = 1; daten > 0;) {
            System.out.println("Daten eingeben:");
            daten = scan.nextInt();
            if (daten <= ober && daten >= unter) {
                sumgrenze = sumgrenze + daten;
            }
            else {
                sum = sum + daten;
            }
        }

        System.out.println();
        System.out.println("Summe der Werte innerhalb des Bereiches: " + sumgrenze);
        System.out.println("Summe der Werte ausserhalb des Bereiches: " + sum);

        scan.close();
    }
}