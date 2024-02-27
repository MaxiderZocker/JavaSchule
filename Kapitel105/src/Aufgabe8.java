import java.io.*;

class Aufgabe8 {
  public static void main(String[] args) {
    DataInputStream instr;

    try {
      instr = new DataInputStream(new BufferedInputStream(new FileInputStream("Aufgabe8in.dat")));

      try {
        int data, lowFour, highFour, s=1, empty=0;
        String lowFours, highFours, emptys;
        while (true) {
        	
        	for (int i=0;i<=7;i++) {
        		data = instr.readUnsignedByte();
            	// Apply bitwise operations
            	lowFour = data & 0X0000000F;
            	highFour = data & 0X000000F0;
            	highFour = highFour >>> 4;
            	lowFours = trans(lowFour);
            	highFours = trans(highFour);
            	System.out.print(lowFours);
            	System.out.print(highFours);
            	System.out.print(" ");
        		
        	}
        	System.out.println();
        	
        }
      } catch (EOFException eof) {
        instr.close();
        return;
      }
    } catch (FileNotFoundException nfx) {
      System.out.println("Problem opening files");
    } catch (IOException iox) {
      System.out.println("I/O Problems");
    }
  }
  public static String trans (int n) {
	  String out;
	  if(n==0) {
		  out = "0";
	  }
	  else if (n==1) {
		  out = "1";
	  }
	  else if (n==2) {
		  out = "2";
	  }
	  else if (n==3) {
		  out = "3";
	  }
	  else if (n==4) {
		  out = "4";
	  }
	  else if (n==5) {
		  out = "5";
	  }
	  else if (n==6) {
		  out = "6";
	  }
	  else if (n==7) {
		  out = "7";
	  }
	  else if (n==8) {
		  out = "8";
	  }
	  else if (n==9) {
		  out = "9";
	  }
	  else if (n==10) {
		  out = "A";
	  }
	  else if (n==11) {
		  out = "B";
	  }
	  else if (n==12) {
		  out = "C";
	  }
	  else if (n==13) {
		  out = "D";
	  }
	  else if (n==14) {
		  out = "E";
	  }
	  else if (n==15) {
		  out = "F";
	  }
	  else {
		  out = "0";
	  }
	  return out;
  }
}
