import java.util.Scanner;

public class Hello {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        String eingabe;
        int length, i;

        System.out.println("Geben Sie ein Wort ein:");
        eingabe = s.next();
        
        length = eingabe.length();
        i = 0;

        System.out.println();

        while (i<length) {
            System.out.println(eingabe);
            i = i+1;
        }
        s.close();
    }
}
