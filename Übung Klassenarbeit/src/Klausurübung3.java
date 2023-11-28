import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Klausur�bung3 extends JFrame implements ActionListener {
	
	JRadioButton plus, minus;
	ButtonGroup operation;
	
	JLabel zahl1, zahl2, ergebnis;
	JButton rechnen;
	JTextField Zahl1, Zahl2, Ergebnis;
	
	double z1, z2, e;
	
	public Klausur�bung3()
	{
		setTitle("Klausur�bung");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		plus = new JRadioButton("*", true);
		minus = new JRadioButton("/", false);
		operation = new ButtonGroup();
		operation.add(plus);
		operation.add(minus);
	
		rechnen = new JButton("Rechnen");
		rechnen.setActionCommand("r");
		rechnen.addActionListener(this);
				
		zahl1 = new JLabel("Zahl1");
		zahl2 = new JLabel("Zahl2");
		ergebnis = new JLabel("Ergebnis");
		
		Zahl1 = new JTextField(7);
		Zahl2 = new JTextField(7);
		Ergebnis = new JTextField(7);
		Ergebnis.setEditable(false);
		
		setLayout(new FlowLayout());
		add(zahl1);
		add(Zahl1);
		add(zahl2);
		add(Zahl2);
		add(plus);
		add(minus);
		add(rechnen);
		add(ergebnis);
		add(Ergebnis);
		
	}
	
	public void actionPerformed(ActionEvent evt)
	{
		String userin,userin2;
		userin=Zahl1.getText();
		userin2=Zahl2.getText();
		
		z1=Double.parseDouble(userin);
		z2=Double.parseDouble(userin2);
		
		if (plus.isSelected()==true)
		{
			e=z1*z2;
		}
		else if (minus.isSelected()==true)
		{
			e=z1/z2;
		}
		
		Ergebnis.setText(e+"");
	}
	
	public static void main(String[]args)
	{
		Klausur�bung3 �bung  = new Klausur�bung3() ;
	    �bung.setSize( 700, 200 );
	    �bung.setVisible( true );
	    �bung.setResizable(false);
	}
}
