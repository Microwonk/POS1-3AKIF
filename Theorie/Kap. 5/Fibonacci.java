import java.util.Scanner;

public class Fibonacci {
    
    int c = 0, i = 0, j = 1, nummerfolgt;
    
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
            System.out.println(nummerfolgt + " ");
            c++;
            FibonacciFunction(n--);
        }
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie weit soll die Zahl berechnet werden? (int)");

        //n als anzahl der sequenzen, aufruf der Funktion FibonacciFunction(n); mit parametern i (zahl) und n (anzahl)

        int num = scan.nextInt();
        scan.close();
        Fibonacci f = new Fibonacci();

        System.out.println("Fibonacci series is ");
        f.FibonacciFunction(num);
    }
}

/*class Fibonacci
{
	int c=0,i=0,j=1,next;
	void fib(int n)
	{
	if(n>0)
	{
	    if(c<=1)
	      next=c;
	    else
	    {
		next=i+j;
		i=j;
		j=next;
	    }
	    System.out.print(next+" ");
	    c++;
	    fib(--n);
	}
	}
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter number of terms");
	int num=sc.nextInt();
	Fibonacci f=new Fibonacci();
	System.out.println("Fibonacci series is ");
	f.fib(num);
	}
}*/