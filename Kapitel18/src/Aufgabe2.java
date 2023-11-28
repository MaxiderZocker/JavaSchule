import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int og,ug,x,si,sa;
		x=1;
		si=0;
		sa=0;
		
		System.out.println("Untergrenze des Bereiches:");
		ug= scan.nextInt();		
		System.out.println("Obergrenze des Bereiches:");
		og = scan.nextInt();
		
		while (x!=0)
		{
			System.out.println("Daten Eingeben:");
			x = scan.nextInt();
				
			if (x>=ug && x<=og)
			{
				si=si+x;
			}
			else
			{
				sa=sa+x;
			}
			
		}
		System.out.println("Summe der Werte innerhalb des Bereiches:"+si);
		System.out.println("Summe der Werte außerhalb des Bereiches:"+sa);
		scan.close();
	}
}