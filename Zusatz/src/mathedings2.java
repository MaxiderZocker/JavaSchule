
public class mathedings2 {
	
	public static void main ( String[] args ) {
		
		long i=1,j=Long.MAX_VALUE;
		
		while (i<j) {
			
			i*=2;
			System.out.println(i);
			if (i==0) {
				i=Long.MAX_VALUE;
			}
		}
		
	}

}