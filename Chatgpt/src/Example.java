import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Example extends JFrame {
    private JButton button;

    public Example() {
        setTitle("Example");
        setSize(300, 200);
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        button = new JButton("Change Background");
        button.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                getContentPane().setBackground(Color.RED);
            }
        });

        setLayout (new FlowLayout());
        add(button);
    }

    public static void main(String[] args) {
        Example example = new Example();
        example.setVisible(true);
    }
}
