import java.math.BigInteger;
import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

import java.io.File;
import java.io.IOException;
import java.io.PrintWriter;

public class FindingDeletables {


    static File delPrimes = new File ("C:/Users/gschm/Documents/GitHub/POS1-3AKIF/Theorie/Kap. 5/delPrimes.txt");
    static PrintWriter outPrint = new PrintWriter(delPrimes);
    static int ways = 0;
    static int maxWays = 0;
    static String maxDeletablePrime;

    private static String removeByIndex(String primeNumber, int index) throws IOException {
        return new StringBuilder(primeNumber).deleteCharAt(index).toString();
     }

     private static boolean isPrime (String checkforPrime) {
        BigInteger checkedPrime = new BigInteger(checkforPrime);
        return checkedPrime.isProbablePrime(1);
     }

     private static void getDeletablePrime (String prime) {
        int i = 0;
        String temp;
        
        while (i < prime.length()) {
        
           if (prime.length() == 1) {
                ways++;
           }
           else {
              temp = removeByIndex(prime, i);
              if (isPrime(temp)) {
                  getDeletablePrime(temp);
                }
            }
            i++;
        }
    }
    
    private static void iteratePrimes (long maxPrime) throws IOException {
        String prime;
        long res = 13;
        
        while (res <= maxPrime) {
            prime = Long.toString(res);
            if (isPrime(prime)) {
                getDeletablePrime(prime);
            
                if (ways > 0) {
                    //Faulty code, sometimes the ways aren't counted correctly, please rely on my Theorie/Kap.5/DeletablePrimes Program to find out the ways for the given number(s)
                    System.out.println(ways + " way(s) for: " + res);
                }
                if (ways > maxWays) {
                    maxWays = ways;
                    maxDeletablePrime = prime;
                }
            }
            ways = 0;
            res += 2;
        }
     }

     public static void main(String[] args) throws IOException {
        Scanner scan = new Scanner(System.in);

        System.out.println("Up to what number should the deletable Primes be calculated?");
        long restrictor = scan.nextLong();
        scan.close();

        iteratePrimes(restrictor);
        
        //Faulty code, the Ways are not accurate enough (+- 1 - 2)

        System.out.println("The maximum amount of ways in the range 0-" + restrictor + " was " + maxWays + " with the smallest number of " + maxDeletablePrime + "(the Ways may vary +- 1-2, please refer to DeletablePrimes.java to check the ways)");
        
     }
}