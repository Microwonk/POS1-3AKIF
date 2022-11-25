
public class DeletablePrimesDemo.java {

    static boolean checkprime(int n)
    {
        // If n is 1
        if (n == 1) {
            return false;
        }
 
        // If n is 2 or 3
        if (n == 2 || n == 3) {
            return true;
        }
 
        // If n is multiple of 2, 3 or 6
        else if (n % 2 == 0 || n % 3 == 0
                 || n % 6 == 0) {
            return false;
        }
 
        // Traversing till sqrt(n)
        for (int i = 6; i * i <= n; i += 6) {
            if (n % (i - 1) == 0
                || n % (i + 1) == 0) {
                return false;
            }
        }
        return true;
    }

    static HashSet<Integer> Primes
        = new HashSet<>();

    public static int test(String number, ) {
        if (!isPrime(number.filterIndexed { i, c -> i !in excluded }.toLong())) return 0
        if (excluded.size == number.length) return 0
        if (excluded.size == number.length - 1) return 1
        var sum = 0
        for (i in 0 until number.length) {
            if (i !in excluded) {
                excluded.add(i)
                sum += test(number, excluded)
                excluded.remove(i)
            }
        }
        return sum;
    }

    fun main() = level { input ->
        val number = input.next()
        val excluded = HashSet<Int>()
        val result = test(number, excluded)
        output(result)
    }
}