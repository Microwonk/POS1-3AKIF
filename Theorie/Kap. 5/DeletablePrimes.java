import java.math.BigInteger;

public class DeletablePrimes {
   public static void main(String[] args) {
      BigInteger prime = new BigInteger("4567");

      System.out.println(isPrime(prime));
      deletablePrimeNums(prime);
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

   static void deletablePrimeNums (BigInteger prime) {
      int j = 0;
      String primeInt = prime.toString();

      while (primeInt.length()-1 >= j) {

         StringBuilder sb = new StringBuilder(primeInt);
         sb.deleteCharAt(j);
         primeInt = sb.toString();

         int temp = Integer.parseInt(primeInt);

         if (isPrime(BigInteger.valueOf(temp))) {
            deletablePrimeNums(BigInteger.valueOf(temp));
         }
         else {
            return;
         }
         j++;
      }
      if (primeInt.length() == 1){
         System.out.println("+1");
      }
   }
}