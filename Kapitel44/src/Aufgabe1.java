import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner ( System.in );
		
		int length;
		int zaehler = 0;
		char stelle;
		boolean ok = true;
		
		do
		{
			System.out.println("Geben sie den Dateinamen an:");
			String input, sub;
			ok=true;
			input = scan.nextLine();
			input = input.toLowerCase();
			length = input.length();
			sub = input.substring(length-4,length);
			if (sub.equals(".dat"))
			{
				while (zaehler < length)
				{
					stelle = input.charAt(zaehler);
					switch (stelle)
					{
					case ' ':
						System.out.println("Datei darf keine Lehrzeichen enthalten!");
						ok=false;
						break;
					}
					zaehler++;
				}
				if (input.equals(".dat"))
				{
					System.out.println("Datei hat keinen Namen!");
					ok=false;
				}
				else if (ok==true)
				{				
					System.out.println("ok");
				}
				
			}
			else
			{
				System.out.println("Datei muss mit .dat enden.");
				ok=false;
			}
		}
		while (ok==false);
		scan.close();
	}
}