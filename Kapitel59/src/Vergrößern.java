import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Vergrößern extends JFrame implements ActionListener{
	
	JButton Button1;
	JButton Button2;
	static int x=400, y=350;
	
	public Vergrößern (String title) {
		
		super(title);
		
		Button1 = new JButton("Vergrößern");
		Button1.setActionCommand("Vergrößern");
		Button2 = new JButton("Verkleinern");
		Button2.setActionCommand("Verkleinern");
		
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		
		setLayout(new FlowLayout() );
		add(Button1);
		add(Button2);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		if (evt.getActionCommand().equals("Verkleinern")) {
			x=x-x/10;
			y=y-y/10;
			setSize( x, y );
		}
		else {
			x=x+x/10;
			y=y+y/10;
			setSize( x,y );
		}
	}
	
	public static void main ( String[] args )
	  {
		Vergrößern kreis  = new Vergrößern( "Klicken Sie auf einen Button" ) ;

	    kreis.setSize( x, y );
	    kreis.setVisible( true );
	  }

}
