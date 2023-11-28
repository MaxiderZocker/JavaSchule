import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe7 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger M = new BigInteger("0");
		BigInteger GCD = new BigInteger("1");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		System.out.println("Geben sie ein M ein:");
		M = scan.nextBigInteger();
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		GCD = N.gcd(M);
		
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("GCD: "+GCD);
		System.out.println("Time: "+end);
		
	}

}
