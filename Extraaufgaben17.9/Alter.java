import java.util.Scanner;

public class Alter{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String name;
        int jahr, gjahr, alterv, alterd;
        System.out.println("Wie heißt dein name?");
        name = scan.nextLine();
        System.out.println("Hallo "+name+", welches Jahr haben wir?");
        jahr = scan.nextInt();
        System.out.println("In welchem Jahr wurdest du geboren?");
        gjahr = scan.nextInt();
        alterd = jahr - gjahr;
        alterv = alterd-1;
        System.out.println(name+", wenn du heuer noch nicht Geburtstag hattest, bist du " + alterv +" Jahre alt, ansonsten bist du " +alterd);
    }
}