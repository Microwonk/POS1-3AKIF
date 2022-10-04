import java.util.Scanner;

class Kreditvergaberichtlinien {
    public static void main(String[] args) {
        System.out.println("----KREDITVERGABE----");

        Scanner s = new Scanner(System.in);
        double pr, ek, kr, gesh; //preis, eigenkapital, kreditrate, gesamter Haushalt

        System.out.println("Kaufpreis der Immobilie:");
        pr = s.nextInt(); //eingabe des Preises der Immobilie
        ek = pr*(20.0/100.0); //eigenkapital von 20% (*0.2)

        System.out.println("Sie müssen ein Eigenkapital von " + ek +" aufbringen.");
        System.out.println();

        System.out.println("Geschätzte monatliche Kreditrate eingeben:");
        kr = s.nextInt(); //40% des Haushaltsnettoeinkommen nicht ueberschreiten
        gesh = kr/40.0*100; //Gesamter Haushaltsverdienst
        System.out.println("Sie müssen im Monat im gesamten Haushalt mindestens " + gesh + "Euro Netto zur Verfügung haben.");
    }
}