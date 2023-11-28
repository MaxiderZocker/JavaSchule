import java.util.Scanner;

class Aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int gewicht;
		double versand;
		gewicht = 1;
		
		while (gewicht!=0)
		{
			System.out.println("Gewicht der Sendung:");
			gewicht = scan.nextInt();
			
			versand=3.0;
			
			if (gewicht>10)
			{
				gewicht=gewicht-10;
				
				versand=versand+(gewicht*0.25);
				System.out.println("Versandkosten: "+versand);
			}
			else if (gewicht<=10 && gewicht!=0)
			{
				System.out.println("versandkosten: "+versand);
			}
		}
		System.out.println("bye");
		scan.close();
	}
}