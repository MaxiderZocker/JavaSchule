import java.util.Random;
import java.util.Scanner;

class Lotto {
	public static void main (String[] args)
	{
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		int r1=0,r2=0,r3=0,r4=0,r5=0,r6=0,v1,v2,v3,v4,v5,v6,z0=0,z1=0,z2=0,z3=0,z4=0,z5=0,z6=0,s;
		boolean gleich=true,gleichv=false;
		s=0;
		
		System.out.println("Geben sie ihre Lotto vorhersagen 6 aus 49 ein:");
		System.out.println("Erste Zahl:");
		v1= scan.nextInt();
		System.out.println("Zweite Zahl:");
		v2= scan.nextInt();
		System.out.println("Dritte Zahl:");
		v3= scan.nextInt();
		System.out.println("Vierte Zahl:");
		v4= scan.nextInt();
		System.out.println("Fuenfte Zahl:");
		v5= scan.nextInt();
		System.out.println("Sechste Zahl:");
		v6= scan.nextInt();
		while (gleichv==false)
		{
			if (v1==v2||v1==v3||v1==v4||v1==v5||v1==v6||v1<=0||v1>=50)
			{
				gleichv=false;
				System.out.println("Erste Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v1= scan.nextInt();
			}
			else if (v2==v3||v2==v4||v2==v5||v2==v6||v2<=0||v2>=50)
			{
				gleichv=false;
				System.out.println("Zweite Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v2= scan.nextInt();
			}
			else if (v3==v4||v3==v5||v3==v6||v3<=0||v3>=50)
			{
				gleichv=false;
				System.out.println("Dritte Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v3= scan.nextInt();
			}
			else if (v4==v5||v4==v6||v4<=0||v4>=50)
			{
				gleichv=false;
				System.out.println("Vierte Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v4= scan.nextInt();
			}
			else if (v5==v6||v5<=0||v5>=50)
			{
				gleichv=false;
				System.out.println("Fuenfte Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v5= scan.nextInt();
			}
			else if (v6<=0||v6>=50)
			{		
				gleichv=false;
				System.out.println("Sechste Zahl ist gleich einer anderen Zahl oder nicht im Lotto bereich. Geben sie eine andere Zahl ein:");
				v6= scan.nextInt();
			}
			else
			{
				gleichv=true;
			}
		}

		
		while (true)
		{
			gleich=false;
			r1=0;r2=0;r3=0;r4=0;r5=0;r6=0;
			r1=(rand.nextInt(49)+1);
			r2=(rand.nextInt(49)+1);
			r3=(rand.nextInt(49)+1);
			r4=(rand.nextInt(49)+1);
			r5=(rand.nextInt(49)+1);
			r6=(rand.nextInt(49)+1);

			while (gleich==false)
			{
				
				if (r1==r2||r1==r3||r1==r4||r1==r5||r1==r6)
				{
					gleich=false;
					r1=(rand.nextInt(49)+1);
				}
				else if (r2==r3||r2==r4||r2==r5||r2==r6)
				{
					gleich=false;
					r2=(rand.nextInt(49)+1);
				}
				else if (r3==r4||r3==r5||r3==r6)
				{
					gleich=false;
					r3=(rand.nextInt(49)+1);
				}
				else if (r4==r5||r4==r6)
				{
					gleich=false;
					r4=(rand.nextInt(49)+1);
				}
				else if (r5==r6)
				{
					gleich=false;
					r5=(rand.nextInt(49)+1);
				}
				else
				{
					gleich=true;
				}

			}
			
			if (v1!=r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z0++;
			}
			else if (v1==r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z1++;
			}
			else if (v1!=r1&&v2==r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z1++;
			}
			else if (v1!=r1&&v2!=r2&&v3==r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z1++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4==r4&&v5!=r5&&v6!=r6)
			{
				z1++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5==r5&&v6!=r6)
			{
				z1++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6==r6)
			{
				z1++;
			}
			else if (v1==r1&&v2==r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2==r2&&v3==r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3==r3&&v4==r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4==r4&&v5==r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5==r5&&v6==r6)
			{
				z2++;
			}
			else if (v1==r1&&v2!=r2&&v3==r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1==r1&&v2!=r2&&v3!=r3&&v4==r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1==r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5==r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1==r1&&v2!=r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6==r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2==r2&&v3!=r3&&v4==r4&&v5!=r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2==r2&&v3!=r3&&v4!=r4&&v5==r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2==r2&&v3!=r3&&v4!=r4&&v5!=r5&&v6==r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3==r3&&v4!=r4&&v5==r5&&v6!=r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3==r3&&v4!=r4&&v5!=r5&&v6==r6)
			{
				z2++;
			}
			else if (v1!=r1&&v2!=r2&&v3!=r3&&v4==r4&&v5!=r5&&v6==r6)
			{
				z2++;
			}
			else if (v1==r1&&v2==r2&&v3==r3&&v4!=r4&&v5!=r5&&v6!=r6)
			{
				z3++;
			}
		
		}
					
		
	}
}