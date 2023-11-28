import java.util.Scanner;
import java.util.Random;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		Random rand = new Random();
		int n,r,g;
		boolean f;
		n=1;
		f=true;
		
		System.out.println("Ich denke an eine Zahl von 1 bis 10.");
		System.out.println("Sie haben 3 Versuche diese Zahl zu erraten.");
		System.out.println("Raten sie!");
		
		r=(rand.nextInt(10)+1);
		
		while (n<=3)
		{
			System.out.println("Versuch: "+n);
			g=scan.nextInt();
			if (g==r)
			{
				System.out.println("RICHTIG!");
				System.out.println("Sie haben das Spiel gewonnen.");
				return;
			}
			else
			{
				System.out.println("Falsch");
				f=false;
			}
			n++;
		}
		
		if (f==false)
		{
			System.out.println("Die richtige Zahl war "+r+".");
			System.out.println("Sie haben das Spiel verloren.");
		}
		scan.close();
	}
}