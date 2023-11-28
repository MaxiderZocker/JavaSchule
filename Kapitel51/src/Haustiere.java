
abstract class Haustiere {

	String name;
	double futtervorrat;
	int    anzahlTage; // gibt die Anzahl Tage aus, die der Futtervorrat reicht
	String haltung;
	String kategorie;
	
	public Haustiere (String n, double futter)
	{
		name=n;
		futtervorrat=futter;
	}
	
	public void fuettern() {
	  sprich(); // Hier erfolgt zuerst der Aufruf der Methode sprich().

	  while(futtervorrat>0) { // Solange der Futtervorrat reicht, wird dann die Methode friss() aufgerufen.
		  friss();
		  anzahlTage++; // und die Anzahl der Tage hochgezaehlt, die der Vorrat reicht.
	  }
	  
	}
	
	public void anzeigen() {
		
		System.out.println("Der Vorrat fuer "+name+" reicht "+anzahlTage+" Tage. \n");
	}
	
	public abstract void friss();
	
	public abstract void sprich();
}

class Katze extends Haustiere {
	
	public Katze (String n, double futter, int halt)
	{
		super(n, futter);
		
		if (halt==1) {
			haltung="Wohnung";
		}
		else if (halt==2) {
			haltung="Artgerecht";
		}
	}
	
	public void sprich() {
		System.out.println("Miau! ");
	}
	
	public void friss() {
		System.out.println(name+": "+futtervorrat);
		futtervorrat=futtervorrat-0.5;
	}
	
	public void anzeigen() {
		
		System.out.println("(Haltung: "+haltung+") Der Vorrat fuer "+name+" reicht "+anzahlTage+" Tage. \n");
	}
	
}

class Hund extends Haustiere {
	
	public Hund (String n, double futter, int kat)
	{
		super(n, futter);
		
		if (kat==1) {
			kategorie="Kleinhunde";
		}
		else if (kat==2) {
			kategorie="Mittelgroﬂe Hunde";
		}
		else if (kat==3) {
			kategorie="Groﬂe Hunde";
		}
	}
	
	public void sprich() {
		System.out.println("Wuff! ");
	}
	
	public void friss() {
		System.out.println(name+": "+futtervorrat);
		futtervorrat=futtervorrat-1;
	}
	
	public void anzeigen() {
		
		System.out.println("(Kategorie: "+kategorie+") Der Vorrat fuer "+name+" reicht "+anzahlTage+" Tage. \n");
	}
	
}