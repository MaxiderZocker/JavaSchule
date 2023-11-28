import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int n, anzahl, q, k;
		anzahl=1;
		q=0;
		k=0;
		
		System.out.println("Geben sie n ein:");
		n = scan.nextInt();
		
		while (n>=anzahl)
		{
			q = q+(anzahl*anzahl);
			k = k+(anzahl*anzahl*anzahl);
			anzahl++;
		}
		System.out.println("Die Quadratsumme ist: "+q);
		System.out.println("Die Kubiksumme ist: "+k);
		scan.close();
		
	}
}