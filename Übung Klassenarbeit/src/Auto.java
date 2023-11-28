
public class Auto {
	
	String Farbe;
	int ges;
	
	Auto(){
		Farbe="gelb";
		ges=0;
	}
	Auto(String far){
		Farbe=far;
		ges=0;
	}
	Auto(String far, int g){
		Farbe=far;
		ges=g;
	}
	
	void fahren(int g) {
		ges=g;
		System.out.println("Das Auto fährt mit "+ges+"KM/H nach vorne.");
	}
	void fahren() {
		System.out.println("Das Auto fährt vorwärts.");
	}
}
