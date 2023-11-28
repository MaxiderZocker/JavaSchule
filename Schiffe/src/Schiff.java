
public class Schiff {
	double knoten;
	boolean mitMotor;
	static int anzahl;
	String Hersteller;
	double Zuladung;
	
	public Schiff() {
		moreSchiffe();
	}
	
	public Schiff(String svar) {
		moreSchiffe();
		this.Hersteller=svar;
	}
	
	public Schiff(String svar, double var) {
		moreSchiffe();
		this.Hersteller=svar;
		this.Zuladung=var;
	}
	
	static void moreSchiffe() {
		Schiff.anzahl++;
	}
	
	public void fahren() {
		System.out.println("Das Schiff fährt vorwärts.");
	}
	
	public void fahren(int var) {
		this.knoten=var;
		System.out.println("Das Schiff fährt mit "+knoten+" Knoten vorwärts. \n");
	}
	
}