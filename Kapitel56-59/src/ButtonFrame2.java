import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

class ButtonFrame2 extends JFrame implements ActionListener
{
  JButton bChange ; // Referenz auf ein Button Objekt

  // Konstruktor von ButtonFrame2
  ButtonFrame2(String title)
  {
    super( title );                   // den JFrame Konstruktor aufrufen
    setLayout( new FlowLayout() );    // den Layoutmanager setzen

    // construct a Button
    bChange = new JButton("Klick mich!");

    // das ButtonFrame2-Objekt als Listener f�r den JButton registrieren
    bChange.addActionListener( this );

    add( bChange );                   // JFrame den Button hinzuf�gen
    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }

  public void actionPerformed( ActionEvent evt)
  {
    getContentPane().setBackground( Color.blue );     // den Hintergrund des Frames �ndern
    repaint();  // das System aufforden den Bildschirm zu zeichnen.
  }
}

