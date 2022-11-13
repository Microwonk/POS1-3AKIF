import java.util.*;

public class Staircase {
    
    public static void main(String[] args) {
        
        // scannt den input n, um die gesamten Stufen herauszufinden

        System.out.print("n: ");
        int n = new Scanner(System.in).nextInt();
        
        System.out.println("Number of Possibilities: " + NumOfPoss(n));
    }

    /*
     * Errechnet die Insgesamten Möglichkeiten eine Treppe mit n Stufen hochzugehen, mit den Möglichkeiten 2 oder 1 Stufe auf einmal zu gehen
     * 
     * @param n Anzahl der Stufen, welche Möglichkeiten ausgerechnet werden
     * @return Anzahl an Möglichkeiten für n Stufen
     */

    public static int NumOfPoss (int n) {
    
        // falls bei einer Rekursiven Berechnung n == 0 kommen sollte, heißt das, dass eine Möglichkeit gefunden wurde, return 1 für eine Möglichkeit
        // falls bei einer Rekursiven Berechnung n < 0 kommen sollte, heißt das, dass n überschritten wurde, also return 0 für keine Möglichkeit

        if (n == 0) {
            return 1;
        }
        else if (n < 0) {
            return 0;
        }

        // falls bei einer Rekursiven Berechnung n noch größer 0 sein sollte, werden Möglichkeiten n-2, n-1 Rekursiv berechnet, mit innenahme von oberen Argumenten

        else {
            return NumOfPoss(n-2) + NumOfPoss(n-1);
        }
    }
}
