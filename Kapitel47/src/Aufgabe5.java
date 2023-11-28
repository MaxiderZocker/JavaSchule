
class Aufgabe5
{

  public static void main ( String[] args )
  {
	  double[] mess = {5.6,6.2,6.0,5.5,5.7,6.1,7.4,5.5,5.5,6.3,6.4,4.0,6.9};
	  
	  double durchschnitt = 0,wert1=0,wert2=0,wert3=0,wert4=0,wert5=0,entfernt=0;
	  int j=0;
	  
	  while (j<mess.length)
	  {
		  wert1=wert1+mess[j];
		  System.out.println(mess[j]);
		  j++;
	  }
	  durchschnitt=wert1/j;
	  wert3=durchschnitt;
	  System.out.println("Durchschnitt: "+durchschnitt);
	  for (int i=0;i<mess.length;i++)
	  {
		  wert1=mess[i];
		  if (wert1>durchschnitt&&wert1>wert2)
		  {
			  wert2=wert1;
		  }
		  else if (wert1<durchschnitt&&wert1<wert3)
		  {
			  wert3=wert1;
		  }
	  }
	  
	  if (wert3==durchschnitt)
	  {
		  wert3=0;
	  }
	  
	  wert4=wert2-durchschnitt;
	  wert5=durchschnitt-wert3;
	  
	  if (wert4>wert5)
	  {
		  System.out.println("entferntester Wert: "+wert2);
		  entfernt=wert2;
	  }
	  else if(wert5>wert4)
	  {
		  System.out.println("entferntester Wert: "+wert3);
		  entfernt=wert3;
	  }
	  j=0;
	  wert1=0;
	  durchschnitt=0;
	  while (j<mess.length)
	  {
		  if (mess[j]!=entfernt)
		  {
				  wert1=wert1+mess[j];
		  }
		  j++;
	  }
	durchschnitt=wert1/(j-1);
	
	System.out.println("neuer Durchschnitt: "+durchschnitt);
  }
}  