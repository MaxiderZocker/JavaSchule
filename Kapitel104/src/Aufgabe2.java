import java.io.*;
class Aufgabe2
{
	public static void main ( String[] args ) throws IOException
	{
		String fileName = "Aufgabe2.dat" ;

		DataOutputStream dataOut = new DataOutputStream(new BufferedOutputStream(new FileOutputStream( fileName  ) ) );

		for(int i=0; i<=64;i++) {
			dataOut.writeShort(i);
		}

		for(int i=0; i<=64;i++) {
			dataOut.writeInt(i);
		}
		
		for(int i=0; i<=64;i++) {
			dataOut.writeDouble(i);
		}

		dataOut.close();
	}
}