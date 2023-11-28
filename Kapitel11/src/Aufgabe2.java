import java.util.Scanner;

class Aufgabe2 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		double g, e, z;
		
		g = 9.81;
		
		System.out.println("Geben sie die Anzahl der Sekunden ein:");
		z = scan.nextDouble();
		
		e = (1.0/2) * g * z * z;
		System.out.println("Die Entfernung beträgt: " + e + "Meter");
		
	}
}