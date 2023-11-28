import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int luft,dampf;
		double effizienz;
		System.out.println("Geben Sie die Lufttemperatur ein:");
		luft = scan.nextInt();
		System.out.println("Geben Sie die Dampftemperatur ein:");
		dampf = scan.nextInt();
		
		effizienz = 1-luft/(dampf+0.0);
		
		if (dampf < 373)
		{
			effizienz = 0;
		}
		System.out.println("Die Effizienz beträgt: "+effizienz);
	}
}