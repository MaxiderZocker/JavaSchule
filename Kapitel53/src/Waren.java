class Waren
{
  private String beschreibung;
  private double preis;
  private int anzahl;

  Waren( String beschreibung, double preis, int anzahl )
  {
    this.beschreibung = beschreibung;
    this.preis        = preis;
    this.anzahl		  = anzahl;
  }

  void anzeigen()
  {
    System.out.println( "\nArtikel: " + beschreibung + " Preis: " + preis + " Anzahl: " + anzahl);
  }
  
  public double getPreis()
  {
	  return this.preis;
  }
  
  public void setPreis(double x)
  {
	  this.preis=x;
  }
  
  public int getAnzahl()
  {
	  return this.anzahl;
  }
  
  public void setAnzahl(int x)
  {
	  this.anzahl=x;
  }
  
}