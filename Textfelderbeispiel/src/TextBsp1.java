import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class TextBsp1 extends JFrame

{
  JTextField text;

  public TextBsp1( String titel )
  {
     super( titel );
     text = new JTextField( 15 );
     setLayout( new FlowLayout() );
     add( text );
     setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public static void main ( String[] args )
  {
    TextBsp1 textBsp = new TextBsp1( "TextFeld" ) ;
    textBsp.setSize( 200, 100 );
    textBsp.setVisible( true );
  }
}