import java.util.Scanner;

public class Logarithmus
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double input, calc;

        System.out.println("Geben Sie eine Double ein:");
        input = scan.nextDouble();
        calc= Math.log(input)/Math.log(2);

        System.out.println("Der Zweierlogartihmus von "+input+" ist: " + calc);
        scan.close();
    }
}