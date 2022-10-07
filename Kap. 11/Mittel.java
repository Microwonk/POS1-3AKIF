import java.util.Scanner;

public class Mittel
{
    public static void main(String[] args) 
    {
        Scanner scan = new Scanner(System.in);
        double x, y, A, H;
        
        System.out.println("Geben Sie x ein:");
        x = scan.nextDouble();
        System.out.println("Geben sie y ein:");
        y = scan.nextDouble();

        H = 2/(1/x+1/y);
        A = (x+y)/2;
        
        System.out.println("Arithmetisches Mittel: " + A);
        System.out.println("Harmonisches Mittel: " + H);
        scan.close();
    }
}