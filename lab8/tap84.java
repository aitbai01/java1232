import javax.swing.*;
import java.awt.*;

public class tap84 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w=getWidth();
        int h=getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        for(double x=-10;x<=10;x+=0.1){

            double y = x*x*x + 2*x*x + x;

            int px=(int)(w/2 + x*20);
            int py=(int)(h/2 - y);

            g.fillOval(px,py,2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("y = x^3 + 2x^2 + x");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new tap84());
        f.setVisible(true);
    }
}