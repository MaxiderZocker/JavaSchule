import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int zahl, end;
		
		System.out.println("Startwert:");
		zahl = scan.nextInt();
		System.out.println("Endwert:");
		end = scan.nextInt();
		
		while (zahl <= end)
		{
			System.out.println(zahl);
			zahl = zahl+1;
		}
		scan.close();
	}
}