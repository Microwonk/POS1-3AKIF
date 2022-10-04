import java.util.Scanner;

public class BegruessungsProgramm {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Wie lautet dein Vorname?");
        String vorname = scan.next();
        System.out.println("Wie lautet dein Nachname?");
        String nachname = scan.next();
        System.out.println("Wie alt bist du?");
        int alter = scan.nextInt();
        System.out.println("Woher kommst du?");
        String herkunft = scan.next();
        
        System.out.println("Hallo " + vorname + " " + nachname + "! Mich beeindruckt dein Alter von " + alter + " Jahren! Ich -Begruessungsprogramm- bin erst ein paar Momente alt, und komme nicht aus " + herkunft + ", im Gegensatz zu dir.");
    }
}