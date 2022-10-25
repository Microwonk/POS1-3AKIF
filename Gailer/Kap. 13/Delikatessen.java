import java.util.Scanner;

public class Delikatessen {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        
        String artikel, exversand;
        double preis, versand;

        System.out.print("Geben Sie den Artikel ein: ");
        artikel = scan.next();
        System.out.println();
        System.out.print("Geben Sie den preis ein: ");
        preis = scan.nextDouble();
        System.out.println();
        System.out.print("Expressesversand (j/n): ");
        exversand = scan.next();
        System.out.println();

        if (preis<10) {
            versand = 2;
        }
        else {
            versand = 3;
        }
        if (exversand.equals("j")) {
            versand = versand + 5;
        }
        
        System.out.println("Rechnung");
        System.out.println("    " + artikel + ": " + preis);
        System.out.println("    Versand: " + versand);
        System.out.println("    Gesamt: " + (versand+preis));
    }
}
