import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int anzahl, inte, ende;
		ende = 0;
				
		System.out.println("wie viele integer sollen addiert werden?");
		anzahl = scan.nextInt();
		
		while (anzahl > 0)
		{
			System.out.println("Geben sie einen Integer ein:");
			inte = scan.nextInt();
			
			ende = ende + inte;
			anzahl = anzahl - 1;
		}
		
		System.out.println(ende);
		scan.close();
	}
}