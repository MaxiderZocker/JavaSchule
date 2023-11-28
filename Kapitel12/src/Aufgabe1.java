import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int cent;
		double preis;
		
		System.out.println("Geben sie den Preis in Cent ein:");
		cent = scan.nextInt();
		
		if (cent >= 1000)
		{
			preis = (cent + 0.0) * 0.9;
			System.out.println("Discountpreis: " + preis + " Cent");
		}
		else
		{
			preis = cent;
			System.out.println("Es konnte kein Discountpreis genommen werden. Ihre Kosten bleiben bei: " + preis + " Cent");
		}
	}
}