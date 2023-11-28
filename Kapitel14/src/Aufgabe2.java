import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int gewicht;
		
		System.out.println("Was ist ihr aktuelles Gewicht?");
		gewicht = scan.nextInt();
		
		if (gewicht >= 235 && gewicht < 265)
		{
			System.out.println("Sie dürfen teilnehmen!");
		}
		else if (gewicht < 235)
		{
			System.out.println("Sie sind leider zu leicht um an dem Wettbewerb teilnehmen zu dürfen.");
		} 
		else
		{
			System.out.println("Sie sind leider zu schwer um and dem Wettbewerb teilnehmen zu dürfen.");		
		}
		scan.close();
	}
}