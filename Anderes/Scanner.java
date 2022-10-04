import java.util.Scanner;
class IntDivisionTest
{
  public static void main (String[] args)
  {
    Scanner scan = new Scanner( System.in );

    int dividend, divisor ;    // int Version des Inputs
    int quotient, rest ;       // Ergebnisse von "/" und "%"

    System.out.println("Dividend eingeben:");   // Dividend lesen
    dividend = scan.nextInt();

    System.out.println("Divisor eingeben:");    // Divisor lesen
    divisor  = scan.nextInt();

    quotient = dividend / divisor ;              // Quotient bilden
    rest = dividend % divisor ;

    System.out.println( dividend + " / " + divisor + " ist " + quotient );
    System.out.println( dividend + " % " + divisor + " ist " + rest );
    System.out.println( quotient + " * " + divisor +
        " + " + rest + " ist " + (quotient*divisor+rest) );
  }
}