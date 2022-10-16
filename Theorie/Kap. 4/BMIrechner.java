import java.util.Scanner;

public class BMIrechner {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        double kg, cm, BMIrechnung;
        String BMI;

        System.out.println("  -------BMI-Rechner-------");
        
        System.out.print("Geben Sie ihr Gewicht in kg an: ");
        kg = scan.nextDouble();
        System.out.println();

        System.out.println("Geben Sie ihre Groesse in cm an: ");
        cm = scan.nextDouble();
        System.out.println();

        BMIrechnung = kg / Math.pow((cm/100), 2);

        if (BMIrechnung<19) {
            BMI = "Untergewicht";
        }
        else if ((BMIrechnung>=26)&&(BMIrechnung<=30)) {
            BMI = "Uebergewicht";
        }
        else if (BMIrechnung>30) {
            BMI = "Adipositas";
        }
        else {
            BMI = "Normalgewicht";
        }
        System.out.println("Ihr BMI ist " + BMIrechnung + " und sie haben " + BMI);
        
        scan.close();
        return;
        
    }
}
