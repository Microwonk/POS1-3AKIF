import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int menuinput;

        do {
            System.out.println("-------------MENU-------------");
            System.out.println("Wählen sie durch Eingabe aus: ");
            System.out.println(" 1 - Eingabe");
            System.out.println(" 2 - Prüfen");
            System.out.println(" 3 - Ausgabe");
            System.out.println("___________");
            System.out.println(" 4 - Ende");

            System.out.print("Eingabe: ");
            menuinput = scan.nextInt();

            switch (menuinput) {
                case 1:
                System.out.println();
                System.out.println("Sie haben Eingabe ausgewählt.");
                System.out.println();
                break;
                case 2:
                System.out.println();
                System.out.println("Sie haben Eingabe ausgewählt.");
                System.out.println();
                break;
                case 3:
                System.out.println();
                System.out.println("Sie haben Eingabe ausgewählt.");
                System.out.println();
                    break;
                case 4:
                    break;
            
                default:
                System.out.println();
                System.out.println("Kein Befehl.");
                System.out.println();
                    break;
            }

        } while (menuinput != 4);
        
        scan.close();
    }
}
