import java.util.Scanner;

public class Niederschlag{
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Niederschlag im April eingeben:");
        int april = s.nextInt();
        System.out.println("Niederschlag im Mai eingeben:");
        int mai = s.nextInt();
        System.out.println("Niederschlag im Juni eingeben:");
        int juni = s.nextInt();
        double durchschnitt = (april + mai + juni)/3.0;
        System.out.println("Durchschnitt des Niederschlags: " + durchschnitt);
    }
}