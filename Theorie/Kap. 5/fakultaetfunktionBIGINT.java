import java.math.BigInteger;
import java.util.Scanner;

public class fakultaetfunktion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie n! an:");
        BigInteger x = scan.nextBigInteger();

        System.out.println();
        System.out.println(fak(x));

        scan.close();
    }

    public static BigInteger fak (BigInteger x) {
        if (x != 0) {
            return x * fak(x);
        }
        else {
            return 1;
        }
    }
}
