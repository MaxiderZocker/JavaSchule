
public class Merino extends Meerschweinchen {
	double haarlaenge;
	boolean scheu;
	static int Tieranzahl;
	
	//Konstruktor1
	public Merino()
	{
		Merino.Tieranzahl=Merino.Tieranzahl+1;
		this.haarlaenge=7;
		this.scheu=false;
	}
	 //Konstruktor2
	public Merino(boolean svar)
	{
		Merino.Tieranzahl=Merino.Tieranzahl+1;
		this.haarlaenge=10;
		this.scheu=svar;
	}
	 //Konstruktor3
	public Merino(boolean svar, double var)
	{
		Merino.Tieranzahl=Merino.Tieranzahl+1;
		this.haarlaenge=var;
		this.scheu=svar;
	}
	
	public double gethaarlaenge()
	{
		return this.haarlaenge;
	}
	public void sethaarlaenge(double x)
	{
		this.haarlaenge = x;
	}
	
	public boolean getscheu()
	{
		return this.scheu;
	}
	public void setscheu(boolean x)
	{
		this.scheu = x;
	}
	
	public void fressen()
	{
		System.out.println("Das Merino ist satt!\n");
		Vollgefressen=true;
	}
}
