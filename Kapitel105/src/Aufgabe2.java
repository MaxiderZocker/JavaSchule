import java.io.*;
import java.util.Scanner;
class Aufgabe2
{
	public static void main ( String[] args ) throws IOException
	{
		String fileName = "Aufgabe2.txt" ;
		Scanner scan = new Scanner ( new File ("Aufgabe2.txt") );
		int input;

		PrintWriter dataOut = new PrintWriter(fileName, "UTF-8" );
		PrintWriter dataOuts = new PrintWriter("Aufgabe2s.dat", "UTF-8" );
		
		long time1 = System.currentTimeMillis();
		for(int i=0; i<=1000000; i++) {
		//while (scan.hasNextLine()) {
			input = i;
			
			dataOut.println(input);
		}
		long time2 = System.currentTimeMillis();
		long end = time2-time1;
		System.out.println("Time: "+end);
		
		DataOutputStream dataOutb = new DataOutputStream(new BufferedOutputStream(new FileOutputStream( "Aufgabe2b.dat"  ) ) );
		time1 = System.currentTimeMillis();
		for(int i=0; i<=1000000;i++) {
			dataOutb.writeInt(i);
		}
		time2 = System.currentTimeMillis();
		end = time2-time1;
		System.out.println("Time buffered: "+end);
		
		time1 = System.currentTimeMillis();
		int s=0;
		while (scan.hasNextLine()) {
			input = Integer.parseInt(scan.nextLine());
		
			s=s+input;
		}
		time2 = System.currentTimeMillis();
		end = time2-time1;
		System.out.println("Time scan: "+end);
		dataOuts.println(s);

		dataOut.close();
		dataOuts.close();
		dataOutb.close();
	}
}