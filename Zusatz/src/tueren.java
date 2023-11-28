
public class tueren {
	
	public static void main ( String[] args ) {
		
		boolean [] tueren = new boolean[101];
		
		for (int i=1;i<=100;i++) {
			for (int j=0;j<=100;j=j+i) {
				if (tueren[j]==false) {
					tueren[j]=true;
				}
				else if (tueren[j]==true) {
					tueren[j]=false;
				}
			}
		}

		System.out.print("| ");
		for (int k=1;k<=100;k++) {
			if(tueren[k]==true) {
				System.out.print(k+" | ");
			}
		}
	}
}
