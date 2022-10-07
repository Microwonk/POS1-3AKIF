import java.util.Scanner;

public class Addieren {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int increment, input, i, sum;

        System.out.println("Wie viele Integer sollen addiert werden:");
        increment = s.nextInt();
        i = 1;
        sum = 0;

        while (i<=increment) {
            System.out.println("Geben Sie einen Integer ein:");
            input = s.nextInt();
            sum = sum+input;
            ++i;
        }
        
        System.out.println();
        System.out.println("Die Summe ist "+sum);
    }
}
