import java.util.Scanner;

class Aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int posten,zeit;
		System.out.println("Wie viele posten wollen sie erhitzen?");
		posten = scan.nextInt();
		System.out.println("Wie lange ist die erhitzungszeit in sek?");
		zeit = scan.nextInt();
		
		if(posten == 0)
		{
			System.out.println("Sie können nicht null posten erhitzen.");
		}
		if(posten == 1)
		{
			System.out.println("Verwende sie die von ihnen genannte erhitzungszeit von:");
			System.out.println(zeit+" Sekunden");
		}
		if(posten == 2)
		{
			zeit = zeit+zeit/2;
			System.out.println("Verwenden sie eine um ca. 50% längere erhitzungszeit von:");
			System.out.println(zeit+" Sekunden");
		}
		if(posten == 3)
		{
			zeit = zeit*2;
			System.out.println("Verwenden sie eine doppelte erhitzungsdauer von:");
			System.out.println(zeit+" Sekunden");
		}
		if(posten > 3)
		{
			System.out.println("Es wird nicht empfohlen so viele posten gleichzeitig zu erhitzen.");
		}
	}
}