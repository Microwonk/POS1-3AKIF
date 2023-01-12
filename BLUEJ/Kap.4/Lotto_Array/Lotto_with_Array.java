import java.util.Random;

public class Lotto_with_Array {

    private int[] lottoZahlen;

    public Lotto_with_Array() {
        lottoZahlen = new int[6];
    }


    public void fillArray() {
        for (int i = 0; i < lottoZahlen.length; i++) {
            lottoZahlen[i] = new Random().nextInt(1, 46);
            int j = 0;
            while (j < 6) {
                if (lottoZahlen[i] == lottoZahlen[j]) {
                    lottoZahlen[i] = new Random().nextInt(1, 46);
                }
                j++;
            }
        }
    }

    public void showArray() {
        for (int i : lottoZahlen) {
            System.out.print(i + ", ");
        }
    }
}
