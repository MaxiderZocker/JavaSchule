
public class testt {
	public static void main (String[] args)
	{
		int zahl = 5643;
		int ziffer;
		while (zahl !=0)
		{
			ziffer = zahl%10;
			System.out.println(ziffer);
			zahl/=10;
		}
	}
}
