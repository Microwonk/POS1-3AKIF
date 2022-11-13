import java.util.*;

public class DeletablePrimes {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int prime = 4567;
        System.out.println(isaPrime(prime));
        Primes(prime, isaPrime(prime));
    }

   static void Primes (int prime, boolean isaPrime) {
        int x = 0;
        int j = 0;

        while (prime>1) {
            isaPrime(prime-j);
            if (isaPrime) {
                x++;
            }
            j++;
        }
        System.out.println(x);
    }

    static boolean isaPrime (int prime) {
        int i = 2;
        while (prime != i && prime%i != 0) {
            i++;
            }

        if (i == prime) {
            return true;
        }

        else {
            return false;
        }
    }
}
