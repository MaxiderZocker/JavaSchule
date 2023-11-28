import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Knochenbau extends JFrame implements ActionListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  JPanel       heightPanel;
  
  JRadioButton knochenA, knochenB, knochenC;
  ButtonGroup  knochenGroup;
  JPanel 	   knochenPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;
  
  double weight = 0, knochen = 0;
  int gender = 0, height = 0;

  public Knochenbau()
  {
    setTitle( "Your Ideal Weight" );
    setDefaultCloseOperation( EXIT_ON_CLOSE );

    // Gender-Gruppe
    genderM = new JRadioButton("Male", true );
    genderM.setActionCommand("M");
    genderM.addActionListener(this);
    genderF = new JRadioButton("Female", false );
    genderF.setActionCommand("F");
    genderF.addActionListener(this);
    genderGroup = new ButtonGroup();
    genderGroup.add( genderM );
    genderGroup.add( genderF );
    genderPanel = new JPanel();
    genderPanel.setLayout( new BoxLayout( genderPanel, BoxLayout.Y_AXIS ) );
    genderPanel.add( new JLabel("Your Gender") );
    genderPanel.add( genderM );  genderPanel.add( genderF );

    // Height-Gruppe
    heightA = new JRadioButton("60 to 64 inches", true );
    heightA.setActionCommand("60-64");
    heightA.addActionListener(this);
    heightB = new JRadioButton("64 to 68 inches", false );
    heightB.setActionCommand("64-68");
    heightB.addActionListener(this);
    heightC = new JRadioButton("68 to 72 inches", false );
    heightC.setActionCommand("68-72");
    heightC.addActionListener(this);
    heightD = new JRadioButton("72 to 76 inches", false );
    heightD.setActionCommand("72-76");
    heightD.addActionListener(this);
    heightE = new JRadioButton("76 to 80 inches", false );
    heightE.setActionCommand("76-80");
    heightE.addActionListener(this);

    heightGroup = new ButtonGroup();
    heightGroup.add( heightA ); heightGroup.add( heightB );
    heightGroup.add( heightC ); heightGroup.add( heightD );
    heightGroup.add( heightE );

    heightPanel = new JPanel();
    heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height") );
    heightPanel.add( heightA ); heightPanel.add( heightB );
    heightPanel.add( heightC ); heightPanel.add( heightD );
    heightPanel.add( heightE );
    
    //Knochenbau
    knochenA = new JRadioButton("Schmaler Knochenbau", false );
    knochenA.setActionCommand("sc");
    knochenA.addActionListener(this);
    knochenB = new JRadioButton("Normaler Knochenbau", true );
    knochenB.setActionCommand("n");
    knochenB.addActionListener(this);
    knochenC = new JRadioButton("Starker Knochenbau", false );
    knochenC.setActionCommand("st");
    knochenC.addActionListener(this);
    
    knochenGroup = new ButtonGroup();
    knochenGroup.add( knochenA ); knochenGroup.add( knochenB );
    knochenGroup.add( knochenC );
    
    knochenPanel = new JPanel();
    knochenPanel.setLayout( new BoxLayout( knochenPanel, BoxLayout.Y_AXIS ) );
    knochenPanel.add( new JLabel("Your Knochendings") );
    knochenPanel.add( knochenA ); knochenPanel.add( knochenB );
    knochenPanel.add( knochenC );

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame: verwendet den Standard Layoutmanager
    add( genderPanel, BorderLayout.WEST );
    add( heightPanel, BorderLayout.CENTER );
    add( resultPanel, BorderLayout.SOUTH  );
    add( knochenPanel, BorderLayout.EAST);
    
    gender=1;
    height=62;
    weight = rechnung();
	resultText.setText(weight+"");

  }
  
  public double rechnung ()
  {
	  if(gender==1)
	  {
		  weight=(height*height)/28;
	  }
	  else
	  {
		  weight=(height*height)/30;
	  }
	  
	  if(knochen==1)
	  {
		  weight=weight*0.95;
	  }
	  else if(knochen==3)
	  {
		  weight=weight*1.05;
	  }
	  return weight;
  }
  
  public void actionPerformed( ActionEvent evt)
  {
	  if(evt.getActionCommand().equals("M"))
	  {
		  gender=1;
	  }
	  else if(evt.getActionCommand().equals("F"))
	  {
		  gender=2;
	  }
	  else if(evt.getActionCommand().equals("60-64"))
	  {
		  height=62;
	  }
	  else if(evt.getActionCommand().equals("64-68"))
	  {
		  height=66;
	  }
	  else if(evt.getActionCommand().equals("68-72"))
	  {
		  height=70;
	  }
	  else if(evt.getActionCommand().equals("72-76"))
	  {
		  height=74;
	  }
	  else if(evt.getActionCommand().equals("76-80"))
	  {
		  height=78;
	  }
	  else if(evt.getActionCommand().equals("sc"))
	  {
		  knochen=1;
	  }
	  else if(evt.getActionCommand().equals("n"))
	  {
		  knochen=2;
	  }
	  else if(evt.getActionCommand().equals("st"))
	  {
		  knochen=3;
	  }
	  
	  weight = rechnung();
	  resultText.setText(weight+"");
	  repaint();
  }

  public static void main ( String[] args )
  {
    Knochenbau weightApp  = new Knochenbau() ;
    weightApp.setSize( 350, 225 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}