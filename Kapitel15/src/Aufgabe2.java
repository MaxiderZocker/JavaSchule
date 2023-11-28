import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int laenge, zahl;
		String wort;
		zahl = 1;
		
		System.out.println("Geben sie ein Wort ein:");
		wort = scan.nextLine();
		System.out.println();
		
		laenge = wort.length();
		
		while (zahl <= laenge)
		{
			System.out.println(wort);
			zahl ++;
		}

		scan.close();
	}
}