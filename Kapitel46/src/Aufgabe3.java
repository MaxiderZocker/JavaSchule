class Aufgabe3
{
  public static void main ( String[] args )
  {
    int[] arrA   = { 13, -22,  82,  17};
    int[] arrB   = {-12,  24, -79, -13};
    int[] summe  = {  0,   0,   0,   0};

    summe[0]=arrA[0]+arrB[0];
    summe[1]=arrA[1]+arrB[1];
    summe[2]=arrA[2]+arrB[2];
    summe[3]=arrA[3]+arrB[3];

    System.out.println( "Summe: "
        + summe[0] + " " + summe[1] + " " + summe[2] + " " + summe[3] );
   }
}