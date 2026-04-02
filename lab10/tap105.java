import javax.swing.*;
import java.awt.*;

public class tap105 extends JPanel {
    int x = 50, y = 50;

    public tap105() {
        JTextField tx = new JTextField(5);
        JTextField ty = new JTextField(5);
        JButton btn = new JButton("Draw");

        btn.addActionListener(e -> {
            x = Integer.parseInt(tx.getText());
            y = Integer.parseInt(ty.getText());
            repaint();
        });

        add(new JLabel("X:"));
        add(tx);
        add(new JLabel("Y:"));
        add(ty);
        add(btn);
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, y, 30, 30);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tap105());
        f.setSize(300, 300);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}