class Lebensmittel extends Waren
{
  double kalorien;

  Lebensmittel( String beschreibung, double preis, int anzahl, double kalorien)
  {
    super( beschreibung, preis, anzahl );
    this.kalorien = kalorien ;
  }

  void anzeigen()
  {
    super.anzeigen();
    System.out.println( "Kalorien: " + kalorien );
  }
} 