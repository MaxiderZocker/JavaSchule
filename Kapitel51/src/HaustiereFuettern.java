
public class HaustiereFuettern {
	
	public static void main (String[] args) {
		
		Katze Minka = new Katze("Minka", 5, 1);
		
		Hund Strolchi = new Hund("Strolchi", 5, 1);
		
		Minka.fuettern();
		Minka.anzeigen();
		
		Strolchi.fuettern();
		Strolchi.anzeigen();
	}

}
