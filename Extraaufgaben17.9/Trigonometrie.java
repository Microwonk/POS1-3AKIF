import java.util.Scanner;

public class Trigonometrie{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double bogenmass, grad, sinx, cosx, ergebnis;
        System.out.println("----Trigonometrie----");
        System.out.println("Bitte Grad eingeben:");
        grad = s.nextDouble();
        bogenmass = grad*Math.PI/180;
        sinx = Math.sin(bogenmass);
        cosx = Math.cos(bogenmass);
        ergebnis = sinx*sinx + cosx*cosx;
        System.out.println("Sinus: " +sinx+ " Cosinus: " +cosx+ "Ergebnis: " +ergebnis+ " Bogenmass: " +bogenmass);
    }
}