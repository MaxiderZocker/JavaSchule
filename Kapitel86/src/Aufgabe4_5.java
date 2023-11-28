import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe4_5 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		BigInteger R = new BigInteger("0");
		BigInteger FactN = new BigInteger("1");
		BigInteger FactR = new BigInteger("1");
		BigInteger C = new BigInteger("0");
		BigInteger I = new BigInteger("0");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();
		System.out.println("Geben sie ein R ein:");
		R = scan.nextBigInteger();
		boolean dings = true;
		
		long time1 = System.currentTimeMillis();
		
		while (dings=!I.equals(N))
		{
			I = I.add(new BigInteger(""+1));
			FactN = FactN.multiply(I);
		}
		I = I.subtract(I);
		while (dings=!I.equals(R))
		{
			I = I.add(new BigInteger(""+1));
			FactR = FactR.multiply(I);
		}
		
		C = FactN.divide(FactR.multiply(N.subtract(FactR)));
		
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println(N+" Things taken "+R+" at a time = "+C);
		System.out.println("Time: "+end);
		
	}

}
