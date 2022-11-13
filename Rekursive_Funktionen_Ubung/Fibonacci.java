import java.util.Scanner;

public class Fibonacci {
    
	//globale int anlage, außerhalb FibonacciFunction

    int c = 0, i = 0, j = 1, nummerfolgt;


	/*
	 * Errechnet die Nummerfolge der Fibonacci Sequenz mit n abläufen
	 * 
	 * @param n Anzahl der Abläufe der Fibonacci Sequenz
	 */
    
    void FibonacciFunction (int n) {

        if (n > 0) {
            if (c <= 1) {
                nummerfolgt = c;
            }
            else {
                nummerfolgt = i + j;
                i = j;
                j = nummerfolgt;
            }
            System.out.println(nummerfolgt);
            c++;
            FibonacciFunction(--n);
        }
    }

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie weit soll die Zahl berechnet werden? (int)");

        //n als anzahl der sequenzen, aufruf der Funktion FibonacciFunction(n); mit parametern i (zahl) und n (anzahl)

        int num = scan.nextInt();
        scan.close();
        Fibonacci f = new Fibonacci();

        System.out.println("Fibonacci Sequenz von mit der Anzahl " + num + " ist: ");
        f.FibonacciFunction(num);
    }
}
