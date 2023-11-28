import java.util.Scanner;

class Aufgabe1 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int radius;
		double ergebnis;

		System.out.println("Geben Sie den Radius ein:");
		radius = scan.nextInt();
    	ergebnis = radius * radius * Math.PI ; 

    	System.out.println("Der Radius ist: " + radius + " Die Fläche beträgt: " + ergebnis);
  }
}