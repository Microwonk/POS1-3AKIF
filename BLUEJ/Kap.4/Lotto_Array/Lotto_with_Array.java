import java.util.Random;

public class Lotto_with_Array {

    private int[] lottoZahlen;

    public Lotto_with_Array() {
        lottoZahlen = new int[6];
    }

    // irrelevant für das Beispiel
    public void loopUntil () {
        int[] control = {1,2,3,4,5,6};
        int rounds = 0;
        while(this.lottoZahlen != control) {
            fillArray();
            showArray();
            rounds++;
        }
        System.out.println("Versuche: " + rounds);
    }

    // füllt 6 Zahlen des Arrays lottoZahlen mit random Zahlen, die nicht überlappen
    public void fillArray() {
        int zahlCheck;
        boolean istGleich = false;
         for (int i = 0; i < this.lottoZahlen.length; i++) {
            do {
                zahlCheck = new Random().nextInt(1, 46);
                for(int zufall: this.lottoZahlen) {
                    if (zahlCheck == zufall) {
                        istGleich = true;
                        break;
                    }
                    istGleich = false;
                }
            }while(istGleich);
            this.lottoZahlen[i] = zahlCheck;
        }
    }

    // print alle Zahlen des Arrays
    public void showArray() {
        for (int i : this.lottoZahlen) {
            System.out.print(i + ", ");
        }
        System.out.println();
    }
}
