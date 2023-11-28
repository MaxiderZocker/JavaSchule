import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class texttausch extends JFrame implements ActionListener
{

   JButton Button1;
   JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
   JTextField outText = new JTextField( 15 );

   public texttausch( String titel )      // Konstruktor
   {
      super( titel );
      
      Button1 = new JButton("Tausch");
	  Button1.setActionCommand("Tausch");
		
	  Button1.addActionListener(this);
	  
      setLayout( new FlowLayout() );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;
      add(Button1);
      
      inText.addActionListener( this );
      outText.addActionListener( this );
      inText.setActionCommand("in");
      outText.setActionCommand("out");
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  public void actionPerformed( ActionEvent evt)
  {
	  if(evt.getActionCommand().equals("Tausch")) {
			String name = inText.getText();
			String names = outText.getText();
			outText.setText( name );
			inText.setText(names);
		}
  }

  public static void main ( String[] args )
  {
    texttausch echo  = new texttausch( "Test" ) ;

    echo.setSize( 400, 200 );
    echo.setVisible( true );
  }
}
