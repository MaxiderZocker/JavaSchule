import java.util.Scanner;

class Aufgabe2 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int monate;
		double wirkstoff;
		monate=1;
		wirkstoff=100;
		
		while (wirkstoff>=50)
		{
			wirkstoff=wirkstoff-wirkstoff*0.04;
			
			System.out.print("Monate: "+monate+"\t");
			
			if (wirkstoff<50)
			{
				System.out.print("Wirkstoffgehalt: "+wirkstoff+"\t");
				System.out.println("ABGELAUFEN!");
			}
			else
			{
				System.out.println("Wirkstoffgehalt: "+wirkstoff);
			}
			
			monate++;
		}
		
		scan.close();
	}
}