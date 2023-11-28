import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe4 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger Fact = new BigInteger("1");
		BigInteger I = new BigInteger("0");
		long n = 0;
		long fact = 1;
		long i = 0;
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		n = N.longValue();
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		while (dings=!I.equals(N))
		{
			I = I.add(new BigInteger(""+1));
			Fact = Fact.multiply(I);
		}
		
		while (i!=n)
		{
			i ++;
			fact = fact*i;
		}
		
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("Long: "+fact);
		System.out.println("Big: "+Fact);
		System.out.println("Time: "+end);
		
	}

}
