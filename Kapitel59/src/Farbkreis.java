import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Farbkreis extends JFrame implements ActionListener{
	
	JButton farbkreis;
	
	int counter=0;
	
	public Farbkreis (String title) {
		
		super(title);
		
		farbkreis = new JButton("Farbkreis");
		farbkreis.setActionCommand("farbkreis");
		
		farbkreis.addActionListener(this);
		
		setLayout(new FlowLayout() );
		add(farbkreis);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		if (counter==0) {
			getContentPane().setBackground(Color.red);
			counter++;
		}
		else if (counter==1) {
			getContentPane().setBackground(Color.green);
			counter++;
		}
		else if (counter==2) {
			getContentPane().setBackground(Color.blue);
			counter++;
		}
		else {
			getContentPane().setBackground(Color.gray);
			counter=0;
		}
		
	}
	
	public static void main ( String[] args )
	  {
	    Farbkreis kreis  = new Farbkreis( "Klicken Sie auf einen Button" ) ;

	    kreis.setSize( 400, 350 );
	    kreis.setVisible( true );
	  }

}
