import java.math.BigInteger;
import java.util.Scanner;

public class fakultaetfunktion {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie n! an:");
        int x = scan.nextInt();

        System.out.println("int rekursiv:");
        System.out.println(fakint(x));
        System.out.println();

        System.out.println("Geben Sie n! an:");
        int z = scan.nextInt();

        System.out.println("long rekursiv:");
        System.out.println(faklong(z));
        System.out.println();

        System.out.println("Geben Sie n! an:");
        BigInteger y = new BigInteger("7000");

        System.out.println("biginteger rekursiv");
        System.out.println(fakbigint(y));

        scan.close();
    }

    public static int fakint (int x) {
        if (x != 0) {
            return x * fakint(x-1);
        }
        else {
            return 1;
        }
    }
    
    public static int faklong (int z) {
        if (z != 0) {
            return z * faklong(z-1);
        }
        else {
            return 1;
        }
    }

    public static BigInteger fakbigint (BigInteger y) {
        if (y.compareTo(BigInteger.ZERO) == 1) {
            return y.multiply(fakbigint(y.subtract(BigInteger.ONE)));
        }
        else {
            return BigInteger.ONE;
        }
    }
}
