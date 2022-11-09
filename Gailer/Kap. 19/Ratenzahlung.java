import java.util.Scanner;

public class Ratenzahlung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double saldo, gesamt, gesamtbetrag;
        int monat;
        monat = 1;
        saldo = 1000;
        gesamtbetrag = 0;

        System.out.println("Geben Sie den monatlichen Betrag ein:");
        gesamt = scan.nextDouble();

        do {
            gesamtbetrag = gesamtbetrag + gesamt;
            saldo = saldo - (gesamtbetrag * 0.85);
            System.out.println(gesamtbetrag*0.85);

            System.out.println("Monat: " + monat + "   Saldo: " + saldo + " Gesamtbetrag: " + gesamtbetrag);
            
            monat++;
        } while (gesamtbetrag <= 1000);
    }
}