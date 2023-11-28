import java.awt.*;
import java.awt.event.*;
import javax.swing.*;
import java.util.*;

public class DreiButtonMonte extends JFrame implements ActionListener{
	
	JButton Button1;
	JButton Button2;
	JButton Button3;
	
	int counter=0;
	
	public DreiButtonMonte (String title) {
		
		super(title);
		
		Button1 = new JButton("1");
		Button1.setActionCommand("1");
		Button2 = new JButton("2");
		Button2.setActionCommand("2");
		Button3 = new JButton("3");
		Button3.setActionCommand("3");
		
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		
		setLayout(new FlowLayout() );
		add(Button1);
		add(Button2);
		add(Button3);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		Random rnd = new Random();
		
		int Zufall = rnd.nextInt(3);
		
		if (Zufall==0) {
			getContentPane().setBackground(Color.green);
		}
		else if (Zufall==1||Zufall==2) {
			System.exit(0);
		}
	}
	
	public static void main ( String[] args )
	  {
		DreiButtonMonte kreis  = new DreiButtonMonte( "Klicken Sie auf einen Button" ) ;

	    kreis.setSize( 400, 350 );
	    kreis.setVisible( true );
	  }

}
