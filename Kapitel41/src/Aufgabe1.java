class Aufgabe1 {
	public static void main (String[] args)
	{
		double n, t;
		for (t=0; t<=25;t++)
		{
			n=220/(1+10*(Math.pow(0.83,t)));
			System.out.println(n+" Sheep");
		}
	}
}