class Aufgabe3_1
{

  public static void main ( String[] args )
  {
    int[] arr = {1,2,3,4,5,6,7,8,9,10,11,12,13,14};
    int c = 0;
    for (int j = 0; j < arr.length/2; j++)
    {
        c = arr[j];
        arr[j] = arr[(arr.length - (1+j))];
        arr[(arr.length - (1+j))] = c;
    }

    for (int j = 0; j < arr.length; j++) 
    {
        System.out.println(arr[j]);
    }

  }
}