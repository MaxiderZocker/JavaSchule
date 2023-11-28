public class Sonderposten extends Artikel 
{
	
	double rabattval;
	
	public Sonderposten( String artNr, String bez, double ekpreis, int zeit )
	{
		super(artNr, bez, ekpreis, zeit);
		if(zeit>=12)
		{
			rabattval=3;
		}
		else
		{
			rabattval=1;
		}
	}
	
	public void anzeigen()
	{
		System.out.println("\nSonderposten:");
		System.out.println(artikelNr+" \""+bezeichnung+"\" EK: "+einkaufspreis+" VK: "+berechneRabatt()+" Euro"+" Lagerzeit: "+lagerzeit+" Monate");
		System.out.println("(VK <alt>: "+berechneVerkaufspreis()+" Euro Rabatt: "+(rabattval*10)+"%)");
	}
	
	public double berechneRabatt()
	{
		double rabatt;
		rabatt=berechneVerkaufspreis()-(berechneVerkaufspreis()*rabattval/10);
		return(rabatt);
	}
}
