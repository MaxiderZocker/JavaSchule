import java.util.Scanner;

class Aufgabe1B {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner ( System.in );
		
		String input, oks;
		int kons, vok, zeichen, leer, zaehler;
		char stelle;
		boolean ok;
		kons=0;
		vok=0;
		zeichen=0;
		leer=0;
		zaehler=0;
		
		do
		{
			System.out.println("Geben sie ihren Satz ein:");
			input = scan.nextLine();
			input = input.toLowerCase();
			while (zaehler < input.length())
			{
			
				stelle = input.charAt(zaehler);
				switch (stelle)
				{
				case 'a','e','i','o','u':
					vok++;
					break;
			
				case 'b','c','d','f','g','h','j','k','l','m','n','p','q','r','s','t','v','w','x','y','z':
					kons++;
					break;
				
				case ' ':
					leer++;
					break;
					
				case '-','.',':',',',';','!','?':
					zeichen++;
					break;
				
				}
			
				zaehler++;
		
			}
			System.out.println("Anzahl Konsonanten: "+kons);
			System.out.println("Anzahl Vokale:      "+vok);
			System.out.println("Anzahl Leerzeichen: "+leer);
			System.out.println("Anzahl Satzzeichen: "+zeichen);
			
			System.out.println("Nochmal? (Ja/Nein)");
			oks = scan.nextLine().toLowerCase();
			if (oks.equals("ja"))
			{
				ok=true;
			}
			else
			{
				ok=false;
			}
		}
		while (ok==true);
		scan.close();
	}
}