import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;

public class Idealglue extends JFrame implements ActionListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  Box          genderBox;

  JRadioButton heightA, heightB, heightC, heightD, heightE;
  ButtonGroup  heightGroup;
  Box          heightBox;

  Box          buttonBox;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;
  
  double weight = 0;
  int gender = 0, height = 0;

  public Idealglue()
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

    genderBox = new Box( BoxLayout.Y_AXIS );
    genderBox.add( new JLabel("Your Gender") );
    genderBox.add( Box.createRigidArea( new Dimension(2, 16) ) );
    genderBox.add( genderM );
    genderBox.add( genderF );
    genderBox.add( Box.createRigidArea( new Dimension(2, 73) ) );

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

    heightBox = new Box(BoxLayout.Y_AXIS);
    heightBox.add( new JLabel("Your Height") );
    heightBox.add( Box.createRigidArea( new Dimension(2, 16) ) );
    heightBox.add( heightA ); heightBox.add( heightB );
    heightBox.add( heightC ); heightBox.add( heightD );
    heightBox.add( heightE );

    // Button-Box
    buttonBox = new Box( BoxLayout.X_AXIS );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( genderBox );
    buttonBox.add( Box.createHorizontalGlue() );
    buttonBox.add( heightBox );
    buttonBox.add( Box.createHorizontalGlue() );

    // Result-Panel
    resultText  = new JTextField(7);
    resultText.setEditable( false );
    resultLabl  = new JLabel("Ideal Weight");
    resultPanel = new JPanel();
    resultPanel.add( resultLabl );
    resultPanel.add( resultText );

    // Frame
    setLayout( new BoxLayout( getContentPane(), BoxLayout.Y_AXIS ) );
    add( buttonBox );
    add( resultPanel );
    
    gender=1;
    height=62;
    weight = rechnung();
	resultText.setText(weight+"");
  }

  public double rechnung ()
  {
	  if(gender==1)
	  {
		  return (height*height)/28;
	  }
	  else
	  {
		  return (height*height)/30;
	  }
	  
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
	  
	  weight = rechnung();
	  resultText.setText(weight+"");
	  repaint();
  }
  public static void main ( String[] args )
  {
    Idealglue weightApp  = new Idealglue() ;
    weightApp.setSize( 500, 450 );
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}