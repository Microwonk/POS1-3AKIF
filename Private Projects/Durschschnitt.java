import java.util.Scanner;

public class Durschschnitt {
    public static void main(String[] args) {
        
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie viele Zahlen?");
        int runden = scan.nextInt();
        int i = runden;
        double durchschnitt = 0;
        double durchschnitt2 = 0;
        
        for (; i > 0; i--) {
            System.out.println("Ihre Zahl:");
            double eingabe = scan.nextDouble();

            durchschnitt = durchschnitt + eingabe;
            durchschnitt2 += eingabe*eingabe; 
        }

        durchschnitt = Math.pow(durchschnitt/runden, 2);
        durchschnitt2 = durchschnitt2/runden;

        double standardabweichung = Math.sqrt(durchschnitt2 - durchschnitt);

        System.out.println();
        System.out.println(standardabweichung);
    }
}
