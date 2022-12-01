import java.math.BigInteger;
import java.util.Scanner;

public class DeletablePrimes {
   public static void main(String[] args) {
      Scanner scan = new Scanner(System.in);
      String prime;

      System.out.println("Geben Sie eine Primzahl ein: ");
      prime = scan.nextLine();
      scan.close();

      deletablePrimeNums(prime);
      System.out.println("Ways: " + ways);
   }

   //sets the number of ways to zero
   private static int ways = 0;


   /**
    * rekursive Funktion für die errechnung von den Wegen
    * @param prime
    */
   
   private static void deletablePrimeNums (String prime) {
      int i = 0;

      //solang i kleiner als die Länge der Zahl ist
      while (i < prime.length()) {
         //checks, if the number is prime or not
         if (isPrime(prime)) {

            if (prime.length() == 1) {
               //counts the ways if the length is 1
               ways++;
            }

            else {
               //sets new String of temp
               String temp = removeByIndex(prime, i);

               if (isPrime(temp)) {
                  //rekursiver Aufruf von deletablePrimeNums mit dem neuen String temp
                  deletablePrimeNums(temp);
               }
            }
         }
         i++;
      }
   }
   /**
    * removes a certain character of the index from String str
    * @param str
    * @param index
    * @return the new String, which has the charAt index removed
    */

   private static String removeByIndex(String str, int index) {
      return new StringBuilder(str).deleteCharAt(index).toString();
   }
   
   /**   
    * checks if a number is prime or not, from input of String (With Biginteger.isProbablePrime)
    * @param checkPrime the Number being checked for being a prime
    * @return true if a prime, false if not a prime
    */

   private static boolean isPrime (String checkPrime) {
      BigInteger prime = new BigInteger(checkPrime);
      return prime.isProbablePrime(1);
   }
}