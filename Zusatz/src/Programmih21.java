//schreiben sie ein programm, dass ein 2d feld mit den typ int von den dimensionen 10x10 erzeugt.
//füllen sie das feld mit den zahlen 1-100. 
//lassen sie dann das feld als quadrat ausgeben mit 10 zahlen pro zeile dann werden alle slots mit 
//einer schleife quadriert und wieder als quadrat ausgegeben mit 10 zahlen pro zeile

import java.io.*;

class Programmih21 {
	public static void main (String[] args) throws IOException
	{
		int data[][] =new int[10][10];
		int z=0;
	    for ( int zeile=0; zeile < data.length; zeile++)
	    {
	    	
	    	for ( int spalte=0; spalte < data[zeile].length; spalte++)
	    	{
	    		z++;
	    		data[zeile][spalte]=z;
	    		data[zeile][spalte]=data[zeile][spalte]*data[zeile][spalte];
	    	}
	    }  
	    
	    for ( int u=0;u < data.length; u++)
	    {
	    	
	    	for ( int s=0; s < data[u].length; s++)
	    	{
	    		System.out.print(data[u][s]);
	    		System.out.print("\t");
	    	}
	    	System.out.println();
	    }
	}
}