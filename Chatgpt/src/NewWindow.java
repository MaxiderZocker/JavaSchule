import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class NewWindow {
    public static void main(String[] args) {
        // Create the initial window
        JFrame frame = new JFrame();
        frame.setSize(400, 400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLayout(new FlowLayout());

        // Create a button for the initial window
        JButton button = new JButton("Open new window");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                // Create the new window
                JFrame newFrame = new JFrame();
                newFrame.setSize(400, 400);
                newFrame.setLayout(new FlowLayout());

                // Create a button for the new window
                JButton newButton = new JButton("Change background color");
                newButton.addActionListener(new ActionListener() {
                    public void actionPerformed(ActionEvent e) {
                        newFrame.getContentPane().setBackground(Color.CYAN);
                    }
                });

                // Add the button to the new window
                newFrame.add(newButton);
                newFrame.setVisible(true);
            }
        });

        // Add the button to the initial window
        frame.add(button);
        frame.setVisible(true);
    }
}
