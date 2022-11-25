import java.lang.Array;
import java.util.Arrays;
import java.util.Scanner;

//https://leetcode.com/problems/convert-the-temperature/

public class  Convert_The_Temperature {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Temp in Celsius: ");
        double input = scan.nextDouble();
        scan.close();

        double[] tempconverted = convertTemp(input);

        String output = Arrays.toString(tempconverted);

        System.out.println(output);
    }

    public static double[] convertTemp (double celsius) {
        double kelvin = celsius + 273.15;
        double fahrenheit = celsius * 1.8 + 32;

        double[] arr = {kelvin, fahrenheit};

        return arr;
    }
}