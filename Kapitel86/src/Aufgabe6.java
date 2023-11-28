import java.util.Scanner;
import java.math.BigInteger;
import java.math.*;

public class Aufgabe6 {
	
	
	public static void main(String[]args)
	{
		Scanner scan = new Scanner ( System.in );
		BigInteger N = new BigInteger("0");
		boolean a;
		System.out.println("Geben sie ein N ein:");
		N = scan.nextBigInteger();		
		long time1 = System.currentTimeMillis();
		a = isPrime(N);
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("Is N a Prime?"+a);
		System.out.println("Time: "+end);
		
	}
	
	public static Boolean isPrime( BigInteger N )
	{
	    BigInteger trial;
	    
	    trial = new BigInteger( "2" );
	    while ( trial.compareTo( N ) < 0 )
	    {

	    	if ( N.mod(trial).equals( BigInteger.ZERO ) )
	        {
	    	  return false;
	        }
	      
	    	trial = trial.add( BigInteger.ONE );
	    } 
	    return true;    
	}

}
