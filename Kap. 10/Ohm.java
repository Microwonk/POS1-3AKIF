import java.util.Scanner;

public class Ohm {
    public static void main(String[] args) {
        double i, u, r;
        Scanner s = new Scanner(System.in);
        System.out.println("Gib U an:");
        u = s.nextDouble();
        System.out.println("Gib R an:");
        r = s.nextDouble();
        i = u/r;
        System.out.println("Die Stromstaerke betraegt: " +i);
    }
}