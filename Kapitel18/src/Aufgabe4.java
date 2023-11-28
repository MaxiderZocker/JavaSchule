import java.util.Scanner;

class Aufgabe4 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int x1,x2,y1,y2,breite,hoehe,flaeche;
		boolean go;
		go=true;
	
		while (go==true)
		{
			breite=0;
			hoehe=0;
			flaeche=0;
			System.out.println("Erster Eckpunkt X-Koordinate:");
			x1 = scan.nextInt();
			if (x1==0)
			{
				go=false;
			}
			System.out.println("Erster Eckpunkt Y-Koordinate:");
			y1 = scan.nextInt();
			if (y1==0)
			{
				go=false;
			}
			System.out.println("Zweiter Eckpunkt X-Koordinate:");
			x2 = scan.nextInt();
			if (x2==0 || x2==x1)
			{
				go=false;
			}
			System.out.println("Zweiter Eckpunkt Y-Koordinate:");
			y2 = scan.nextInt();
			if (y2==0 || y2==y1)
			{
				go=false;
			}
			if (go==true)
			{
				breite=Math.abs(x2-x1);
				hoehe=Math.abs(y2-y1);
				flaeche=breite*hoehe;
			}
			
			System.out.print("Breite: "+breite);
			System.out.print(" Höhe: "+hoehe);
			System.out.println(" Fläche: "+flaeche);
			System.out.println();
		}
		System.out.println("Fertig!");
		scan.close();
		
	}
}