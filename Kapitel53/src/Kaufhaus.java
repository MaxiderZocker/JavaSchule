public class Kaufhaus
{

  public static void main ( String[] args )
  {
    Waren         waren        = new Waren( "Tube", 1.40, 1 );
    Lebensmittel  lebensmittel = new Lebensmittel ( "Milch", 0.95, 1, 690 );
    Spielwaren    spiel        = new Spielwaren  ( "Lego", 24.45, 1, 8 );
    Buecher       buch         = new Buecher ( "Emma", 14.95, 1, "Austin" );

    waren.anzeigen();

    lebensmittel.anzeigen();

    spiel.anzeigen();
    System.out.println
      ("Die Steuer betraegt: " + spiel.berechneSteuer());

    buch.anzeigen();
    System.out.println
      ("Die Steuer betraegt: " + buch.berechneSteuer());
  }
}