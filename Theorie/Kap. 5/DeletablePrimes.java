import java.math.BigInteger;

public class DeletablePrimes {
   public static void main(String[] args) {
      BigInteger prime = new BigInteger("4567");

   }

   /**   
    * 
    * @param checkPrime the Number being checked for being a prime
    * @return true if a prime, false if not a prime
    */

   static boolean isPrime (BigInteger checkPrime) {
      if (checkPrime.isProbablePrime(1)) {
         return true;
      }
      else {
         return false;
      }
   }

   static int counter = 0;

   static int deletablePrimeNums (BigInteger prime) {
      String primeString = prime;
      if (isPrime(prime)) {
         if (primeString.length() == 1) {
            return 1;
         }
         else {
            deletablePrimeNums(primeString);
         }
      }
   }
}