import java.util.Scanner;

import javax.sound.sampled.SourceDataLine;

public class Bestellung {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int schraubenmenge, mutternmenge, unterlegscheibenmenge, erg;

        final int schrauben = 5;
        final int muttern = 3;
        final int unterlegscheiben = 1;

        System.out.println("Anzahl der Schrauben:");
        schraubenmenge = scan.nextInt();
        System.out.println("Anzahl der Muttern:");
        mutternmenge = scan.nextInt();
        System.out.println("Anzahl der Unterlegscheiben:");
        unterlegscheibenmenge = scan.nextInt();

        erg = (schraubenmenge*schrauben)+(mutternmenge*muttern)+(unterlegscheibenmenge*unterlegscheiben);
        System.out.println();

        if (schraubenmenge<mutternmenge) {
            System.out.println("Kontrollieren Sie ihre Bestellung!");
        }

        else{
            System.out.println("Gesamtbetrag: "+erg);
        }
    }
}