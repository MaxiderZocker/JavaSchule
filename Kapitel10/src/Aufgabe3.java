import java.util.Scanner;

class Aufgabe3 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int eingabe, dollar, quarter, dime, nickel, cent;
	
		System.out.println("Geben Sie das Wechselgeld ein:");
		eingabe = scan.nextInt();
    	dollar = eingabe / 100;
    	eingabe = eingabe % 100; //rest von dollar
    	quarter = eingabe / 25;
    	eingabe = eingabe % 25; //rest von quarter
    	dime = eingabe / 10;
    	eingabe = eingabe % 10; //rest von dime
    	nickel = eingabe / 5;
    	eingabe = eingabe % 5; //rest von nickel
    	cent = eingabe / 1;
    	System.out.println("Das Wechselgeld ist " + dollar + " Dollar, " + quarter + " Quarter, " + dime + " Dime, " + nickel + " Nickel, " + cent + " Cent.");
  }
}