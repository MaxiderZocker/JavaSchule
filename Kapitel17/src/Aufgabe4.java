class Aufgabe4 {
	public static void main (String[] args)
	{
		int leer,leern,stern,sternn,anzahl;
		leer=7;
		stern=1;
		anzahl=0;
		
		while (anzahl<8)
		{
			leern=leer;
			sternn=stern;
			while (leern>anzahl)
			{
				System.out.print(" ");
				leern--;
			}
			
			System.out.print("*");
			if (anzahl==0)
			{
				
			}
			
			else
			{
				while (sternn>1)
				{
					System.out.print("**");
					sternn--;
				}
			}
			stern++;
			anzahl++;
			System.out.println();
		}
		
		anzahl=1;
		while (anzahl<=3)
		{
			leern=leer-1;
			sternn=1;
			while(leern>0)
			{
				System.out.print(" ");
				leern--;
			}
			while (sternn<=3)
			{
				System.out.print("*");
				sternn++;
			}
			System.out.println();
			anzahl++;
		}
	}
}