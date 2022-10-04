import java.util.Scanner;

class BWM
{
	public static void main(String[] args) {
	Scanner s =new Scanner(System.in);
	System.out.println("BWM RECHNER -- Prozentzahlen in 0.00 Angeben");
	System.out.println("Was ist der Kilo/Stückpreis deines Produktes?");
	double Preis = s.nextDouble();
	System.out.println("Wie viele Kilo/Stücke musst du kaufen?");
	double Menge = s.nextDouble();
	System.out.println("Mengenrabatt in 3% = 0.03 (falls Kein Rabatt, schreibe 0)");
	double MRabatt = s.nextDouble();
	System.out.println("Anderer Rabatt in 5% = 0.05 (falls kein Rabatt, schreibe 0)");
	double ARabatt = s.nextDouble();
	System.out.println("Fakturenspesen:");
	double Spesen = s.nextDouble();
	System.out.println("Skonto in 9% 0.09 (falls kein Skonto, schreibe 0)");
	double Skonto = s.nextDouble();
	System.out.println("Andere Kosten:");
	double Kosten = s.nextDouble();
	
	double Ergebnis = ((Preis*Menge*(1-MRabatt)*(1-ARabatt))+Spesen)*(1-Skonto)+Kosten;
	double SErgebnis = Ergebnis/Menge;
	System.out.println("Dein Insgesamtpreis ist " + Ergebnis + " und dein Stück/Kilopreis beträgt " + SErgebnis + "!");
	}
}