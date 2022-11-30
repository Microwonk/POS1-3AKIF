import java.util.Arrays;
import java.util.Scanner;

public class Quader {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double l, b, h;

        System.out.println("Geben Sie die Länge ein:");
        l = scan.nextDouble();
        System.out.println("Geben Sie die Breite ein:");
        b = scan.nextDouble();
        System.out.println("Geben Sie die Höhe ein:");
        h = scan.nextDouble();

        scan.close();

        double[] arr = QuaderBerechnung(l, b, h);

        System.out.println("Volumen: " + arr[0]);
        System.out.println("Oberfläche: " + arr[1]);
        System.out.println("Raumdiagonale: " + arr[2]);

        /*
        System.out.println("Volumen: " + QuaderBerechnung(l, b, h)[0]);
        System.out.println("Oberfläche: " + QuaderBerechnung(l, b, h)[1]);
        System.out.println("Raumdiagonale: " + QuaderBerechnung(l, b, h)[2]);
        */
    }

    /**
     * Errechnet das Volumen, die Oberfläche und die Raumdiagonale von dem Quader der Parameter l, b, h
     * 
     * @param l länge des quaders
     * @param b breite des quaders
     * @param h höhe des quaders
     * @return array, welches die Berechnung von volumen, oberfläche und raumDiagonale darin gespeichert hat
     */

    public static double[] QuaderBerechnung (double l, double b, double h) {
        double volumen = l * b * h;
        double oberflache = (2 * l * b) + (2 * l * h) + (2 * b * h);
        double raumDiagonale = Math.sqrt((l * l) + (b * b) + (h * h));

        double[] arr = {volumen, oberflache, raumDiagonale};

        return arr;
    }
}