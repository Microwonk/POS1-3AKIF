import java.util.Scanner;

public class WG {
    public static void main(String[] args) {
        System.out.println("Geben Sie Wechselgeld ein: ");
        Scanner s = new Scanner(System.in);
        int m, d, q, di, n, c, x, y, z; //Variablen m through c == Wechselgeld; x y z Hilfsvariablen
        m = s.nextInt();
        d = m/100;
        x = m%100;
        q = x/25;
        y = x%25;
        di = y/10;
        z = y%10;
        n = z/5;
        c = z%5;
        System.out.println("Dollar: " +d+", Quarter: " +q+ ", Dime: " +dime+ ", Nickel: " +n+", Cent: "+c );
    }
}