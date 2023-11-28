import java.io.* ;

class Aufgabe2
{

  public static void main ( String[] args ) throws IOException
  {
    int[][] data = { {3, 2, 5},
                   {1, 4, 4, 8, 13},
                   {9, 1, 0, 2},
                   {0, 2, 6, 3, -1, -8} };

    // Summe deklarieren
    int summe;

    // Summe für jede Zeile berechnen
    for ( int zeile=0; zeile < data.length; zeile++)
    {
      // Summe initialisieren
    	summe=0;
      // Summe für diese Zeile berechnen
      for ( int spalte=0; spalte < data[zeile].length; spalte++)
      {
    	  summe=summe+data[zeile][spalte];
      }

      // Summe für diese Zeile ausgeben
      System.out.println("Die Summe von Zeile "+(zeile+1)+" beträgt: "+summe);
    }


  }
}