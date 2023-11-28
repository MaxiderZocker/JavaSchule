import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextBsp2 extends JFrame
{
  JTextField text;
  JLabel lbl;

  public TextBsp2( String titel )
  {
     super( titel );
     text = new JTextField( 15 );
     lbl = new JLabel ( "Geben Sie Ihren Namen ein:" );
     setLayout( new FlowLayout() );
     add( lbl );
     add( text );
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public static void main ( String[] args )
  {
    TextBsp2 textBsp = new TextBsp2( "Label und TextField" ) ;
    textBsp.setSize( 400, 100 );
    textBsp.setVisible( true );
  }
}
