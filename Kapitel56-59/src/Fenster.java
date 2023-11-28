import java.awt.*;
import javax.swing.*;

public class Fenster
{
  public static void main ( String[] args )
  {
	  int i=0;
    JFrame frame = new JFrame("Test Frame 1");
    frame.setVisible( true );
    while(i<500) {
    	i=i+1000;
    	frame.setSize(i,i);
    	i=i-999;
    	frame.setSize(i,i);
    }
    frame.setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}