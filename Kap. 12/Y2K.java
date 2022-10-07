import java.util.Scanner;

public class Y2K {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int gebj, aktj, erg;

        System.out.println("Geburtsjahr:");
            gebj = s.nextInt();
        System.out.println("Aktuelles Jahr:");
            aktj = s.nextInt();

      
        if ((aktj>=0&&aktj<100)&&(gebj<100&&gebj>=0)) {  //sinnvolle eingabe überprüfen

            if (aktj>gebj) {
                erg = aktj-gebj;                         // falls das Geburtsjahr nicht um die Jahrhundertwende liegt
                System.out.println("Ihr Alter ist: "+erg);
            }
            else { 
                erg = (100-gebj)+aktj;                  // falls das Geburtsjahr und Aktuelle Jahr über ein Jahrhundert geht
                System.out.println("Ihr Alter ist: "+erg);
            }
         }
         else {
            System.out.println("Bitte Jahreszahlen ziwschen 00-99 eingeben."); //else fall, der nicht sinnvolle eingaben ausschließt
         }
         s.close();
    }
}