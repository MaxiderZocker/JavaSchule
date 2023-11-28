import java.util.Scanner;

class Aufgabe4 {
	
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		double pa,pb,mfa,mfb,ergebnisa,ergebnisb; //preis, mageres fleisch
		
		System.out.println("Preis pro Pfund Packung A:");
		pa = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung A:");
		mfa = scan.nextDouble();
		System.out.println("Preis pro Pfund Packung B:");
		pb = scan.nextDouble();
		System.out.println("Prozent mageres Fleisch Packung B:");
		mfb = scan.nextDouble();
		
		mfa=mfa/100.0;
		mfb=mfb/100.0;
		ergebnisa=pa/mfa;
		ergebnisb=pb/mfb;
		
		System.out.println("Packung A kostet pro Pfund mageres Fleisch: "+ergebnisa);
		System.out.println("Packung B kostet pro Pfund mageres Fleisch: "+ergebnisb);
		
		if (mfa<mfb)
		{
			System.out.println("Packung A ist preiswerter");
		}
		else if (mfa>mfb)
		{
			System.out.println("Packung B ist preiswerter");
		}
		else
		{
			System.out.println("Beide packungen kosten gleich viel auf den mageren Fleischanteil.");
		}
		
	}
}