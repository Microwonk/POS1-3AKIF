import java.util.Scanner;

public class fakultaetfunktionLONG {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Geben Sie n! an:");
        long x = scan.nextLong();

        System.out.println();
        System.out.println(fak(x));

        scan.close();
    }

    public static long fak (long x) {
        if (x != 0) {
            return x * fak(x-1); //maximale Fakultaet liegt bei 20! (Overflow bei 21!) 11246! ist ein crash
        }
        else {
            return 1;
        }
    }
}
