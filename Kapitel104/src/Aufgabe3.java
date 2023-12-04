import java.io.*;
import java.util.Scanner;
class Aufgabe3
{
	public static void main ( String[] args ) throws IOException
	{
		String fileName = "Aufgabe3.dat" ;
		Scanner scan = new Scanner ( "Aufgabe3.txt" );
		int input;

		DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream( fileName  ) ) );
		
		
		//for(int i=0; i<=4; i++) {
			input = Integer.parseInt(scan.nextLine());
		
			dataOut.writeInt(input);	
		//}

		dataOut.close();
	}
}