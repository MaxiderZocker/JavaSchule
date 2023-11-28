import java.util.Scanner;

class Aufgabe4 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int u,r;
		double i;
		
		System.out.println("Geben sie die Spannung ein:");
		u = scan.nextInt();
		System.out.println("Geben sie den Wiederstand ein:");
		r = scan.nextInt();
		
		i = (u + 0.0)/r;
		
		System.out.println("Die Stromstärke beträgt " + i + " Ampere");
	}
}