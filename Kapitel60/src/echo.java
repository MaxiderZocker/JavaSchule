import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class echo extends JFrame implements ActionListener
{

   JLabel inLabel     = new JLabel( "Geben Sie Ihren Namen ein:  " ) ;
   JTextField inText  = new JTextField( 15 );

   JLabel outLabel    = new JLabel( "Hier kommt dann Ihr Name:" ) ;
   JTextField outText = new JTextField( 15 );

   public echo( String titel )      // Konstruktor
   {
      super( titel );
      setLayout( new FlowLayout() );
      add( inLabel  ) ;
      add( inText   ) ;
      add( outLabel ) ;
      add( outText  ) ;

      inText.addActionListener( this );
      outText.addActionListener( this );
      inText.setActionCommand("in");
      outText.setActionCommand("out");
      setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
   }

  public void actionPerformed( ActionEvent evt)
  {
	  if(evt.getActionCommand().equals("in")) {
			String name = inText.getText();
			outText.setText( name );
		}
	  else {
		  String name = outText.getText();
		  inText.setText( name );
	  }
  }

  public static void main ( String[] args )
  {
    echo echos  = new echo( "Wiederholer" ) ;

    echos.setSize( 400, 100 );
    echos.setVisible( true );
  }
}
