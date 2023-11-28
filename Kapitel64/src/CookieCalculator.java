import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import javax.swing.event.* ;

class CookieCalculator extends JFrame implements ChangeListener
{
	JSlider      sliderA;
	JPanel       panelA;
	
	JSlider      sliderB;
	JPanel       panelB;
	  
	JSlider      sliderC;
	JPanel       panelC;
	
	JTextField   resultText;
	JLabel       resultLabl;
	JPanel       resultPanel;
	
	int hunger=0,aussehen=0,aroma=0;
	
	public CookieCalculator()
	  {
	    setTitle( "Cookie Calculator" );
	    setDefaultCloseOperation( EXIT_ON_CLOSE );

	    // Height-Gruppe
	    sliderA = new JSlider( JSlider.HORIZONTAL, 1, 10, 1);
	    sliderA.setMajorTickSpacing( 1 );
	    sliderA.setMinorTickSpacing(  1 );
	    sliderA.setPaintTicks( true );
	    sliderA.setPaintLabels( true );
	    sliderA.setPreferredSize( new Dimension(40,40) ) ;
	    sliderA.addChangeListener( this );
	    sliderA.setName("sliderA");

	    panelA = new JPanel();
	    panelA.setLayout( new BoxLayout( panelA, BoxLayout.Y_AXIS ) );
	    panelA.add( new JLabel("Wie hungrig sind Sie (1-10): ") );
	    panelA.add( sliderA );
	    
	    sliderB = new JSlider( JSlider.HORIZONTAL, 1, 10, 1);
	    sliderB.setMajorTickSpacing( 1 );
	    sliderB.setMinorTickSpacing(  1 );
	    sliderB.setPaintTicks( true );
	    sliderB.setPaintLabels( true );
	    sliderB.setPreferredSize( new Dimension(40,40) ) ;
	    sliderB.addChangeListener( this );
	    sliderB.setName("sliderB");

	    panelB = new JPanel();
	    panelB.setLayout( new BoxLayout( panelB, BoxLayout.Y_AXIS ) );
	    panelB.add( new JLabel("Wie lecker sieht das Gebaeck aus (1-10): ") );
	    panelB.add( sliderB );
	    
	    sliderC = new JSlider( JSlider.HORIZONTAL, 1, 10, 1);
	    sliderC.setMajorTickSpacing( 1 );
	    sliderC.setMinorTickSpacing(  1 );
	    sliderC.setPaintTicks( true );
	    sliderC.setPaintLabels( true );
	    sliderC.setPreferredSize( new Dimension(40,40) ) ;
	    sliderC.addChangeListener( this );
	    sliderC.setName("sliderC");

	    panelC = new JPanel();
	    panelC.setLayout( new BoxLayout( panelC, BoxLayout.Y_AXIS ) );
	    panelC.add( new JLabel("Wie gut riecht das Gebaeck (1-10): ") );
	    panelC.add( sliderC );
	    
	    resultText  = new JTextField(10);
	    resultText.setEditable( false );
	    resultLabl  = new JLabel("Ideal Weight");
	    resultPanel = new JPanel();
	    resultPanel.add( resultLabl );
	    resultPanel.add( resultText );

	    // Frame: verwendet den Standard Layoutmanager
	    setLayout(new BoxLayout(getContentPane(), BoxLayout.Y_AXIS));
	    add( panelA );
	    add( panelB );
	    add( panelC  );
	    add( resultPanel);
	    
	    hunger=sliderA.getValue();
		aussehen=sliderB.getValue();
		aroma=sliderC.getValue();
		if(rechnung()>=15)
		{
			resultText.setText("Gebäck Kaufen");
		}
		else
		{
			resultText.setText("Einkauf Fortsetzen");
		}

	}
	
	public int rechnung()
	{
		return hunger+aussehen+aroma;
	}
	
	public void stateChanged( ChangeEvent evt)
	{
		hunger=sliderA.getValue();
		aussehen=sliderB.getValue();
		aroma=sliderC.getValue();
		if(rechnung()>=15)
		{
			resultText.setText("Gebäck Kaufen");
		}
		else
		{
			resultText.setText("Einkauf Fortsetzen");
		}
		repaint();
	}
	 
	public static void main (String[] args)
	{
	  
		CookieCalculator weightApp  = new CookieCalculator() ;
		weightApp.setSize( 350, 250);
		weightApp.setResizable( false );
		weightApp.setVisible( true );

  }
}
