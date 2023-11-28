import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import javax.swing.JButton;

public class PythagorasBaum extends JFrame implements ActionListener{
    BiBaum bb = new BiBaum();
    JButton schalter01;
    JTextField Input_S,Input_W;
    boolean drei = true;
    
  
    public PythagorasBaum() {
    	
    	setLayout( new FlowLayout() );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	
    	schalter01 = new JButton("Zeichne") ;
    	add(schalter01) ; 
    	schalter01.addActionListener(this ) ; 
    	
    	
    }
    public void actionPerformed(ActionEvent evt) {
    	//bb.rechts(90);
        bb.zeichne(140);
        //for (int i=0; i<1000000; i++) {
        	//System.out.println("|");
        //}
        //JOptionPane.showMessageDialog(null, "Das Programm schließt sich automatisch.");
        //System.exit(0);

    }
    	
    class BiBaum {
    	int xa=500; int ya=500; 
    	double phi=0; 
    	double b=0; 
    	public void vor(double d) { 
    	Graphics stift=getGraphics () ; 
    	int dx=(int)(d*Math.sin(b)) ; 
    	int dy=(int)(d*Math.cos(b)) ; 
    	int xe=xa+dx; int ye=ya-dy; 
    	stift.drawLine(xa,ya,xe,ye); 
    	xa=xe; ya=ye; 
    	} 
    	public void rechts(double Winkel ) { 
    		
    	phi=phi+Winkel ; 
    	b=2*Math.PI*phi/360; 
    	}
    	public void links(int Winkel ) { 
    		
        	phi=phi-Winkel ; 
        	b=2*Math.PI*phi/360; 
        	}
    	public void zeichneQuadrat(double l){
    	      for(int i=0;i<4;i++){
    	         vor(l);
    	         rechts(90);
    	      }
    	   }
    	 
    	   public void zeichne(double l){
    	      zeichneQuadrat(l);
    	      if(l>1){
    	         vor(l);
    	         links(90);
    	         zeichne(l*0.5*Math.sqrt(3));
    	         rechts(90);
    	         vor(l*0.5*Math.sqrt(3));
    	         zeichne(l/2);
    	         vor(-l*0.5*Math.sqrt(3));
    	         links(00);
    	         vor(-l);
    	      }
    	   }
    }
    
    public static void main ( String[] args ) 
    {

    	PythagorasBaum test1 = new PythagorasBaum();
    	 
    	 	test1.setSize( 2000, 1000 );
    	 	test1.setVisible( true );
    	  
    }
}