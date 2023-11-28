import java.awt.*;
import java.awt.event.*;
import javax.swing.* ;

public class ZweiWegeKonverter extends JFrame implements ActionListener
{
  JButton Button1;
  JButton Button2;
  JButton Button3;
  JLabel heading  = new JLabel("Temperatur Converter");
  JLabel inLabel  = new JLabel("  Eingabe        ");
  JLabel outLabel = new JLabel("Ausgabe");

  JTextField in = new JTextField( 7 );
  JTextField out = new JTextField( 7 );

  int celsTemp ;
  int fahrTemp ;

  ZweiWegeKonverter( String title )
  {
     super( title );
     
     Button1 = new JButton("C to F");
	 Button1.setActionCommand("CF");
		
	 Button1.addActionListener(this);
	 Button2 = new JButton("F to C");
	 Button2.setActionCommand("FC");
		
	 Button2.addActionListener(this);
	 Button3 = new JButton("Reset");
	 Button3.setActionCommand("R");
		
	 Button3.addActionListener(this);
     setLayout( new FlowLayout() );

     in.addActionListener( this );
     out.setEditable( false );

     add( heading );
     add( inLabel );
     add( outLabel );
     add( in );
     add( out );
     add(Button1);
     add(Button2);
     add(Button3);

     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // Die Applikation
  public int convertc( int C )
  {
    return ( C*9/5+32);
  }
  
  public int convertf( int F)
  {
	return ( (F-32) * 5 ) / 9;
  }

  public void actionPerformed( ActionEvent evt)
  {
	  if (evt.getActionCommand().equals("CF"))
	  {
		    String userIn = in.getText() ;
		    celsTemp = Integer.parseInt( userIn ) ;

		    fahrTemp = convertc( celsTemp ) ;

		    out.setText( fahrTemp+"" );
		    repaint();  
	  }
	  else if(evt.getActionCommand().equals("FC"))
	  {
		  String userIn = in.getText() ;
		    fahrTemp = Integer.parseInt( userIn ) ;

		    celsTemp = convertf( fahrTemp ) ;

		    out.setText( celsTemp+"" );
		    repaint();
	  }
	  else if(evt.getActionCommand().equals("R"))
	  {
		  in.setText("");
		  out.setText("");
	  }
  }

  public static void main ( String[] args )
  {
	  ZweiWegeKonverter   fahr  = new ZweiWegeKonverter( "C to F" ) ;

    fahr.setSize( 200, 170 );
    fahr.setVisible( true );
  }

}