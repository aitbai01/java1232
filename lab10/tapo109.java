import javax.swing.*;
import java.awt.*;

public class tapo109 extends JPanel {
    int x = 0;

    public tapo109() {
        Timer t = new Timer(10, e -> {
            x += 5;
            if (x > getWidth()) x = 0;
            repaint();
        });
        t.start();
    }

    protected void paintComponent(Graphics g) {
        super.paintComponent(g);
        g.fillOval(x, 50, 30, 30);
    }

    public static void main(String[] args) {
        JFrame f = new JFrame();
        f.add(new tapo109());
        f.setSize(300, 200);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}