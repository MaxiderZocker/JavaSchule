// Import packages
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class TwoTextFields implements ActionListener {

    // Declare some components as fields
    private JTextField field1;
    private JTextField field2;
    private JRadioButton button1;
    private JRadioButton button2;
    private JButton calculate;
    private JTextField result;

    public static void main(String[] args) {
        // Create an instance of this class
        TwoTextFields ttf = new TwoTextFields();
        // Invoke the createGUI method
        ttf.createGUI();
    }

    public void createGUI() {
        // Create a JFrame object
        JFrame frame = new JFrame("Two Text Fields");
        // Set the size and layout of the frame
        frame.setSize(300, 250);
        frame.setLayout(new GridLayout(5, 2));
        
       // Create two JLabel objects

       JLabel label1 = new JLabel("Number 1:");

       JLabel label2 = new JLabel("Number 2:");

       // Create two JTextField objects

       field1 = new JTextField();

       field2 = new JTextField();

       // Create two JRadioButton objects

       button1 = new JRadioButton("*");

       button2 = new JRadioButton("/");

       // Create a ButtonGroup object and add the radio buttons to it

       ButtonGroup group = new ButtonGroup();

       group.add(button1);

       group.add(button2);

       // Create a JButton object

       calculate = new JButton("Calculate");

       // Add an ActionListener to the button

       calculate.addActionListener(this);
     
     // Create another JLabel object for result

     JLabel label3 = new JLabel("Result:");

     // Create another JTextField object for result

     result = new JTextField();

     // Set it uneditable

     result.setEditable(false);

     // Add these components to the frame as well

     frame.add(label3);

     frame.add(result);

     // Add all other components to the frame

     frame.add(label1);

     frame.add(field1);

     frame.add(label2);

     frame.add(field2);
   
   frame.add(button1);
   frame.add(button2);
   frame.add(calculate);

// Make the frame visible
frame.setVisible(true);
}

public void actionPerformed(ActionEvent e) {

// Check if the source of the event is the calculate button
if (e.getSource() == calculate) {

try {

// Get the numbers from the text fields
double num1 = Double.parseDouble(field1.getText());
double num2 = Double.parseDouble(field2.getText());
double res;

if (button1.isSelected()) {

// Multiply if * is selected
res = num1 * num2;

} else if (button2.isSelected()) {

// Divide if / is selected
res = num1 / num2;

} else {

throw new Exception("No operation selected");

}

// Set the text of result text field to res
result.setText(String.valueOf(res));

} catch (Exception ex) {

JOptionPane.showMessageDialog(null,

ex.getMessage(),

"Error",

JOptionPane.ERROR_MESSAGE);

}

}

}
}