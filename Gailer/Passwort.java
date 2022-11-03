import java.util.Scanner;
import java.util.Random;

class PasswortGenerator
{
  public static void main ( String[] args )
  {
    Scanner scan = new Scanner( System.in );
    Random rand = new Random();
    int ziffern = 0;

    while ( ziffern < 5 )
    {
      System.out.println("Ihr Passwort muss mindestens aus 5 Zeichen bestehen.");
      System.out.print("Aus wie vielen Zeichen soll Ihr Passwort bestehen? ");
      ziffern = scan.nextInt();
    }

    String auswahl = "abcdefghijklmnopqrstuvwxyz" ;
    auswahl = auswahl + auswahl.toUpperCase() ;
    auswahl = auswahl + "1234567890!%&$*+-.:;" ;

    String passwort = "";
    int j = 0;
    while ( j < ziffern )
    {
      passwort = passwort + auswahl.charAt( rand.nextInt( auswahl.length() ) );
      j = j + 1;
    }

    System.out.println("Hier ist Ihr Passwort: " + passwort );
  }
}
