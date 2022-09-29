import java.util.Scanner;

public class Cowsay{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String text;
        
        System.out.println("Bitte geben Sie einen Text ein!");
        text = scan.nextLine();
        System.out.println("Hier ihr ASCII-Bildchen:");
        System.out.println("______________");
        System.out.println("< " +text+ ">");
        System.out.println(" -------------");
    }
}