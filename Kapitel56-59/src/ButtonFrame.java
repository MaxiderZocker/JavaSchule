import java.awt.*;
import javax.swing.*;

class ButtonFrame extends JFrame
{
  JButton bChange ; // Referenz auf ein Button-Objekt

  // Konstruktor f�r ButtonFrame

  ButtonFrame(String title)
  {
    super( title );                     // den JFrame Konstruktor aufrufen
    setLayout( new FlowLayout() );      // den Layoutmanager setzen

    bChange = new JButton("Klick mich!"); // einen JButton konstruieren
    add( bChange );                     // dem JFrame den Button hinzuf�gen

    setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
  }
}

