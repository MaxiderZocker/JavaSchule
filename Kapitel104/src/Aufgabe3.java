import java.io.*;
import java.util.Scanner;
class Aufgabe3
{
	public static void main ( String[] args ) throws IOException
	{
		String fileName = "Aufgabe3.dat" ;
		Scanner scan = new Scanner ( new File ("Aufgabe3.txt") );
		int input;

		PrintWriter dataOut = new PrintWriter(fileName, "UTF-8" );
		
		
		//for(int i=0; i<=4; i++) {
		while (scan.hasNextLine()) {
			input = Integer.parseInt(scan.nextLine());
			
			dataOut.println(input);
		}

		//}

		dataOut.close();
	}
}