import java.util.Scanner;

public class Binary {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        char stellechar;
        int stelle, stellen;
        long dezi;
        String binary;

        System.out.println("---------Binärrechner---------");
        System.out.print("Geben Sie eine Binäre Zahl ein: ");
        binary = scan.next();
        stellen = binary.length();
        stelle = 0;
        dezi = 0;

        while (stellen > 0) {
            stellechar = binary.charAt(stelle);
            if (Character.getNumericValue(stellechar) != 0) {
                dezi = dezi + (int) Math.pow(2, stellen-1);
            }
            stellen--;
            stelle++;
        }
        System.out.println();
        System.out.println("Ihre Binärzahl " + binary + " lautet " + dezi + " im dezimal System.");

        scan.close();
        return;
    }
}
