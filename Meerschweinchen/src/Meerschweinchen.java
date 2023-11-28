
public class Meerschweinchen {
	//Instanzvariablen
	String Rasse;
	double Bauchumfang;
	boolean Vollgefressen=false;
	static int Tieranzahl;
	
	public void fressen()
	{
		System.out.println("Das Meerschweinchen ist satt!\n");
		Vollgefressen=true;
	}
	//Konstruktor1
	public Meerschweinchen()
	{
		Meerschweinchen.Tieranzahl=Meerschweinchen.Tieranzahl+1;
		this.Bauchumfang=7;
		this.Rasse="Dünn";
	}
	 //Konstruktor2
	public Meerschweinchen(String svar)
	{
		Meerschweinchen.Tieranzahl=Meerschweinchen.Tieranzahl+1;
		this.Bauchumfang=10;
		this.Rasse=svar;
	}
	 //Konstruktor3
	public Meerschweinchen(String svar, double var)
	{
		Meerschweinchen.Tieranzahl=Meerschweinchen.Tieranzahl+1;
		this.Bauchumfang=var;
		this.Rasse=svar;
	}
	
	public String getRasse()
	{
		return this.Rasse;
	}
	public void setRasse(String x)
	{
		this.Rasse = x;
	}
	
	public double getBauchumfang()
	{
		return this.Bauchumfang;
	}
	public void setBauchumfang(double x)
	{
		this.Bauchumfang = x;
	}
}
