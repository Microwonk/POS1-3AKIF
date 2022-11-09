import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int zufallszahl;

        for (int i = 0; i < 6; i++) {
            zufallszahl = rand.nextInt(1, 45);
            //zufallszahl = rand.nextInt(45) + 1;
            System.out.println(zufallszahl);
        }
    }
}
