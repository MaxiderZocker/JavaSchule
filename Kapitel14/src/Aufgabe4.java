import java.util.Scanner;

class Aufgabe4 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		
		int vr, vl, hr, hl;
		final int ug = 35;
		final int og = 45;
		boolean druckok = true;
		
		System.out.println("Reifendruck vorne rechts:");
		vr = scan.nextInt();
		if (vr <= ug || vr >= og)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs");
			druckok = false;
		}
		System.out.println("Reifendruck vorne links:");
		vl = scan.nextInt();
		if (vl <= ug || vl >= og)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs");
			druckok = false;
		}
		System.out.println("Reifendruck hinten rechts:");
		hr = scan.nextInt();
		if (hr <= ug || hr >= og)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs");
			druckok = false;
		}
		System.out.println("Reifendruck hinten links:");
		hl = scan.nextInt();
		if (hl <= ug || hl >= og)
		{
			System.out.println("Warnung: Der Reifendruck ist auﬂerhalb des erlaubten Bereichs");
			druckok = false;
		}
		
		if (vr == vl && hr == hl && druckok == true)
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