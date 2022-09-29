import java.util.Scanner;

public class Quader {
    public static void main(String[] args) {
        float l,b,h, summe, A, V;
        Scanner s = new Scanner(System.in);
        System.out.println("----Quader Berechnung----");
        System.out.println("Geben Sie die Länge an:");
        l = s.nextFloat();
        System.out.println("Geben Sie die Breite an:");
        b = s.nextFloat();
        System.out.println("Geben Sie die Höhe an:");
        h = s.nextFloat();
        summe = 4*(l+b+h);
        A = 2*(l*b+l*h+b*h);
        V = l*b*h;
        System.out.println();
        System.out.println("Summe: " + summe + " Fläche: " +A+" Volumen: " +V);
    }
}