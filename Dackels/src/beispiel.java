public class beispiel
{
	public static void main(String args[])
	{
		dackel Waldi = new dackel();
		dackel hundi = new dackel(10);
		dackel Luna  = new dackel(5,"Luna");
		dackel horst = new dackel(7,"horst");
		
		Waldi.bellen();
		Waldi.laufen();
		Waldi.setSchulterhoehe(59);
		Waldi.setName("Waldi");
		System.out.println(Waldi.getName()+"\n");
		System.out.println(Waldi.getAlter()+"\n");
		System.out.println(Waldi.getSchulterhoehe()+"\n");
		Waldi.fressen();
		
		hundi.bellen();
		hundi.laufen();
		hundi.Schulterhoehe=40;
		hundi.Name="hundi";
		System.out.println(hundi.Name+"\n");
		System.out.println(hundi.Alter+"\n");
		System.out.println(hundi.Schulterhoehe+"\n");
		hundi.fressen();
		
		horst.bellen();
		horst.laufen();
		horst.Schulterhoehe=55;
		System.out.println(horst.Name+"\n");
		System.out.println(horst.Alter+"\n");
		System.out.println(horst.Schulterhoehe+"\n");
		horst.fressen();
		
		Luna.bellen();
		Luna.laufen();
		Luna.Schulterhoehe=35;
		System.out.println(Luna.Name+"\n");
		System.out.println(Luna.Alter+"\n");
		System.out.println(Luna.Schulterhoehe+"\n");
		Luna.fressen();
		
		System.out.println(dackel.anzahl+" Dackel");
		
	}
}