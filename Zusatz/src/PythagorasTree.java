import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

public class PythagorasTree extends JPanel implements ActionListener {

    private static final double ANGLE = Math.PI / 4;
    private static final double SCALE_FACTOR = Math.sqrt(2);

    private int depth;
    private JButton drawButton;

    public PythagorasTree(int depth) {
        this.depth = depth;
        drawButton = new JButton("Draw");
        drawButton.addActionListener(this);
        add(drawButton);
    }

    @Override
    public void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.setColor(Color.BLACK);
        drawPythagorasTree(g, depth, getWidth() / 2, getHeight(), getHeight() / 4, -Math.PI / 2);
    }

    private void drawPythagorasTree(Graphics g, int depth, int x1, int y1, int size, double angle) {
        if (depth == 0) {
            return;
        }

        int x2 = x1 + (int) (Math.cos(angle) * size);
        int y2 = y1 + (int) (Math.sin(angle) * size);

        g.drawLine(x1, y1, x2, y2);

        int size1 = (int) (size / SCALE_FACTOR);
        int x3 = x2 + (int) (Math.cos(angle + ANGLE) * size1);
        int y3 = y2 + (int) (Math.sin(angle + ANGLE) * size1);
        drawPythagorasTree(g, depth - 1, x2, y2, size1, angle + ANGLE);

        int size2 = (int) (size / SCALE_FACTOR);
        int x4 = x2 + (int) (Math.cos(angle - ANGLE) * size2);
        int y4 = y2 + (int) (Math.sin(angle - ANGLE) * size2);
        drawPythagorasTree(g, depth - 1, x2, y2, size2, angle - ANGLE);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == drawButton) {
            repaint();
        }
    }

    public static void main(String[] args) {
        int depth = Integer.parseInt(JOptionPane.showInputDialog("Enter the depth of the tree:"));
        JFrame frame = new JFrame("Pythagoras Tree");
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        PythagorasTree tree = new PythagorasTree(depth);
        frame.add(tree);
        frame.setSize(600, 600);
        frame.setVisible(true);
    }
}