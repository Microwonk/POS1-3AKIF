import java.util.Scanner;

public class Fakultaet {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        int i, n, fak;

        System.out.println("--Fakultraetsrechner--");
        System.out.print("Geben Sie n an: ");
        n = scan.nextInt();
        System.out.println();

        i = 0;
        fak = 1;

        do {
            if (n==0) {
                i++;
            }
            else {
                fak = fak * n;
                n--;
            }
        } while (n>=i);
        
        System.out.println("Ihre Fakultaet ist: " + fak);

        scan.close();
    }
}