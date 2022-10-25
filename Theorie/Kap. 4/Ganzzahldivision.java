import java.util.Scanner;

public class Ganzzahldivision {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);

        int q, r, y;
        q = 0;

        System.out.print("Geben Sie den Dividend ein: ");
        r = scan.nextInt();
        System.out.println();
        System.out.print("Geben Sie den Divisor ein: ");
        y = scan.nextInt();
        System.out.println();

        while (r>=y) {
            r = r - y;
            q++;
        }

        System.out.println("Quotient: " + q);
        System.out.println("Rest: " + r);

        scan.close();
    }
}
