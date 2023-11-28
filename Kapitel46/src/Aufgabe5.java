class Aufgabe5
{
  public static void main ( String[] args )
  {
    int[] arr = {0, 1, 2, 3};
    int temp;

    System.out.println( "Urspruengliches Array: "
        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );

    temp=arr[0];
    arr[0]=arr[3];
    arr[3]=temp;
    
    temp=arr[1];
    arr[1]=arr[2];
    arr[2]=temp;

    System.out.println( "Umgekehrtes Array: "
        + arr[0] + " " + arr[1] + " " + arr[2] + " " + arr[3] );
   }
}