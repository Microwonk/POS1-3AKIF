import java.util.Scanner;

public class WG {
    public static void main(String[] args) {
        System.out.println("Geben Sie Wechselgeld ein: ");
        Scanner s = new Scanner(System.in);
        int m, d, q, di, n, c, rest; //Variablen m through c == Wechselgeld; x y z Hilfsvariablen
        m = s.nextInt();

        d = m/100;
        rest = m%100;
        q = rest/25;
        rest = rest%25;
        di = rest/10;
        rest = rest%10;
        n = rest/5;
        c = rest%5;
        System.out.println("Dollar: " +d+", Quarter: " +q+ ", Dime: " +di+ ", Nickel: " +n+", Cent: "+c );
        s.close();
    }
}