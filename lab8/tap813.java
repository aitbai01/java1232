import javax.swing.*;
import java.awt.*;

public class tap813 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        // координат осьтері
        g.drawLine(0, h/2, w, h/2);
        g.drawLine(w/2, 0, w/2, h);

        for(double x = 0.1; x <= 10; x += 0.01){

            double y = Math.log(x);

            int px = (int)(w/2 + x*50);
            int py = (int)(h/2 - y*50);

            g.fillOval(px, py, 2, 2);
        }
    }

    public static void main(String[] args){
        JFrame f = new JFrame("y = ln(x)");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new tap813());
        f.setVisible(true);
    }
}