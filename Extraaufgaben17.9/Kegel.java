import java.util.Scanner;

public class Kegel{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double r, h, s, O, V;
        System.out.println("----Kegel----");
        System.out.println("Bitte r eingeben:");
        r = scan.nextDouble();
        System.out.println("Bitte h eingeben:");
        h = scan.nextDouble();
        s = h*h+r*r;
        O = r*r*Math.PI + r*Math.PI*s; //G = r^2*pi + M = r*pi*s
        V = (1/3.0)*Math.PI*r*r*h;
        System.out.println("Seitenlinie: " +s+ " Oberfläche: " +O+ "Volumen: " +V);
    }
}