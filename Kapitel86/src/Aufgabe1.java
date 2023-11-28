import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe1 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum2 = new BigInteger("0");
		BigInteger i = new BigInteger("0");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		while (dings=!i.equals(N))
		{
			i = i.add(new BigInteger(""+1));
			sum1 = sum1.add(i);
		}
		
		sum2 = N.multiply(N.add(new BigInteger(""+1)));
		sum2 = sum2.divide(new BigInteger(""+2));
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
		System.out.println("Time: "+end);
		
	}

}
