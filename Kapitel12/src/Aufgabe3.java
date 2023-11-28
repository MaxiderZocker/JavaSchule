import java.util.Scanner;

class Aufgabe3 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int kap, mpg; // kap=kapazität, pro=prozent, mpg= meilen pro Gallone
		double pro, ergebnis;
		
		System.out.println("Tankkapazität:");
		kap = scan.nextInt();
		System.out.println("Benzinanzeige:");
		pro = scan.nextDouble();
		System.out.println("Meilen pro Gallone:");
		mpg = scan.nextInt();
		
		pro=pro/100.0;
		ergebnis=pro*kap;
		ergebnis=ergebnis*mpg;
		
		
		if (ergebnis < 200)
		{
			System.out.println("Tanken");
		}
		else
		{
			System.out.println("Weiterfahren");
		}
		
	}
}