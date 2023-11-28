import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int versand=2;
		final int express=5;
		String artikel;
		double preis, ergebnis;
		int ex;
		
		System.out.println("Geben sie den Artikel ein:");
	    artikel = scan.nextLine();
	    System.out.println("Geben sie den Preis ein:");
	    preis = scan.nextDouble();
	    System.out.println("Expressversand (0==nein, 1==ja):");
	    ex = scan.nextInt();
	    
	    System.out.println(artikel+": "+preis);
	    
	    if (preis >= 10)
	    {
	    	versand ++;
	    }
	    preis += versand;
	    
	    if (ex == 1)
	    {
	    	preis += express;
	    	versand += express;
	    }
		System.out.println("Versand: "+versand);
		System.out.println("Gesamt: "+preis);
	}
}