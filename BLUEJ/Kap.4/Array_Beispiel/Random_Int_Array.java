import java.util.Random;

public class Random_Int_Array {

    private int[] zahlen;

    public Random_Int_Array() {
        this.zahlen = new int[100];
    }

    public void fillArray() {
        for (int i = 0; i < this.zahlen.length; i++) {
            this.zahlen[i] = new Random().nextInt(1, 1000);
        }
    }

    public void showArray() {
        int i = 0;
        for (int zahl : zahlen) {
            if (i % 10 == 0) {
                System.out.println();
                System.out.println("----------------------------------------");
            }
            System.out.print(calcSpaces(zahl) + zahl + "|");
            i++;
        }
        System.out.println();
    }

    public String calcSpaces(int zahl) {
        if (Integer.toString(zahl).length() == 1) {
            return "00";
        }
        else if(Integer.toString(zahl).length() == 2) {
            return "0";
        }
        return "";
    }
}