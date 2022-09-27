import java.util.Scanner;

public class circle{
    public static void main(String[] args) {
        System.out.println("Radiuseingabe:");
        Scanner s = new Scanner(System.in);
        int r;
        r = s.nextInt();
        double A;
        A = r*r*Math.PI;
        System.out.println("Flaeche: " +A);
    }
}