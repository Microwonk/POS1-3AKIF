import java.util.Scanner;

public class Standardabweichung {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        int i;
        double increment, input, sum1, sum2, standartabweichung;

        System.out.println("Wie viele Zahlen:");
        increment = s.nextDouble();
        i = 1;
        sum1 = 0;
        sum2 = 0;

        while (i<=increment) {
            System.out.println("Geben Sie eine Gleitkommazahl ein:");
            input = s.nextDouble();
            sum1 = sum1+input;
            sum2 = sum2+Math.pow(input, 2);
            ++i;
        }
        sum1 = sum1/increment;
        sum2 = sum2/increment;
        standartabweichung = Math.sqrt(sum2-Math.pow(sum1, 2));

        System.out.println();
        System.out.println("Die Standartabweichung ist "+standartabweichung);
    }
}
