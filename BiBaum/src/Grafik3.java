import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Scanner;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;

public class Grafik3 extends JFrame implements ActionListener{
    BiBaum bb = new BiBaum();
    JButton schalter01;
    JTextField Input_S,Input_W;
    
  
    public Grafik3() {
    	
    	setLayout( new FlowLayout() );
    	setDefaultCloseOperation( JFrame.EXIT_ON_CLOSE );
    	
    	schalter01 = new JButton("zeichne") ;
    	add(schalter01) ; 
    	schalter01.addActionListener(this ) ; 
    	
    	
    	
    }
    public void actionPerformed(ActionEvent e) {
        bb.zeichne(140);
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
        	if (l>2){ 
        		vor(l) ; 
        		rechts(90) ;
        		vor(l) ; 
        		rechts (-90) ; 
        		zeichne (l/2) ; 
        		rechts(90 ) ;
        		vor(-2*l) ;
        		rechts (-90) ; 
        		zeichne(l/2) ; 
        		rechts(90) ; 
        		vor(l) ; 
        		rechts (-90) ; 
        		vor(-l) ;
                System.out.println(l);
            
        	}
            
        }
    }
    
    public static void main ( String[] args ) 
    {

    	Grafik3 test1 = new Grafik3();
    	 
    	 	test1.setSize( 1000, 1000 );
    	 	test1.setVisible( true );
    	  
    }
}