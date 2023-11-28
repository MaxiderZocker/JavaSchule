import java.util.Scanner;

class Aufgabe5 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int gb,aj,erg; //geburt, aktuell, ergebnis
		
		System.out.println("Geburtsjahr:");
		gb = scan.nextInt();
		System.out.println("Aktuelles Jahr:");
		aj = scan.nextInt();
		
		if (gb<aj)
		{
			erg=aj-gb;
			System.out.println("Ihr Alter ist: "+ erg);
		}
		else if (aj<=gb)
		{
			aj=aj+100;
			erg=aj-gb;
			System.out.println("Ihr ALter ist: " +erg);
		}
		
	}
}