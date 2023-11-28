class Aufgabe1
{

  public static void main ( String[] args )
  {
    int[] array = {3, 2, 5, 7, 9, 12, 97, 24, 54};

    int summeg=0, summeug=0, summe=0;

    for ( int index = 0; index < array.length; index++ )
    {
    	if (array[index]%2==0) {
    		summeg=summeg+array[index];
    	}
    	else {
    		summeug=summeug+array[index];
    	}
    	summe=summe+array[index];
    }

    System.out.println("Summe: "+summe+" Gerade Summe: "+summeg+" Ungerade Summe: "+summeug);

  }
}