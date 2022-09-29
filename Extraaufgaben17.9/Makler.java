import java.util.Scanner;

public class Makler{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double s1, s2, qm, np, mg, gb;
        System.out.println("----Makler----");
        System.out.println("Seite 1 eingeben:");
        s1 = scan.nextDouble();
        System.out.println("Seite 2 eingeben:");
        s2 = scan.nextDouble();
        System.out.println("Nettoquadratmeter Preis eingeben:");
        qm = scan.nextDouble();
        np = s1*s2*qm;
        mg = np*0.03;
        gb = np+mg;
        System.out.println("Der Nettopreis: " + np + " Die Maklergebühr: " + mg + " Der Gesamtbetrag: " +gb);
    }
}