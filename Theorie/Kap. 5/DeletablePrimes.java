import java.math.BigInteger;
import java.util.Scanner;

public class DeletablePrimes {
   
   private static int ways;
   
   public DeletablePrimes() {
      //sets the number of ways to zero
      ways = 0;
   }

   /**
    * starting method
    */

   private static void start() {
      Scanner scan = new Scanner(System.in);
      String prime = "0";


      //loop for initial Prime
      while (true) {
         System.out.println("A Prime number: ");
         prime = scan.nextLine();
         if (!isPrime(prime)) {
            System.out.println("Not a Prime!!");
         }
         else break;
      }
      scan.close();
      
      //controls, whether the prime given is single digit or not
      if (prime.length() == 1) {
         System.out.println("Prime of one digit, cannot be deletable!");
      } 
      else {
         deletablePrimeWays(prime);
         System.out.println("Ways: " + ways);
      }
      return;
   }

      /**
    * removes a certain character of the index from String primeNumber
    * @param primenumber
    * @param index
    * @return the new String, which has the charAt index removed
    */

    private static String removeByIndex(String primeNumber, int index) {
      return new StringBuilder(primeNumber).deleteCharAt(index).toString();
   }
   
   /**   
    * checks if a number is prime or not, from input of String (With Biginteger.isProbablePrime)
    * @param checkPrime
    * @return
    */

   private static boolean isPrime (String checkforPrime) {
      BigInteger checkedPrime = new BigInteger(checkforPrime);
      return checkedPrime.isProbablePrime(1);
   }
   

   /**
    * recursive Function to calculate the ways a Prime can be deletable to a single digit Prime number
    * @param prime
    */
    
   private static void deletablePrimeWays (String prime) {
      int i = 0;
      String temp;
      
      //as long as i is smaller than the length of the Prime
      while (i < prime.length()) {
      
         if (prime.length() == 1) {
            //counts the ways if the length is 1
            ways++;
         }
         else {
            //sets new String of temp
            temp = removeByIndex(prime, i);

            if (isPrime(temp)) {
               //recursive call of deletablePrimeWays
               deletablePrimeWays(temp);
            }
         }
         i++;
      }
      return;
   }
   
   //main
   public static void main(String[] args) {
      start();
      return;
   }
}