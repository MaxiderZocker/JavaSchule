class Aufgabe2
{
  public static void main ( String[] args )
  {
    int[] arr = {13, -4, 82, 17};
    int[] doppelt= {0, 0, 0, 0};

    System.out.println( "Urspruengliches Array: "
        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );
    
    doppelt[0]=arr[0]*2;
    doppelt[1]=arr[1]*2;
    doppelt[2]=arr[2]*2;
    doppelt[3]=arr[3]*2;
   
    System.out.println( "Neues Array: "
        + doppelt[0] + " " + doppelt[1] + " " + doppelt[2] + " " + doppelt[3] );
   }
}