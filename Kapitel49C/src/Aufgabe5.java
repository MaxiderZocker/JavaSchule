import java.io.* ;

class Aufgabe5
{

  public static void main ( String[] args ) throws IOException
  {
    int[][] data = { {3, 2, 5},
                   {1, 4, 4, 8, 13},
                   {9, 1, 0, 2},
                   {0, 2, 6, 3, -1, -8} };

    // max und min deklarieren


    // Summe berechnen
    for ( int zeile=0; zeile < data.length; zeile++)
    {
      int max=0;
      for ( int spalte=0; spalte <data[zeile].length; spalte++)
      {
    	  if (data[zeile][spalte]>max)
    	  {
    		  max=data[zeile][spalte];
    	  }
      }
      System.out.println("Maximum in Zeile "+zeile+": "+max);
    }
  }
}