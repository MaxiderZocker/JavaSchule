import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		final double gebuehr = 0.15;
		int giro, spar;
		
		System.out.println("Geben sie den Betrag des Girokontos in $ ein:");
		giro = scan.nextInt();
		System.out.println("Geben sie den Betrag des Sparkontos in $ ein:");
		spar = scan.nextInt();
		
		if (giro >= 1000 || spar >= 1500)
		{
			System.out.println("Es wird eine Gebühr von: " + gebuehr + "$ erhoben.");
		}
		else
		{
			System.out.println("Es wird keine Gebühr erhoben.");
		}
		scan.close();
	}
}