import java.util.Scanner;

//https://leetcode.com/problems/palindrome-number/

public class Palindrome_Number {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);

        System.out.println("Bitte geben Sie eine Integer ein: ");
        int x = s.nextInt();
        if (isPalindrome(x)) {
            System.out.println("Ihre Zahl " + x + " ist ein Palindrom.");
        }
        else
        System.out.println("Ihre Zahl " + x + " ist kein Palindrom.");
    }

    public static boolean isPalindrome(int x) {
        String xString = Integer.toString(x);
        int len = xString.length() - 1;
        String revString = "";
        
        while (len >= 0) {
            revString = revString + xString.charAt(len);
            len--;
        }

        if (xString.equals(revString)) {
            return true;
        }
        else
        return false;
    }
}