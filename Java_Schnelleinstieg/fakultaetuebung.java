import java.util.Scanner;

public class fakultaetuebung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie n! an:");
        int x = scan.nextInt();

        System.out.println();
        System.out.println(fak(x));

        scan.close();
    }

    public static int fak (int x) {
        if (x != 0) {
            int erg = x - 1;
            while (erg > 0) {
                x = x * erg;
                erg--;
            }
            return x;
            
        } else {
            return 1;
        }
    }
}
