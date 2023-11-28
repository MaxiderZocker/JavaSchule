public class Artikel
{
	String  artikelNr;
	String  bezeichnung;  // Artikelbezeichnung
	double  einkaufspreis;
	int     lagerzeit;    // in Monaten

	final double  HANDELSSPANNE = 0.6; // 60 Prozent des EK
	final double  MWST          = 0.19;

	// Konstruktor
	public Artikel( String artNr, String bez, double ekpreis, int zeit )
	{
		artikelNr     = artNr;   bezeichnung = bez;
		einkaufspreis = ekpreis; lagerzeit   = zeit;
	}

	public void anzeigen()
	{
		System.out.println( artikelNr+" \""+bezeichnung+"\" EK: "+einkaufspreis+" VK: "+berechneVerkaufspreis()+" Euro"+" Lagerzeit: "+lagerzeit+" Monate");
	}

	public double berechneVerkaufspreis()
	{
		double netto, mwst;
		netto = einkaufspreis + einkaufspreis * HANDELSSPANNE;
		mwst  = netto * MWST;
		return (netto + mwst);
	}
}