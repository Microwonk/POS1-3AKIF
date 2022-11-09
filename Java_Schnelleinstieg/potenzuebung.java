import java.util.Scanner;

public class potenzuebung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie n ein:");
        int a = scan.nextInt();
        System.out.println("Geben Sie die Hochzahl an:");
        int b = scan.nextInt();

        System.out.println();
        System.out.println(potenz(a, b));

        scan.close();
    }

    public static int potenz(int a, int b) {
        if (b>0) {
            return a * potenz(a, b-1);
        }
        else {
            return 1;
        }
    }
}