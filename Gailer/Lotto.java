import java.util.Random;

public class Lotto {
    public static void main(String[] args) {
        Random rand = new Random();
        int zufallszahl;

        for (int i = 0; i < 6; i++) {
            zufallszahl = rand.nextInt(1, 46);
            System.out.println(zufallszahl);
        }
    }
}
