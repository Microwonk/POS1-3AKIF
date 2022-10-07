import java.util.Scanner;

public class Ziegelstein
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double sekunden, ergebnis;

        System.out.println("Geben Sie den die Anzahl der Sekunden ein:");
        sekunden = scan.nextDouble();
        ergebnis = (1/2.0)*9.81*sekunden*sekunden;

        System.out.println("Die Entfernung e beträgt: "+ergebnis+ " Meter");
        scan.close();
    }
}