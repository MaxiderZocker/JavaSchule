import java.util.Scanner;

class Aufgabe3 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		double x, y, am, hm;
		
		System.out.println("Geben sie x ein:");
		x = scan.nextDouble();	
		System.out.println("Geben sie y ein:");
		y = scan.nextDouble();
		
		am = (x + y) / 2;
		
		hm = 2 / ( 1.0 / x + 1.0 / y);
		
		System.out.println("Ahrithmetisches Mittel: " + am);
		System.out.println("Harmonisches Mittel: " + hm);
	}
}