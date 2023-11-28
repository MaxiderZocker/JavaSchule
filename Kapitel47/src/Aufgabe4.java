class Aufgabe4
{

  public static void main ( String[] args )
  {
    int[] signal  = {1, 5, 4, 5, 7, 6, 8, 6, 5, 4, 5, 4};
    int[] geglaettet = new int[signal.length];

    geglaettet[0]  = (signal[0]+signal[1])/2;
    for ( int j = 1; j<signal.length-1; j++ )
    {
    	geglaettet[j] = (signal[j-1]+signal[j]+signal[j+1])/3;
    }
    System.out.println(geglaettet.length);
    geglaettet[ signal.length-1 ] = (signal[signal.length-2]+signal[signal.length-1])/2;
    System.out.print("signal: ");
    // Geben Sie den Input aus
    for ( int j = 0; j < geglaettet.length; j++)
    {
    	System.out.print(signal[j]+" ");
    }
    System.out.println();
    System.out.print("geglaettet: ");
    // Geben Sie das Ergebnis aus
    for ( int j = 0; j < geglaettet.length; j++)
    {
    	System.out.print(geglaettet[j]+" ");
    }

  }
}