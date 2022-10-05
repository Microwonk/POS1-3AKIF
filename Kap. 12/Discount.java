import java.util.Scanner;

public class Discount
{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        double eingabe, preis;
        
        System.out.println("Geben Sie den Gesamtbetrag in Cent ein:");
        eingabe= s.nextDouble();

        if (eingabe > 1000) 
        {
            preis = eingabe*0.9;
            System.out.println("Leider kein discount: " + preis);
        }
        else
        {
            preis = eingabe;
            System.out.println("Ihr Gesamtpreis beträgt: " + preis);
        }
    }
}