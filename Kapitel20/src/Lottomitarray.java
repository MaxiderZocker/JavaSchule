import java.util.Random;

public class Lottomitarray {
	
	public static void main ( String[] args )
	{
		Random rand = new Random();
		int z=0,i=0;
		boolean[] lotto = new boolean[50];
		
		while (i<6)
		{
			z=(rand.nextInt(48)+1);
			if (lotto[z]==false)
			{
				lotto[z]=true;
				i++;
				System.out.println(i+" Zahl: "+z);
			}
			
		}

	}
}
