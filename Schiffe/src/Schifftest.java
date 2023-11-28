
public class Schifftest {
	
	public static void main(String args[]) {
		
		Schiff a = new Schiff();
		Schiff b = new Schiff("MSC");
		Schiff c = new Schiff("AIDA",6000);
		
		System.out.println("Es existieren "+Schiff.anzahl+" Schiffe.\n");
		
		a.fahren();
		
		b.fahren();
		
		c.fahren(99);
	}
	
}
