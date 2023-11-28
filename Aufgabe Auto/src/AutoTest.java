
public class AutoTest {
	
	public static void main(String args[])
	{
		Auto a1 = new Auto();
		Auto a2 = new Auto("Gelb");
		Auto a3 = new Auto("Blau", 5000);

		a1.setHoechst(55);
		System.out.println("Die Höchstgeschwindigkeit beträgt "+a1.getHoechst()+" Kmh.\n");
		a1.fahren();
		a1.setLang(4);
		a1.setJahr(1997);
		System.out.println("Das Auto ist "+a1.getLang()+" Meter lang.");
		System.out.println("Das Auto wurde im Jahr "+a1.getJahr()+" gebaut.\n\n\n");
		
		a2.setHoechst(60);
		System.out.println("Die Höchstgeschwindigkeit beträgt "+a2.getHoechst()+" Kmh.\n");
		a2.fahren(54);
		a2.setLang(5);
		a2.setJahr(1980);
		System.out.println("Das Auto ist "+a2.getLang()+" Meter lang.");
		System.out.println("Das Auto wurde im Jahr "+a2.getJahr()+" gebaut.\n\n\n");
		
		a3.setHoechst(250);
		System.out.println("Die Höchstgeschwindigkeit beträgt "+a3.getHoechst()+" Kmh.\n");
		a3.fahren(222);
		a3.setLang(3);
		a3.setJahr(2018);
		System.out.println("Das Auto ist "+a3.getLang()+" Meter lang.");
		System.out.println("Das Auto wurde im Jahr "+a3.getJahr()+" gebaut.");
		
	}
}
