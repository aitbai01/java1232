import javax.swing.*;
import java.awt.*;

public class tap82 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w = getWidth();
        int h = getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        int prevX=0, prevY=0;

        for(double x=-20;x<=20;x+=0.1){

            double y = 3*x*x;

            int px = (int)(w/2 + x*10);
            int py = (int)(h/2 - y);

            g.fillOval(px,py,2,2);

            prevX = px;
            prevY = py;
        }
    }

    public static void main(String[] args){
        JFrame f = new JFrame("y = 3x^2");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new tap82());
        f.setVisible(true);
    }
}