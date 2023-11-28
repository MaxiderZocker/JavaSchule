class Aufgabe1
{
  public static void main ( String[] args )
  {
    int[] arr = {0, 1, 2, 3};

    int summe  = 0;
    for (int i = 0; i < arr.length; i++)
    {
        summe+=arr[i];
    }

    System.out.println( "Summe aller Zahlen = " + summe );

   }
}