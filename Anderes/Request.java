import java.util.Scanner;

public class Request {
    public static void main(String[] args) {

        System.out.println ("Hallo Welt");

        Scanner scan = new Scanner(System.in); //Scanner muss importiert werden, und wird für eben System.in und eingabe verwendet

        System.out.println("Zahl: ");
        int zahl = scan.nextInt();

        System.out.println("Text: ");
        String text = scan.next();

        System.out.println(zahl +" "+ text);
    }
}