import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe2 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger M = new BigInteger("0");
		BigInteger sum1 = new BigInteger("0");
		BigInteger sum2 = new BigInteger("0");
		BigInteger sumN = new BigInteger("0");
		BigInteger sumM = new BigInteger("0");
		BigInteger i = new BigInteger("0");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		N = N.subtract(new BigInteger("1"));
		i = N;
		System.out.println("Geben sie ein M ein:");
		M = scan.nextBigInteger();
		
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		while (dings=!i.equals(M))
		{
			i = i.add(new BigInteger(""+1));
			sum1 = sum1.add(i);
		}
		
		sumN = N.multiply(N.add(new BigInteger(""+1)));
		sumN = sumN.divide(new BigInteger(""+2));
		sumM = M.multiply(M.add(new BigInteger(""+1)));
		sumM = sumM.divide(new BigInteger(""+2));
		sum2 = sumM.subtract(sumN);
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("sum1: "+sum1);
		System.out.println("sum2: "+sum2);
		System.out.println("Time: "+end);
		
	}

}
