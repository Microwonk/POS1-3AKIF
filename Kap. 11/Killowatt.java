import java.util.Scanner;

public class Killowatt 
{
    public static void main(String[] args) 
    {
        Scanner s = new Scanner(System.in);
        double cent, hour, erg;
        System.out.println("Geben Sie den Preis pro Kilowattstunde in Cent ein");
        cent = s.nextDouble();
        System.out.println("Geben Sie die Anzahl der Kilowattstunden im Jahr ein");
        hour = s.nextDouble();
        erg= (cent*hour)/100;
        System.out.println("Jahreskosten: "+ erg);
    }
}