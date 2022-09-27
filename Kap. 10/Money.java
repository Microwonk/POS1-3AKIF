import java.util.Scanner;

public class Money {
    public static void main(String[] args) {
        System.out.println("Geben sie Cent ein: ");
        Scanner s = new Scanner(System.in);
        int m, d, c;
        m = s.nextInt();
        d = m/100;
        c = m%100;
        System.out.println("Das ergibt " +d+ " Dollar und " +c+ " Cent.");
    }
}