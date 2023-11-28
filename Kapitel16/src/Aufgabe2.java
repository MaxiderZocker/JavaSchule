import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		double ergebnis;
		int n, anzahl;
		anzahl = 1;
		ergebnis = 0.0;
		
		System.out.println("Geben sie n ein:");
		n = scan.nextInt();
		
		while (n >= anzahl)
		{
			ergebnis = ergebnis+(1.0/anzahl);
			anzahl ++;
		}
		System.out.println("Die Summe ist: "+ergebnis);
		scan.close();
		
	}
}