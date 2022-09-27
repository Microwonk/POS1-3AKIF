import java.util.Scanner;

class Kreditvergaberichtlinien {
    public static void main(String[] args) {
        System.out.println("----KREDITVERGABE----");
        Scanner s = new Scanner(System.in);
        double pr, ek, kr, gesh; //preis, eigenkapital, kreditrate, gesamter Haushalt
        System.out.println("Kaufpreis der Immobilie:");
        pr = s.nextInt(); //eingabe des Preises der Immobilie
        ek = pr*0.2; //eigenkapital von 20%
        System.out.println("Sie muessen ein Eigenkapital von " + ek +" aufbringen.");
        System.out.println();
        System.out.println("Geschaetzter monatliche Kreditrate eingeben:");
        kr = s.nextInt(); //40% des Haushaltsnettoeinkommen nicht ueberschreiten
        gesh = kr/40*100; //Gesamter Haushaltsverdienst
        System.out.println("Sie muessen im Monat um gesamten Haushalt mindestens " + gesh + "Euro Netto zur Verfuegung haben.");
    }
}