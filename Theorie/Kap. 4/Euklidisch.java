import java.util.Scanner;

public class Euklidisch {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        int a, b;

        System.out.print("Eingabe a: ");
        a = scan.nextInt();
        System.out.println();
        System.out.print("Eingabe b: ");
        b = scan.nextInt();
        System.out.println();

        while (b!=0) {
            if (a>b) {
                a = a-b;
            }
            else {
                b = b-a;
            }
        }
        System.out.println(a);
        scan.close();
        return;
    }
}