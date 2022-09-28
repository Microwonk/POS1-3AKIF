import java.util.Scanner;

public class BMI {
    public static void main(String[] arguments) {
        double g, l, m, BMI;
        System.out.println("-----BMI Rechner-----");
        Scanner s = new Scanner(System.in);
        System.out.println("Gib dein Gewicht in KG an:");
        g = s.nextDouble();
        System.out.println("Gib deine Groesse in CM an:");
        l = s.nextDouble();
        m = l/100.0;
        BMI = g /(m*m);
        System.out.println();
        System.out.println("Dein BMI betraegt: " + BMI + ".");
    }
}