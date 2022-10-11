import java.util.Scanner;

public class Twowords {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String wort1, wort2;
        int length1, length2, i;

        System.out.println("Geben Sie das erste Worte ein:");
        wort1 = s.next();
        System.out.println("Geben Sie das zweite Worte ein:");
        wort2 = s.next();
        length1 = wort1.length();
        length2 = wort2.length();
        i = 0;

        System.out.println();
        System.out.print(wort1);

        while ((length1+length2+i)<30) {
            System.out.print(".");
            i = i+1;
        }
        System.out.print(wort2);
        s.close();
    }
}
