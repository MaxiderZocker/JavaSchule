
public class Monstertruck extends Auto {
	int reifengroesse;
	double laenge;
	
	Monstertruck (String far, int g, int rg, double lae) {
		super(far, g);
		reifengroesse = rg;
		laenge = lae;
	}
	Monstertruck (String far, int g, int rg) {
		super(far, g);
		reifengroesse = rg;
		laenge = 2;
	}
	Monstertruck (String far, int g) {
		super(far, g);
		reifengroesse = 35;
		laenge = 1.9;
	}
}
