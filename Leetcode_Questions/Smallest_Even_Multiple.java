
//https://leetcode.com/problems/smallest-even-multiple/

import java.util.Scanner;

public class Smallest_Even_Multiple {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Zahl: ");
        int input = scan.nextInt();
        scan.close();

        System.out.println(smallestEvenMultiple(input));
    }

    public static int smallestEvenMultiple(int n) {
        if (n%2 != 0) {
            n *= 2;
        }
        return n;
    }
}