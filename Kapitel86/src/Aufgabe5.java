import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe5 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		long N = 0;
		long i = 2;
		BigInteger temp1 = new BigInteger("0");
		BigInteger temp2 = new BigInteger("1");
		BigInteger temp3 = new BigInteger("0");
		System.out.println("Geben sie ein N ein:");
		N = scan.nextLong();		
		long time1 = System.currentTimeMillis();
		
		while (i <= N)
		{
			temp3=temp1.add(temp2);
			temp1=temp2;
			temp2=temp3;
			i++;
		}
		
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("Fibonacci Zahl: "+temp3);
		System.out.println("Time: "+end);
		
	}

}
