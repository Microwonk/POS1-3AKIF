import java.util.Stack;

/**
 * Klasse Säule mit name und Stapel von Scheiben
 */
public class Saeule {

    /**
     * Name der Säule
     */
    private String name;

    /**
     * Stapel mit den Scheiben
     */
    private Stack<Scheibe> scheiben = new Stack<>();

    public Saeule(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    /**
     * hinzufügen einer Scheibe auf diese Säule
     * @param s Scheibe welche oben rauf gestapelt werden soll
     */
    public void stapeln(Scheibe s) {
        // 2. Regel: nur kleine auf groessere Scheibe
        if (scheiben.isEmpty() || s.getNummer() < scheiben.peek().getNummer()) {
            scheiben.push(s);
        } else {
            System.out.println("FEHLER: Regel 2 verletzt");
        }
    }

    /**
     * entnehmen einer Scheibe von dieser Säule
     * @return entnommene/oberste Scheibe
     */
    public Scheibe entnehmen() {
        return scheiben.pop();
    }

    /**
     * alle Scheiben der Säule horizontal anzeigen
     */
    public void anzeigen() {
        System.out.print(name + ": ");
        for (Scheibe s : scheiben) {
            System.out.print(s.toString());
        }
        System.out.println();
    }

}
