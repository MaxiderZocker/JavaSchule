import java.util.Scanner;
import java.util.Random;

class test {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner( System.in );
		Random rand = new Random();
		int r,e,z,d,v,f,s,c;
		double n;
		e=0;
		z=0;
		d=0;
		v=0;
		f=0;
		s=0;
		c=1;	
		
		while (true)
		{
			n=0;
		r=rand.nextInt(6);
		if (r==1)
		{
			e=e+r;
		}
		if (r==2)
		{
			z=z+r;
		}
		if (r==3)
		{
			d=d+r;
		}
		if (r==4)
		{
			v=v+r;
		}
		if (r==5)
		{
			f=f+r;
		}
		if (r==6)
		{
			s=s+r;
		}
		n=(e+z+d+v+f+s)/c;
		System.out.println(n);
		c++;
		}
		
		
	}
}