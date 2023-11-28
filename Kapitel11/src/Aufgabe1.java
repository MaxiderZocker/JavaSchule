import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int stunden;
		double kosten, gesamt;
		
		System.out.println("Geben sie den Preis einer Kilowattstunde in Cent ein:");
		kosten = scan.nextDouble();
		System.out.println("Geben sie die Anzahl der Kilowattstunden pro Jahr ein:");
		stunden = scan.nextInt();
		
		kosten = kosten / 100; //cent in euro
		gesamt = stunden * kosten; //gesamtzeit in std
		
		System.out.println("Jahreskosten: " + gesamt);
		
	}
}