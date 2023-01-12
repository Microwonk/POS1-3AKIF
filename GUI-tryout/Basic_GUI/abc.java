import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class abc {

    private int spielerAnzahl;
    private List<Spieler> spieler = new ArrayList<>();

    public abc() {
        spielerAnzahl = 50;
        for (int i = 0; i < spielerAnzahl; i++) {

            spieler.add(new Spieler(new Random().nextBoolean(), false));
        }
    }
}

class Spieler {
    private boolean lebt;
    private boolean istWolf;
    private boolean istHeiler;

    public Spieler(boolean istWolf, boolean istHeiler) {
        this.istHeiler = istHeiler;
        this.istWolf = istWolf;
        this.lebt = true;
    }

    public void setIstHeiler(boolean istHeiler) {
        this.istHeiler = istHeiler;
    }
    public void setIstWolf(boolean istWolf) {
        this.istWolf = istWolf;
    }
    public void setLebt(boolean lebt) {
        this.lebt = lebt;
    }
}
