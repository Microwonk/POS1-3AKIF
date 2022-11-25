import java.util.Scanner;

public class Fibonacci {
    
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
        System.out.println("Wie weit soll die Zahl berechnet werden? (int)");
		
        //n als anzahl der sequenzen, aufruf der Funktion FibonacciFunction(n); mit parametern i (zahl) und n (anzahl)
		
        int num = scan.nextInt();
        scan.close();
		
        System.out.println("Fibonacci series is " + FibonacciFunction(num));
    }

	/**
	 * Errechnet die Zahl der Fib. Sequenz an der nten Stelle
	 * 
	 * @param n Anzahl der zu berechenden Stellen
	 * @return Zahl an der nten Stelle der Fib.  Sequenz
	 */
	
	public static int FibonacciFunction (int n) {

		if ((n == 0) || (n == 1)) {
			return n;
		}
		else {
			return FibonacciFunction(n - 2) + FibonacciFunction(n - 1);
		}
	}
}

