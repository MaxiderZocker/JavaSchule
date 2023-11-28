import java.util.Scanner;

class Aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int anzahl,n,count;
		anzahl=1;
		
		System.out.println("Anfangszahl der Sterne:");
		n = scan.nextInt();
		
		while (n>=anzahl)
		{
			count=n;
			
			while (count>0)
			{
				System.out.print("*");
				count--;
			}
			System.out.println();
			n--;
		}
		scan.close();
	}
}