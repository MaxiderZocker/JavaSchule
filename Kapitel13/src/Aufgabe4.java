import java.util.Scanner;

class Aufgabe4 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		String name;
		int staerke, gesundheit, glueck, summe;
		
		System.out.println("Willkommen zu Yertle's Schatzsuche");
		System.out.println("Geben Sie den Namen der Spielfigur ein:");
		name = scan.nextLine();
		System.out.println("Stärke eingeben (1-10):");
		staerke = scan.nextInt();
		System.out.println("Gesundheit eingeben (1-10):");
		gesundheit = scan.nextInt();
		System.out.println("Glück eingeben (1-10):");
		glueck = scan.nextInt();
		
		summe = staerke+gesundheit+glueck;
		if (summe > 15)
		{
			System.out.println("Sie haben Ihrer Spielfigur zu viele Punkte gegeben!");
			staerke = 5;
			gesundheit = 5;
			glueck = 5;
		}
		System.out.print(name+", Stärke: ");
		System.out.print(staerke+", Gesundheit: ");
		System.out.print(gesundheit+", Glück: ");
		System.out.print(glueck);
	}
}