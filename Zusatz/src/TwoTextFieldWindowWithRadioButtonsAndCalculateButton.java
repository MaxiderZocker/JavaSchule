import javax.swing.*;
import java.awt.event.*;

public class TwoTextFieldWindowWithRadioButtonsAndCalculateButton {

  public static void main(String[] args) {
  
    // create a new JFrame window
    JFrame window = new JFrame("Two Text Field Window with Radio Buttons and Calculate Button");
    
    // set the size of the window
    window.setSize(700, 200);
    
    // set the window to exit the application when closed
    window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    
    // create a JPanel to hold the text fields, radio buttons, button, and result box
    JPanel panel = new JPanel();
    
    // create a label for the first text field
    JLabel label1 = new JLabel("Number 1:");
    
    // create a text field for the first number
    JTextField textField1 = new JTextField(10);
    
    // create a label for the second text field
    JLabel label2 = new JLabel("Number 2:");
    
    // create a text field for the second number
    JTextField textField2 = new JTextField(10);
    
    // create a radio button group
    ButtonGroup radioGroup = new ButtonGroup();
    
    // create a radio button for multiplication
    JRadioButton multiplyButton = new JRadioButton("*");
    radioGroup.add(multiplyButton);
    
    // create a radio button for division
    JRadioButton divideButton = new JRadioButton("/");
    radioGroup.add(divideButton);
    
    // create a button to calculate the result
    JButton calculateButton = new JButton("Calculate");
    
    // create a label for the result text box
    JLabel resultLabel = new JLabel("Result:");
    
    // create an uneditable text box to display the result
    JTextField resultBox = new JTextField(10);
    resultBox.setEditable(false);
    
    // add an action listener to the calculate button
    calculateButton.addActionListener(new ActionListener() {
      public void actionPerformed(ActionEvent e) {
        // get the input from the text fields
        double num1 = Double.parseDouble(textField1.getText());
        double num2 = Double.parseDouble(textField2.getText());
        
        // calculate the result based on the selected radio button
        double result = 0;
        if (multiplyButton.isSelected()) {
          result = num1 * num2;
        } else if (divideButton.isSelected()) {
          result = num1 / num2;
        }
        
        // display the result in the text box
        resultBox.setText(Double.toString(result));
      }
    });
    
    // add the label, text field, radio buttons, button, and result box to the panel
    panel.add(label1);
    panel.add(textField1);
    panel.add(label2);
    panel.add(textField2);
    panel.add(multiplyButton);
    panel.add(divideButton);
    panel.add(calculateButton);
    panel.add(resultLabel);
    panel.add(resultBox);
    
    // add the panel to the window
    window.add(panel);
    
    // display the window
    window.setVisible(true);
  }
}
