
import javax.swing.*;
import java.awt.*;

public class tap81 extends JPanel {

    public void paintComponent(Graphics g) {
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);

        for(double k = 0.1; k <= 1.0; k += 0.1){
            int prevX = 0;
            int prevY = h/2;

            for(int x = -200; x <= 200; x++){
                double y = k * x;

                int px = w/2 + x;
                int py = h/2 - (int)y;

                g.drawLine(prevX, prevY, px, py);

                prevX = px;
                prevY = py;
            }
        }
    }

    public static void main(String[] args) {
        JFrame f = new JFrame("y = kx");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new tap81());
        f.setVisible(true);
    }
}