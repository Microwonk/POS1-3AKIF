import java.util.Scanner;

public class fakultaetfunktionINT {
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
            return x * fak(x-1); //maximale Fakultaet liegt bei 16! (Overflow bei 17!) 17000! ist ein crash
        }
        else {
            return 1;
        }
    }
}
