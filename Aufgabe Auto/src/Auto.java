import java.util.Scanner;

public class Auto {
	
	Scanner scan = new Scanner( System.in );
	
	String Farbe;
	int Hubraum;
	double Hoechst;
	double Geschw;
	int Lang;
	int Jahr;
	
	//Konstruktor1
	public Auto()
	{
		this.Farbe="Weiﬂ";
		this.Hubraum=3000;
	}
	 //Konstruktor2
	public Auto(String svar)
	{
		this.Farbe=svar;
		this.Hubraum=3000;
	}
	 //Konstruktor3
	public Auto(String svar, int var)
	{
		this.Farbe=svar;
		this.Hubraum=var;
	}
	
	public double getHoechst()
	{
		return this.Hoechst;
	}
	public void setHoechst(double x)
	{
		this.Hoechst = x;
	}
	
	public int getLang()
	{
		return this.Lang;
	}
	public void setLang(int x)
	{
		this.Lang = x;
	}
	
	public int getJahr()
	{
		return this.Jahr;
	}
	public void setJahr(int x)
	{
		this.Jahr = x;
	}
	
	public void fahren()
	{
		System.out.println("Das Auto f‰hrt vorw‰rts.");
	}
	public void fahren(double x)
	{
		System.out.println("Das Auto f‰hrt mit "+x+" km/h vorw‰rts.");
	}
}
