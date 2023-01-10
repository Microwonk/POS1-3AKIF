import java.util.Random;

public class Random_Int_Array {

    private int[] zahlen;

    public Random_Int_Array() {
        this.zahlen = new int[100];
    }

    public void fillArray() {
        for (int i = 0; i < this.zahlen.length; i++) {
            this.zahlen[i] = new Random().nextInt(1000) + 1;
        }
    }

    public void showArray() {
        int i = 0;
        for (int zahl : zahlen) {
            if (i % 10 == 0) {
                System.out.println();
            }
            System.out.print(zahl + " ");
            i++;
        }
        System.out.println();
    }
}