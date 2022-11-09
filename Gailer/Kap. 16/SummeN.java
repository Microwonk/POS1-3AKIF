import java.util.Scanner;

public class SummeN {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int n, i;
        double sum;

        System.out.println("Geben Sie n ein:");
        n = s.nextInt();
        i = 1;
        sum = 0;

        while (i<=n) {
            sum = sum+1.0/i;
            ++i;
        }
        System.out.println();
        System.out.println("Die Summe ist: " +sum);
        s.close();
    }
}