import java.util.Scanner;

class Aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int lang;
		String wort1, wort2;
		
		System.out.println("Geben sie das erste Wort ein:");
		wort1 = scan.nextLine();
		System.out.println("Geben sie das zweite Wort ein:");
		wort2 = scan.nextLine();
		
		lang = wort1.length();
		lang = lang+wort2.length();
		
		System.out.print(wort1);
		
		while (lang < 30)
		{
			System.out.print(".");
			lang ++;
		}
		
		System.out.print(wort2);
		
		scan.close();
	}
}