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

public class Kochkurve extends JFrame implements ActionListener{
    BiBaum bb = new BiBaum();
    JButton schalter01;
    JButton schalter02;
    JButton schalter03;
    JTextField Input_S,Input_W;
    boolean drei = true;
    boolean a = true;
    
  
    public Kochkurve() {
    	
    	setLayout( new FlowLayout() );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	
    	schalter01 = new JButton("Dreieck") ;
    	add(schalter01) ; 
    	schalter01.addActionListener(this ) ; 
    	schalter01.setActionCommand("drei");
    	schalter02 = new JButton("Viereck") ;
    	add(schalter02) ; 
    	schalter02.addActionListener(this ) ; 
    	schalter02.setActionCommand("vier");
    	schalter03 = new JButton("a") ;
    	add(schalter03) ; 
    	schalter03.addActionListener(this ) ; 
    	schalter03.setActionCommand("a");
    	
    	
    	
    }
    public void actionPerformed(ActionEvent evt) {
    	if (evt.getActionCommand().equals("vier")) {
    		drei = false;
    		a = false;
    	}
    	else if (evt.getActionCommand().equals("drei")) {
    		drei = true;
    		a = false;
    	}
    	else if (evt.getActionCommand().equals("a")) {
    		drei = false;
    		a = true;
    	}
    	
    	bb.rechts(90);
        bb.zeichne(200);
        for (int i=0; i<1000000; i++) {
        	System.out.println("|");
        }
        JOptionPane.showMessageDialog(null, "Das Programm schließt sich automatisch.");
        System.exit(0);

    }
    	
    class BiBaum {
    	int xa=500; int ya=500; 
    	int phi=0; 
    	double b=0; 
    	public void vor(int d) { 
    	Graphics stift=getGraphics () ; 
    	int dx=(int)(d*Math.sin(b)) ; 
    	int dy=(int)(d*Math.cos(b)) ; 
    	int xe=xa+dx; int ye=ya-dy; 
    	stift.drawLine(xa,ya,xe,ye); 
    	xa=xe; ya=ye; 
    	} 
    	public void rechts(int Winkel ) { 
    		
    	phi=phi+Winkel ; 
    	b=2*Math.PI*phi/360; 
    	}
    	public void links(int Winkel ) { 
    		
        	phi=phi-Winkel ; 
        	b=2*Math.PI*phi/360; 
        	}
        public void zeichne(int l) { 
        	if (drei == false && a == false) {
        		if (l<20 ) vor(l) ; 
            	else { 
            	l=l/3; 
            	zeichne (l) ; 
            	rechts(-90) ; 
            	zeichne (l) ; 
            	rechts (90) ; 
            	zeichne (l) ; 
            	rechts (90) ;
            	zeichne (l) ; 
            	rechts(-90) ;
            	zeichne (l) ;
            		
                }
        	}
        	else if (drei == true && a == false) {
        		if (l<20 ) vor(l) ; 
            	else { 
            	l=l/3; 
            	zeichne (l) ; 
            	rechts(-60) ; 
            	zeichne (l) ; 
            	rechts (120) ; 
            	zeichne (l) ; 
            	rechts (-60) ;
            	zeichne (l) ; 
            	}

        	}
        	else if (a == true && drei == false) {
        		if(l>20) {
        			vor(l);
        			zeichne(l/2);
        			rechts(90);
        			vor(l);
        			zeichne(l/2);
        			rechts(90);
        			vor(l);
        			zeichne(l/2);
        			rechts(90);
        			vor(l);
        			zeichne(l/2);
        			rechts(90);
        		}
        	}
        }
    }
    
    public static void main ( String[] args ) 
    {

    	Kochkurve test1 = new Kochkurve();
    	 
    	 	test1.setSize( 2000, 1000 );
    	 	test1.setVisible( true );
    	  
    }
}