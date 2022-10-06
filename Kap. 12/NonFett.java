import java.util.Scanner;

public class NonFett {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double A, proA, B, proB;

        System.out.println("Preis pro Pfund Packung A:");
        A = scan.nextDouble();
        System.out.println("Prozent mageres Fleisch Packung A:");
        proA = scan.nextDouble();

        System.out.println("Preis pro Pfund Packung B:");
        B = scan.nextDouble();
        System.out.println("Prozent mageres Fleisch Packung B:");
        proB = scan.nextDouble();

        A = A+(A-A*(proA/100.0));
        B = B+(B-B*(proB
        /100.0));

        System.out.println("Packung A koster pro Pfund mageres Fleisch: " +A);
        System.out.println("Packung B koster pro Pfund mageres Fleisch: " +B);

        if (A>B) {
            System.out.println("Packung B ist preiswerter");
        }
        else {
            if (A==B) {
                System.out.println("Es gibt keinen Unterschied");
            }
            else {
            System.out.println("Packung A ist preiswerter");
            }
        }
    }
}