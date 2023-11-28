class Beispiel2
{
  public static void main ( String[] args )
  {
    long   arbeitsstunden = 40;
    double stundenlohn     = 10.0, steuersatz = 0.1;

    System.out.println("gearbeitete Stunden: " + arbeitsstunden );
    System.out.println("Bruttolohn: " + (arbeitsstunden * stundenlohn) );
    System.out.println("Steuerbetrag: " + (arbeitsstunden * stundenlohn * steuersatz) );
  }
}