import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);

        int stelle, stellen;
        long dezi;
        String binary;

        
        stelle = 0;
        dezi = 0;

        System.out.println("---------Binärrechner---------");
        
        System.out.print("Geben Sie eine Binäre Zahl ein: ");
        binary = scan.nextLine();
        stellen = binary.length();

        while (stellen > 0) {
            if (Character.getNumericValue(binary.charAt(stelle)) == 1) { 
                dezi = dezi + (int) Math.pow(2, stellen-1);
                }

            stellen--;
            stelle++;
            }

        System.out.println();
        System.out.println("Ihre Binärzahl lautet " + dezi + " im dezimal System.");

        scan.close();
        return;
    }
}
