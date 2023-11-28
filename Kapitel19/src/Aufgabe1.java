import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int monate;
		double n,betrag,abbezahlt;
		betrag=1000;
		monate=1;
		
		System.out.println("Geben sie den Monatlichen Betrag ein:");
		n = scan.nextDouble();
		abbezahlt=0;
		
		while (betrag>0)
		{
			betrag=betrag+betrag*0.015;			
			betrag=betrag-n;
			abbezahlt=abbezahlt+n;
			
			System.out.print("Monate: "+monate+"\t");
			System.out.print("Saldo: "+betrag+"\t");
			System.out.println("Gesamtbetrag: "+abbezahlt);
			
			monate++;
		}
		scan.close();
	}
}