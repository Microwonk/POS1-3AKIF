import java.util.Scanner;

public class Main {

    private int scheibenAnzahl;
    private Saeule links;
    private Saeule mitte;
    private Saeule rechts;
    private int counter;


    /**
     * Spielklasse für Türme von Hanoi
     */


    public Main(int scheibenAnzahl) {
        this.scheibenAnzahl = scheibenAnzahl;
        this.links = new Saeule("L");
        this.mitte = new Saeule("M");
        this.rechts = new Saeule("R");
        this.counter = 0;

        // Initialisierung der linken Säule mit x Scheiben
        for (int i = scheibenAnzahl; i > 0; i--) {
            links.stapeln(new Scheibe(i));
        }
    }

    /**
     * starten des Spiels/Algorithmus
     */
    public void starte() {
        anzeigen();

        transport(scheibenAnzahl, links, mitte, rechts);
        System.out.println("Runden: " + counter);
    }


    /**
     * Methode/Algorithmus zum Lösen von Türme von Hanoi
     * @param n Anzahl an Scheiben, welche verschoben werden sollen
     * @param l Start-Säule
     * @param m Ziel-Säule
     * @param r Hilfs-Säule
     */
    private void transport(int n, Saeule l, Saeule m, Saeule r) {
        if (n > 1) {
            transport(n - 1, l, r, m);
        }

        transportiereScheibe(l, m);
        anzeigen();
        counter++;

        if (n > 1) {
            transport(n - 1, r, m, l);
        }

        
    }

    /**
     * transportieren/verschieben einer Scheibe von start nach ziel
     * @param start
     * @param ziel
     */
    private void transportiereScheibe(Saeule start, Saeule ziel) {
        Scheibe s = start.entnehmen();

        System.out.println("---------------------------------------------------------------");
        System.out.println("Transportiere Scheibe " + s.getNummer() + " von Säule " + start.getName() + " nach Säule " + ziel.getName());
        System.out.println("---------------------------------------------------------------");

        ziel.stapeln(s);
    }

    /**
     * anzeigen aller Säulen
     */
    private void anzeigen() {
        links.anzeigen();
        mitte.anzeigen();
        rechts.anzeigen();
    }

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Wie viele Scheiben?");
        int anzahl = s.nextInt();
        s.close();

        Main spiel = new Main(anzahl);
        spiel.starte();

    }
}
