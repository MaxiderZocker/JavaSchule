import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int anfang,ende,gallonen;
		double mpg;
		boolean neu = true;
		
		while (neu == true)
		{
			System.out.println("Programm Meilen pro Gallone");
			System.out.println("Anfangsstand Meilen:");
			anfang = scan.nextInt();
		
			if (anfang>=0)
			{
				System.out.println("Endstand Meilen:");
				ende = scan.nextInt();
				System.out.println("Gallonen");
				gallonen = scan.nextInt();
			
				mpg = (ende-anfang)/gallonen;
				System.out.println("Meilen pro Gallone: "+mpg);
			}
			else 
			{
				System.out.println("bye");
				neu=false;
			}
		}
		scan.close();
	}
}