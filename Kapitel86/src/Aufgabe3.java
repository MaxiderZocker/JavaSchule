import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe3 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum2 = new BigInteger("0");
		BigInteger i = new BigInteger("0");
		BigInteger two = new BigInteger("2");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		while (i.compareTo(N) <= 0)
		{
			if (i.mod(two).equals(BigInteger.ONE))
			{
				sum1 = sum1.add(i);
			}
			i = i.add(new BigInteger("1"));
		}
		
		sum2 = N.multiply(N);
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("Sum of Odds: "+sum1);
		System.out.println("N^2: "+sum2);
		System.out.println("Time: "+end);
		
	}

}
