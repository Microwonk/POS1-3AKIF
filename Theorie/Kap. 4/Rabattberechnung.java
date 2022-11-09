import java.util.Scanner;

public class Rabattberechnung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int JU, i;
        double rabatt;
        String berechnung, KN;

        System.out.println("Rabattberechnung");

        do {
            System.out.println();
            System.out.print("Kundennummer: ");
            KN = scan.nextLine();
            
            System.out.print("Jahresumsatz: ");
            JU = scan.nextInt();
            System.out.println();
            
            if (JU>10000) {
                rabatt = JU *0.03;
            }
            else {
                rabatt = JU * 0.02;
            }

            System.out.println();
            System.out.println("Kundennummer: " + KN);
            System.out.println("    Jahresumsatz: " + JU);
            System.out.println("        Rabatt: " + rabatt);

            System.out.println();
            System.out.println("Weitere Berechnung? (j) (n)");
            berechnung = scan.next();

            if (berechnung.equals("j")) {
                i = 1;
            } else {
                i = 0;
            }
        } while (i == 1);

        System.out.println("Ende");
        scan.close();
        return;
    }
}
