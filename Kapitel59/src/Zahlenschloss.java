import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class Zahlenschloss extends JFrame implements ActionListener{
	
	JButton Button0;
	JButton Button1;
	JButton Button2;
	JButton Button3;
	JButton Button4;
	JButton Button5;
	JButton Button6;
	JButton Button7;
	JButton Button8;
	JButton Button9;
	
	boolean z1 = false;
	boolean z2 = false;
	boolean z3 = false;
	int counter = 0;
	
	public Zahlenschloss (String title) {
		
		super(title);
		
		Button0 = new JButton("0");
		Button0.setActionCommand("0");
		Button1 = new JButton("1");
		Button1.setActionCommand("1");
		Button2 = new JButton("2");
		Button2.setActionCommand("2");
		Button3 = new JButton("3");
		Button3.setActionCommand("3");
		Button4 = new JButton("4");
		Button4.setActionCommand("4");
		Button5 = new JButton("5");
		Button5.setActionCommand("5");
		Button6 = new JButton("6");
		Button6.setActionCommand("6");
		Button7 = new JButton("7");
		Button7.setActionCommand("7");
		Button8 = new JButton("8");
		Button8.setActionCommand("8");
		Button9 = new JButton("9");
		Button9.setActionCommand("9");
		
		Button0.addActionListener(this);
		Button1.addActionListener(this);
		Button2.addActionListener(this);
		Button3.addActionListener(this);
		Button4.addActionListener(this);
		Button5.addActionListener(this);
		Button6.addActionListener(this);
		Button7.addActionListener(this);
		Button8.addActionListener(this);
		Button9.addActionListener(this);
		
		setLayout(new FlowLayout() );
		add(Button0);
		add(Button1);
		add(Button2);
		add(Button3);
		add(Button4);
		add(Button5);
		add(Button6);
		add(Button7);
		add(Button8);
		add(Button9);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE );
	}
	
	public void actionPerformed(ActionEvent evt) {
		
		if ( evt.getActionCommand().equals( "5" )&&counter==0 ) {
			z1=true;
			counter++;
		}
		else if ( evt.getActionCommand().equals( "6" )&&counter==1&&z1==true ) {
			z2=true;
			counter++;
		}
		else if ( evt.getActionCommand().equals( "7" )&&counter==2&&z2==true&&z1==true ) {
			z3=true;
			counter=0;
		}
		else if (counter>=2) {
			counter=0;
			getContentPane().setBackground(Color.red);
			z1=false;
			z2=false;
			z3=false;
		}
		else {
			counter++;
			z1=false;
			z2=false;
			z3=false;
		}
		if (z1==true&&z2==true&&z3==true) {
			getContentPane().setBackground(Color.green);
			z1=false;
			z2=false;
			z3=false;
		}
	}
	
	public static void main ( String[] args )
	  {
		Zahlenschloss kreis  = new Zahlenschloss( "Klicken Sie auf einen Button" ) ;

	    kreis.setSize( 500, 350 );
	    kreis.setVisible( true );
	  }

}
