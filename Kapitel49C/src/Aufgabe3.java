import java.io.* ;

class Aufgabe3
{

  public static void main ( String[] args ) throws IOException
  {
    int[][] data = { {3, 2, 5},
                     {1, 4, 4, 8, 13},
                     {9, 1, 0, 2},
                     {0, 2, 6, 3, -1, -8} };
    
    int length;
    length = 0;
    
    for(int counter = 0; counter < data.length; counter++)
    {
    	if(data[counter].length > length)
    	{
    		length = data[counter].length;
    	}
    }
    
    int[] sum = new int[length];


    for ( int zeile=0; zeile < data.length; zeile++)
    {

      for ( int spalte=0; spalte < data[zeile].length; spalte++)
      {
    	  sum[spalte] += data[zeile][spalte]; 
      }

    }

    for(int counter = 0; counter < length; counter++)
    {
    	System.out.println("Die Summe der Spalte " +(counter+1) +" ist " +sum[counter]);
    }

  }
}