import java.util.Scanner;

public class Kreisring {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        double r1, r2, d, k1, k2, kr; //radius1, radius2, dicke, kreis1, kreis2, kreisring
        System.out.println("----Kreisringfläche----");

        System.out.println("Gib den äußeren Radius des Kreisringes an:");
        r1 = s.nextDouble();

        System.out.println("Gibt die Breite des Ringes an:");
        d = s.nextDouble();
        r2 = r1 - d;
        k1 = r1*r1* Math.PI;
        k2 = r2*r2* Math.PI;
        kr = k1-k2;

        System.out.println();
        System.out.println("Die Fläche des Kreisringes beträgt: " +kr);
    }
} 