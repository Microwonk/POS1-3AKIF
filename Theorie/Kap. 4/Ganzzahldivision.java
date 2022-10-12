import java.util.Scanner;

public class Ganzzahldivision {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int q, x, y, r;
        q = 0;

        System.out.print("Geben Sie den Dividend ein: ");
        x = scan.nextInt();
        System.out.println();
        System.out.print("Geben Sie den Divisor ein: ");
        y = scan.nextInt();
        System.out.println();

        while (x>=y) {
            q++;
            x = x - y;
        }
        r = x;

        System.out.println("Quotient: " + q);
        System.out.println("Rest: " + r);

        scan.close();
        return;
    }
}
