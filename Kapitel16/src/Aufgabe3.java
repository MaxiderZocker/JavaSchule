import java.util.Scanner;

class aufgabe3 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		int n, anzahl;
		double xi, xiq, durch, durchq, durchdurch, sd, sxi, sxiq;
		anzahl = 1;
		sd = 0.0;
		sxi = 0.0;
		sxiq = 0.0;
		xiq = 0.0;
		
		System.out.println("Geben sie n ein:");
		n = scan.nextInt();
		
		while (n>=anzahl)
		{
			System.out.println("Geben sie die "+anzahl+". Zahl ein:");
			xi = scan.nextDouble();
			xiq = xi*xi;
			sxi = sxi+xi;
			sxiq = sxiq+xiq;
			anzahl ++;
		}
		durch = sxi/n;
		durchq = sxiq/n;
		durchdurch = durch*durch;
		sd = Math.sqrt(durchq-durchdurch);
		System.out.println("Die standartabweichung ist: "+sd);
		scan.close();
		
	}
}