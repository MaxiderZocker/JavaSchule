public class KarteTester
{
	public static void main ( String[] args )
	{

		Feiertag   feiern = new Feiertag( "Ann","w" );
		feiern.gruss();

		Geburtstag  geb  = new Geburtstag( "Bob", "m", 55);
		geb.gruss();

		Valentin val = new Valentin( "Joan", "w", 35 );
		val.gruss();

	}
}