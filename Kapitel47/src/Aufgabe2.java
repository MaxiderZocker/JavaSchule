class Aufgabe2
{

  public static void main ( String[] args )
  {
    int[] array = {3, 1, 5, 7, 4, 12, -3, 8, -2};

    int ein=0, zwe=0, temp=0;


    for ( int index=0 ; index < array.length; index++)
    {
    	temp=array[index];
    	if (temp>zwe) {
    		zwe=temp;
    	}
    }
    
    for ( int inde=0 ; inde < array.length; inde++)
    {
    	temp=array[inde];
    	if (temp<zwe&&temp>ein) {
			ein=temp;
		}
    }

    System.out.println("Größte Zahl: "+zwe+" Zweitgrößte Zahl: "+ein);

  }
}