import java.io.* ;

class Aufgabe1
{

  public static void main ( String[] args ) throws IOException
  {
    int[][] data = { {3, 2, 5},
                   {1, 4, 4, 8, 13},
                   {9, 1, 0, 2},
                   {0, 2, 6, 3, -1, -8} };

    // Summe deklarieren
    int summe=0;


    // Summe berechnen
    for ( int zeile=0; zeile < data.length; zeile++)
    {
    	
      for ( int spalte = 0; spalte < data[zeile].length; spalte++)
      {
    	  summe+=data[zeile][spalte];
      }
    }

    // Summe ausgeben
    System.out.println("Die Summe beträgt: "+summe);

  }
}