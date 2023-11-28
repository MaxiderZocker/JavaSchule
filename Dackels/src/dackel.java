public class dackel //schulterhöhe
{
	//Instanzvariablen
	int Alter;
	int Schulterhoehe;
	String Name;
	//Klassenvariablen
	static int anzahl;
	//Instanzmethoden
	public void bellen()
	{
		System.out.println
		("WauWau!\n");
	}
	public int getAlter()
	{
		return this.Alter;
	}
	public void setAlter(int x)
	{
		this.Alter = x;
	}
	
	public int getSchulterhoehe()
	{
		return this.Schulterhoehe;
	}
	public void setSchulterhoehe(int x)
	{
		this.Schulterhoehe = x;
	}
	
	public String getName()
	{
		return this.Name;
	}
	public void setName(String x)
	{
		this.Name = x;
	}
	
	public void laufen()
	{
		System.out.println("Der Hund läuft geradeaus \n");
	}
	
	public void fressen()
	{
		System.out.println("Der Hund frisst seinen Napf leer \n\n\n");
	}
	//Klassenvariabeln
	static void moreDackel()
	{
		dackel.anzahl = dackel.anzahl + 1;
	}
	
	//Konstruktor1
	public dackel()
	{
		System.out.println("Geburt eines Dackels!\n");
		dackel.anzahl=dackel.anzahl+1;
		this.Alter=1;
	}
	 //Konstruktor2
	public dackel(int var)
	{
		System.out.println("Geburt eines Dackels!\n");
		dackel.anzahl=dackel.anzahl+1;
		this.Alter=var;
		this.Name="Dackel";
	}
	 //Konstruktor3
	public dackel(int var, String svar)
	{
		System.out.println("Geburt eines Dackels!\n");
		dackel.anzahl=dackel.anzahl+1;
		this.Alter=var;
		this.Name=svar;
	}
}