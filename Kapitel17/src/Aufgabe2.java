import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int n, anzahl;
		double x, xn;
		anzahl=1;
		
		System.out.println("Geben sie x ein:");
		x = scan.nextDouble();
		System.out.println("Geben sie n ein:");
		n = scan.nextInt();
		
		if (n>0)
		{
			xn=1;
			
			while (n>=anzahl)
			{
				xn=xn*x;
				anzahl++;
			}
			System.out.println(x+" hoch "+n+" ergibt: "+xn);
		}
		
		else
		{
			System.out.println("n ist nicht Positiv!");
		}
		scan.close();	
	}
}