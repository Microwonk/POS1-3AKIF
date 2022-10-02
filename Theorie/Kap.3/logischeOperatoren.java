public class logischeOperatoren 
{
	public static void main (String[] args)
	{
		boolean a, b, c, d;
		a=true;
		b=false;
		c=true;
		
		System.out.println("a = " +a);
		System.out.println("b = " +b);
		System.out.println("c = " +c);
		System.out.println();

		d = !a;
		System.out.println("-Not");
		System.out.println("!a = "+d);
		System.out.println();
		
		d = a^b;
		System.out.println("-Exclusive-or, xor");
		System.out.println("a^b = "+d);

		d = a^c;
		System.out.println("a^c = "+d );
		System.out.println();
		
		d = a&b;
		System.out.println("-And");
		System.out.println("a&b = "+d);

		d = a&c;
		System.out.println("a&c = "+d);
		System.out.println();
		
		d =!a|c;
		System.out.println("-Or");
		System.out.println("!a|c = "+d);

		d =a|b;
		System.out.println("a|b = "+d);

		d = a|c;
		System.out.println("a|c = "+d);
		System.out.println();
		
		d =a&&b;
		System.out.println("-And SCE");
		System.out.println("a&&b = "+d);

		d =a&&c;
		System.out.println("a&&c = "+d);
		System.out.println();
		
		d =!a||c;
		System.out.println("-Or SCE");
		System.out.println("!a||c = "+d);

		d =a||b;
		System.out.println("a||b = "+d);
		
		d =a||c;
		System.out.println("a||c = "+d);
	
	
	}
}