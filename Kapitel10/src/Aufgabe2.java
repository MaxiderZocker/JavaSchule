import java.util.Scanner;

class Aufgabe2 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int eingabe, dollar, cent;
	
		System.out.println("Geben Sie die Cent ein:");
		eingabe = scan.nextInt();
    	dollar = eingabe / 100;
    	cent = eingabe % 100;

    	System.out.println("Das ergibt " + dollar + " Dollar und " + cent + " Cent.");
  }
}