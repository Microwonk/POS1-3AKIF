import java.util.Scanner;

public class Wochenlohn{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double wl;
        int ws, ues, sl; //wochenstunden, überstunden, stundenlohn, wochenlohn
        System.out.println("----Wochenlohn----");
        System.out.println("Anzahl der Arbeitsstunden:");
        ws = scan.nextInt();
        System.out.println("Anzahl der Überstunden:");
        ues = scan.nextInt();
        System.out.println("Stundenlohn:");
        sl = scan.nextInt();
        wl = ws*sl+ues*sl*1.2;
        System.out.println();
        System.out.println("Dein Brutto Wochenlohn beträgt: " + wl);
    }
}