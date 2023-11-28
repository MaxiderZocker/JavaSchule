import java.util.Scanner;

class Aufgabe2 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		final int schraube = 5; 
		final int mutter = 3;
		final int unter = 1; //Unterlegscheiben
		int as, am, au, gesamt; // a = Anzahl, s = Schraube, m = Mutter, u = Unterlegscheibe
		
		System.out.println("Anzahl der Schrauben:");
		as = scan.nextInt();
		System.out.println("Anzahl der Muttern:");
		am = scan.nextInt();
		System.out.println("Anzahl der Unterlegscheiben:");
		au = scan.nextInt();
		if (as > am)
		{
			System.out.println("Kontrollieren sie Ihre Bestellung!");
		}
		else
		{
			System.out.println("Die Bestellung ist Okay");
		}
		
		gesamt = as*schraube+am*mutter+au*unter;
		System.out.println();
		System.out.println("Gesamtbetrag: " + gesamt);
	}
}