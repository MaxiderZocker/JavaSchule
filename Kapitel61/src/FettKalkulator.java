import java.awt.* ;
import java.awt.event.*;
import javax.swing.*;
import java.text.*;

public class FettKalkulator extends JFrame implements ActionListener
{
  JLabel heading   = new JLabel("Percent of Calories from Fat");
  JLabel fatLabel  = new JLabel("Enter grams of fat:             ");
  JLabel calLabel  = new JLabel("Enter total calories:           ");
  JLabel perLabel  = new JLabel("Percent calories from fat: ");

  JTextField inFat  = new JTextField( 12 );
  JTextField inCal  = new JTextField( 12 );
  JTextField outPer = new JTextField( 12 );

  JButton    doit   = new JButton("Do It!");

  double calories;  // Input: Gesamtkalorien pro Packung
  double fatGrams;  // Input: Gramm Fett pro Packung
  double percent;   // Ergebnis in Prozent

  public FettKalkulator()
  {
    setTitle( "Calories from Fat" );
    setLayout( new FlowLayout() );

    add( heading );
    add( fatLabel );
    add( inFat );
    add( calLabel );
    add( inCal );
    add( perLabel );
    add( outPer );
    outPer.setEditable( false );

    add( doit );
    doit.addActionListener( this );
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  // die Applikation
  public void calcPercent( )
  {
    percent = ((fatGrams * 9) / calories) * 100 ;
  }

  public void actionPerformed( ActionEvent evt)
  {
    String userIn ;
    userIn    = inFat.getText()  ;
    try
    {
      fatGrams = Double.parseDouble( userIn ) ;
    }

    catch ( Exception ex )
    {
      inFat.setText( "Re-enter grams" );
    }

    userIn    = inCal.getText()  ;
    try
    {
      calories = Double.parseDouble( userIn ) ;
    }

    catch ( Exception ex )
    {
      inCal.setText( "Re-enter calories" );
    }

    calcPercent() ;

    // die Prozente in einen h�bschen String konvertieren und im Ergebnisfeld ausgeben
    outPer.setText( new DecimalFormat("#0.0##").format(percent) + "%" );
    repaint();
  }

  public static void main ( String[] args )
  {
	  FettKalkulator fatApp  = new FettKalkulator() ;
    fatApp.setSize( 300, 200 );
    fatApp.setVisible( true );
  }
}