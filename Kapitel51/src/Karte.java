abstract class Karte
{
  String empfaenger;
  String anrede;
  public abstract void gruss();
}

class Feiertag extends Karte
{
  public Feiertag( String e, String sex)
  {
    empfaenger = e;
    
    if (sex=="w")
    {
    	anrede="Liebe ";
    }
    else
    {
    	anrede="Lieber ";
    }
  }

  public void gruss()
  {
    System.out.println(anrede+ empfaenger + ",\n");
    System.out.println("frohe Feiertage!\n\n");
  }
}

class Geburtstag extends Karte
{
  int alter;

  public Geburtstag ( String e, String sex, int jahre )
  {
    empfaenger = e;
    alter = jahre;
    
    if (sex=="w")
    {
    	anrede="Liebe ";
    }
    else
    {
    	anrede="Lieber ";
    }
  }

  public void gruss()
  {
    System.out.println(anrede + empfaenger + ",\n");
    System.out.println("alles Gute zum " + alter + ". Geburtstag.\n\n");
  }
}

class Valentin extends Karte
{
  int kuesse;

  public Valentin ( String e, String sex, int k )
  {
    empfaenger = e;
    kuesse     = k;
    
    if (sex=="w")
    {
    	anrede="Liebe ";
    }
    else
    {
    	anrede="Lieber ";
    }
  }

  public void gruss()
  {
    System.out.println(anrede+ empfaenger + ",\n");
    System.out.println("herzliche Gruesse und Kuesse,\n");
    for ( int j = 0; j < kuesse; j++ )
      System.out.print("X");
    System.out.println("\n\n");
  }
}

