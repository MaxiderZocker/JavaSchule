import java.util.Scanner;

class Aufgabe4 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		double wert, ergebnis;
		
		System.out.println("Geben sie ein double ein:");
		wert = scan.nextDouble();
		
		ergebnis = Math.log(wert) / Math.log(2);
		
		System.out.println("Der Zweierlogarithmus von " + wert + " ist " + ergebnis);
	}
}