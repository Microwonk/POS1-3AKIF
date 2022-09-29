import java.util.Scanner;

public class Handy{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double gb, min, uegb, uemin, p; //ueberschrittene gb und min
        System.out.println("----Handyrechnung----");
        System.out.println("Geben Sie ihre verbrauchten GB an:");
        gb = scan.nextDouble();
        System.out.println("Bitte Minuten eingeben:");
        min = scan.nextDouble();
        uegb = gb%10;
        uemin = min%1000;
        p = (9.99+uegb*1.5)+uemin*0.2;
        System.out.println("Der Preis des Handyvertrags: " + p);
    }
}