public class Main {

    private int scheibenAnzahl;
    private Saeule links;
    private Saeule mitte;
    private Saeule rechts;


    /**
     * Spielklasse für Türme von Hanoi
     */


    public Main(int scheibenAnzahl) {
        this.scheibenAnzahl = scheibenAnzahl;
        links = new Saeule("L");
        mitte = new Saeule("M");
        rechts = new Saeule("R");

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
    }

    private int counter = 0;

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
        System.out.println("Runden: " + counter);

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

        Main spiel = new Main(3);
        spiel.starte();

    }
}
