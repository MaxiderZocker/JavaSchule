import java.util.Scanner;

class Aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int vr, vl, hr, hl;
		
		System.out.println("Reifendruck vorne rechts:");
		vr = scan.nextInt();
		System.out.println("Reifendruck vorne links:");
		vl = scan.nextInt();
		System.out.println("Reifendruck hinten rechts:");
		hr = scan.nextInt();
		System.out.println("Reifendruck hinten links:");
		hl = scan.nextInt();
		
		if (vr == vl && hr == hl)
		{
			System.out.println("Reifendruck ist ok.");
		}
		else
		{
			System.out.println("Reifendruck ist nicht in ordnung.");
		}
		
		
		scan.close();
	}
}