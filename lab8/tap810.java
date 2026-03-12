import javax.swing.*;
import java.awt.*;

public class tap810 extends JPanel {

    public void paintComponent(Graphics g){
        super.paintComponent(g);

        int w=getWidth();
        int h=getHeight();

        g.drawLine(0,h/2,w,h/2);
        g.drawLine(w/2,0,w/2,h);

        for(double x=-10;x<=10;x+=0.01){

            if(x==0) continue;

            double y = 3 + 2/x + 3/(x*x);

            int px=(int)(w/2 + x*40);
            int py=(int)(h/2 - y*20);

            g.fillOval(px,py,2,2);
        }
    }

    public static void main(String[] args){
        JFrame f=new JFrame("y = 3 + 2/x + 3/x^2");
        f.setSize(600,600);
        f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        f.add(new tap810());
        f.setVisible(true);
    }
}