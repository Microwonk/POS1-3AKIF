
//https://leetcode.com/problems/roman-to-integer/

import java.util.*;

public class Roman_to_Integer {

    public static void main(String args[]) {
        Scanner scan = new Scanner(System.in);  

        System.out.println("Bitte geben Sie eine roemische Zahl ein: "); 
        String romanNum = scan.nextLine();
        scan.close();

        //Aufruf des Umrechners
        System.out.println("Die dekadische Wertigkeit betraegt "+ convertRomanToInt(romanNum));   
    }   

    /**
     * 
     * @param valat der character, der auf bestimmte Werte geprueft wird
     * @return in abhaengigkeit von valat, die Zahl die zurueckgegeben werden soll
     */

    public static int value(char valat) {
        if (valat == 'I') {
            return 1;
        }      
        if (valat == 'V') {
            return 5;
        } 
        if (valat == 'X') {
            return 10;
        }  
        if (valat == 'L') {
            return 50;
        }
        if (valat == 'C') {
            return 100;
        }
        if (valat == 'D') {
            return 500;
        }
        if (valat == 'M') {
            return 1000;
        }
        else {
            return -1;
        }
    }

    /**
     * Errechnet mithilfe der Liste int value den Wert der roemischen Zahl
     * 
     * @param s der String, der eingelesen wird
     * @return Die dekadische Zahl der Wertigkeit des Strings
     */

    public static int convertRomanToInt(String s) {

        int sum = 0; 
        
        //iterative vorgehensweise, indem man von links nach rechts das value des chars einliest
        for (int i=0; i<s.length(); i++) {   

            int s1 = value(s.charAt(i)); 
            
            if (i+1 <s.length()) {   
                int s2 = value(s.charAt(i+1));   

                //vergleicht das momentane Symbol mit dem rechts davon
                if (s1 >= s2) {   
                    sum = sum + s1;   
                }   
                else {
                    sum = sum - s1;   
                }   
            }   
            else {   
                sum = sum + s1;   
            }   
        }   
        return sum;   
    }
}