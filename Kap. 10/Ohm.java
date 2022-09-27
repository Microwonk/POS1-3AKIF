import java.util.Scanner;

public class Ohm {
    public static void main(String[] args) {
        int u, r;
        double i;
        Scanner s = new Scanner(System.in);
        System.out.println("Gib U an:");
        u = s.nextInt();
        System.out.println("Gib R an:");
        r = s.nextInt();
        i = (u+0.0)/r;
        System.out.println("Die Stromstaerke betraegt: " +i);
    }
}