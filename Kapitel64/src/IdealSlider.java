import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;

public class IdealSlider extends JFrame implements ActionListener, ChangeListener
{
  JRadioButton genderM, genderF;
  ButtonGroup  genderGroup;
  JPanel       genderPanel;

  JSlider      heightSlider;
  JPanel       heightPanel;

  JTextField   resultText;
  JLabel       resultLabl;
  JPanel       resultPanel;
  
  double weight = 0;
  int gender = 0, height = 0;

  public IdealSlider()
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
    heightSlider = new JSlider( JSlider.VERTICAL, 40, 80, 62);
    heightSlider.setMajorTickSpacing( 10 );
    heightSlider.setMinorTickSpacing(  1 );
    heightSlider.setPaintTicks( true );
    heightSlider.setPaintLabels( true );
    heightSlider.setPreferredSize( new Dimension(10,10) ) ;
    heightSlider.addChangeListener( this );
    heightSlider.setName("sliderA");

    heightPanel = new JPanel();
    heightPanel.setLayout( new BoxLayout( heightPanel, BoxLayout.Y_AXIS ) );
    heightPanel.add( new JLabel("Your Height in Inches") );
    heightPanel.add( heightSlider ); 

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
    
    gender=1;
    height=heightSlider.getValue();
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
	  
	  weight = rechnung();
	  resultText.setText(weight+"");
	  repaint();
  }
  
  public void stateChanged( ChangeEvent evt)
  {
	  height=heightSlider.getValue();
	  weight = rechnung();
	  resultText.setText(weight+"");
	  repaint();
  }
  
  public static void main ( String[] args )
  {
    IdealSlider weightApp  = new IdealSlider() ;
    weightApp.setSize( 250, 400);
    weightApp.setResizable( false );
    weightApp.setVisible( true );
  }
}