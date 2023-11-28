class Aufgabe4
{
  public static void main ( String[] args )
  {
    int[] arrA   = { 13, -22,  82,  17};
    int[] arrB   = {  0,   0,   0,   0};

    arrB[0]=25-arrA[0];
    arrB[1]=25-arrA[1];
    arrB[2]=25-arrA[2];
    arrB[3]=25-arrA[3];
    
    System.out.println( "arrA: "
        + arrA[0] + " " + arrA[1] + " " + arrA[2] + " " + arrA[3] );

    System.out.println( "arrB: "
        + arrB[0] + " " + arrB[1] + " " + arrB[2] + " " + arrB[3] );

    System.out.println( "Summe:  "
        + (arrA[0]+arrB[0]) + " " + (arrA[1]+arrB[1]) + " "
        + (arrA[2]+arrB[2]) + " " + (arrA[3]+arrB[3]) );
   }
}