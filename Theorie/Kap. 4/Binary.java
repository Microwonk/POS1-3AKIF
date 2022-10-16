import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stelle, stellen, i;
        long dezi;
        String binary;

        
        stelle = 0;
        dezi = 0;
        i = 1;

        System.out.println("---------Binärrechner---------");
        
        while (i == 1) {
            System.out.print("Geben Sie eine Binäre Zahl ein: ");
            binary = scan.next();
            stellen = binary.length();

            if (binary.contains("1")&&binary.contains("0")) {

                while (stellen > 0) {

                    if (Character.getNumericValue(binary.charAt(stelle)) != 0) { 
                        
                        dezi = dezi + (int) Math.pow(2, stellen-1);
                    }
                    stellen--;
                    stelle++;
                    i = 0;
                }
            }

            else {
                System.out.println("Keine Binärzahl, geben Sie noch einmal ein.");
                System.out.println();
            }
        }

        System.out.println();
        System.out.println("Ihre Binärzahl lautet " + dezi + " im dezimal System.");

        scan.close();
        return;
    }
}
