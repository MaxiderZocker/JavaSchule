import java.util.Scanner;

class Aufgabe1 {
	public static void main (String[] args)
	{
		Scanner scan = new Scanner ( System.in );
		
		String input;
		int kons, vok, zeichen, leer, zaehler;
		char stelle;
		kons=0;
		vok=0;
		zeichen=0;
		leer=0;
		zaehler=0;
		
		System.out.println("Geben sie ihren Satz ein:");
		input = scan.nextLine();
		input = input.toLowerCase();
		while (zaehler < input.length())
		{
			
			stelle = input.charAt(zaehler);
			switch (stelle)
			{
			case 'a':
				vok++;
				break;
				
			case 'e':
				vok++;
				break;
				
			case 'i':
				vok++;
				break;
				
			case 'o':
				vok++;
				break;
				
			case 'u':
				vok++;
				break;
				
			case 'b':
				kons++;
				break;
				
			case 'c':
				kons++;
				break;
				
			case 'd':
				kons++;
				break;
				
			case 'f':
				kons++;
				break;
				
			case 'g':
				kons++;
				break;
				
			case 'h':
				kons++;
				break;
				
			case 'j':
				kons++;
				break;
				
			case 'k':
				kons++;
				break;
				
			case 'l':
				kons++;
				break;
				
			case 'm':
				kons++;
				break;
				
			case 'n':
				kons++;
				break;
				
			case 'p':
				kons++;
				break;
				
			case 'q':
				kons++;
				break;
				
			case 'r':
				kons++;
				break;
				
			case 's':
				kons++;
				break;
				
			case 't':
				kons++;
				break;
				
			case 'v':
				kons++;
				break;
				
			case 'w':
				kons++;
				break;
				
			case 'x':
				kons++;
				break;
				
			case 'y':
				kons++;
				break;
				
			case 'z':
				kons++;
				break;
				
			case ' ':
				leer++;
				break;
				
			case '-':
				zeichen++;
				break;
				
			case '.':
				zeichen++;
				break;
				
			case ':':
				zeichen++;
				break;
				
			case ',':
				zeichen++;
				break;
				
			case ';':
				zeichen++;
				break;
				
			case '!':
				zeichen++;
				break;
				
			case '?':
				zeichen++;
				break;
				
			}
			
			zaehler++;
		
		}
		System.out.println("Anzahl Konsonanten: "+kons);
		System.out.println("Anzahl Vokale:      "+vok);
		System.out.println("Anzahl Leerzeichen: "+leer);
		System.out.println("Anzahl Satzzeichen: "+zeichen);
		scan.close();
	}
}