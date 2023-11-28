import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Pong extends JFrame implements ActionListener {

    private Timer timer;
    private int ballX = 250, ballY = 250, ballXDir = 3, ballYDir = 3;
    private int paddleLeftY = 200, paddleRightY = 200, paddleWidth = 10, paddleHeight = 80;
    private int player1Score = 0, player2Score = 0;
    private JLabel scoreLabel;
    private final int BOARD_WIDTH = 500, BOARD_HEIGHT = 500;

    public Pong() {
        setTitle("Pong");
        setSize(BOARD_WIDTH, BOARD_HEIGHT);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);

        JPanel panel = new JPanel();
        panel.setLayout(null);
        add(panel);

        scoreLabel = new JLabel("0:0");
        scoreLabel.setBounds(225, 20, 50, 20);
        panel.add(scoreLabel);

        timer = new Timer(10, this);
        timer.start();

        addKeyListener(new KeyAdapter() {
            public void keyPressed(KeyEvent e) {
                if (e.getKeyCode() == KeyEvent.VK_UP) {
                    paddleRightY -= 20;
                }
                else if (e.getKeyCode() == KeyEvent.VK_DOWN) {
                    paddleRightY += 20;
                }
            }
        });

        setVisible(true);
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.setColor(Color.WHITE);
        g.fillRect(0, 0, BOARD_WIDTH, BOARD_HEIGHT);

        g.setColor(Color.BLACK);
        g.fillRect(ballX, ballY, 10, 10);

        g.fillRect(0, paddleLeftY, paddleWidth, paddleHeight);
        g.fillRect(BOARD_WIDTH - paddleWidth, paddleRightY, paddleWidth, paddleHeight);
    }

    public void actionPerformed(ActionEvent e) {
        ballX += ballXDir;
        ballY += ballYDir;

        if (ballY <= 0 || ballY >= BOARD_HEIGHT - 10) {
            ballYDir *= -1;
        }

        if (ballX <= paddleWidth) {
            if (ballY + 10 >= paddleLeftY && ballY <= paddleLeftY + paddleHeight) {
                ballXDir *= -1;
            } else {
                player2Score++;
                scoreLabel.setText(player1Score + ":" + player2Score);
                reset();
            }
        } else if (ballX >= BOARD_WIDTH - paddleWidth - 10) {
            if (ballY + 10 >= paddleRightY && ballY <= paddleRightY + paddleHeight) {
                ballXDir *= -1;
            } else {
                player1Score++;
                scoreLabel.setText(player1Score + ":" + player2Score);
                reset();
            }
        }

        if (paddleLeftY <= 0) {
            paddleLeftY = 0;
        } else if (paddleLeftY + paddleHeight >= BOARD_HEIGHT) {
            paddleLeftY = BOARD_HEIGHT - paddleHeight;
        }

        repaint();
    }

    private void reset() {
        ballX = 250;
        ballY = 250;
        ballXDir = (int)(Math.random() * 2) == 0 ? -3 : 3;
        ballYDir = (int)(Math.random() * 2) == 0 ? -3 : 3;
        paddleLeftY = 200;
        paddleRightY = 200;
    }

    public static void main(String[] args) {
        new Pong();
    }
}