public class Autotest {
	
	public static void main (String args[]) {
		
		Auto wagen_1 = new Auto();
		
		wagen_1.fahren(80);
		
		Auto wagen_2 = new Auto("orange");
		
		wagen_2.fahren(30);
		
		Auto wagen_3 = new Auto("rot", 50);
		
		wagen_3.fahren();
		
		System.out.println("Das Auto hat die farbe "+wagen_2.Farbe+".");
	}
}
