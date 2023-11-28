
public class Zoohandlung {

	public static void main(String args[])
	{
		Meerschweinchen Marie = new Meerschweinchen();
		Meerschweinchen Antoine = new Meerschweinchen("Gelb");
		Meerschweinchen Gustav = new Meerschweinchen("Blau", 6.7);
	
	
		System.out.println("Maries Rasse ist: "+Marie.getRasse());
		System.out.println("Maries Bauchumfang ist: "+Marie.getBauchumfang());
		Marie.fressen();
		
		System.out.println("Antoines Rasse ist: "+Antoine.getRasse());	
		System.out.println("Antoines Bauchumfang ist: "+Antoine.getBauchumfang());
		Antoine.fressen();
		
		System.out.println("Gustavs Rasse ist: "+Gustav.getRasse());	
		System.out.println("Gustavs Bauchumfang ist: "+Gustav.getBauchumfang());
		Gustav.fressen();
		
		System.out.println(Meerschweinchen.Tieranzahl+" Meerschweinchen\n");
		
		Merino Molle = new Merino();
		Merino Ante = new Merino(true);
		Merino Guston = new Merino(false, 6.7);
		
		System.out.println("Molles Haarlänge ist: "+Molle.gethaarlaenge());
		System.out.println("Ist Molle Scheu? "+Molle.getscheu());
		Molle.fressen();
		
		System.out.println("Antes Haarlänge ist: "+Ante.gethaarlaenge());	
		System.out.println("Ist Ante Scheu? "+Ante.getscheu());
		Ante.fressen();
		
		System.out.println("Gustons Haarlänge ist: "+Guston.gethaarlaenge());	
		System.out.println("Ist Guston Scheu? "+Guston.getscheu());
		Guston.fressen();
		
		System.out.println(Meerschweinchen.Tieranzahl+" Merinos");
	}
	
}
