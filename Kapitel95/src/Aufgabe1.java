import javafx.application.*;  
import javafx.stage.*;        
import javafx.scene.*;  
import javafx.scene.shape.*; 
import javafx.scene.paint.*;  

import java.util.Random;

public class Aufgabe1 extends Application
{ 
  double sceneWidth=400, sceneHeight= 300;  
  double centerX=sceneWidth/2, centerY=sceneHeight/2;

  private void fillGroup( Group gr, double scale )
  {
    double width=sceneWidth*scale, height=sceneHeight*scale;
    
    // Add one rectangle to the Group
    Rectangle rect = new Rectangle(  centerX-width/2, centerY-height/2, width, height );
    rect.setStrokeWidth( 2.0 );
    rect.setStroke( Color.RED );
    rect.setFill( Color.TRANSPARENT );
    gr.getChildren().add( rect );  

    // If there are more rectangles, add them to the Group
    if ( scale>=0.2 )
      fillGroup( gr, scale-0.1 );      
  }

  public void start(Stage stage) 
  { 
    Group  root = new Group( );   
    fillGroup( root, 0.9 );
    Scene scene = new Scene(root, sceneWidth, sceneHeight, Color.GHOSTWHITE ); 
    stage.setTitle("Recursive Rectangles"); 
    stage.setScene(scene); 
    stage.show(); 
  }      

}