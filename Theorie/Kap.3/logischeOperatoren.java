import java.util.Scanner;

public class logischeOperatoren 
{
	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		boolean a, b;
		System.out.println("Gib einen Wahren oder Falschen Wert ein:");
		a=s.nextBoolean();
		System.out.println("Gib einen Wahren oder Falschen Wert ein:");
		b=s.nextBoolean();

		System.out.println();
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println();

		System.out.println("And:");
		System.out.println(a&&b);
		System.out.println();

		System.out.println("Or:");
		System.out.println(a||b);
		System.out.println();

		System.out.println("xOr");
		System.out.println(a^b);
		System.out.println();

		System.out.println("Negation:");
		System.out.println(!a);
		System.out.println(!b);
	}
}