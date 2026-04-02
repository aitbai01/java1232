import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class tap107 extends JPanel {
    char ch = ' ';

    public tap107() {
        setFocusable(true);
        addKeyListener(new KeyAdapter() {
            public void keyTyped(KeyEvent e) {
                ch = e.getKeyChar();
                repaint();
            }
        });
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.drawString("Typed: " + ch, 50, 100);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        tap107 panel = new tap107();
        f.add(panel);
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
