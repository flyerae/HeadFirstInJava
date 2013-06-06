package Cap12.SimpleGui3C;

import javax.swing.*;
import java.awt.*;

/**
 * Created with IntelliJ IDEA.
 * User: raluca.garba
 * Date: 6/6/13
 * Time: 3:13 PM
  */

public class MyDrawPanel extends JPanel{

    public void paintComponent(Graphics g){
        Graphics2D g2d = (Graphics2D) g;

        int red = (int)(Math.random()*256);
        int green = (int)(Math.random()*256);
        int blue = (int)(Math.random()*256);
        Color startColor = new Color(red, green, blue);

        red = (int)(Math.random()*256);
        green = (int)(Math.random()*256);
        blue = (int)(Math.random()*256);
        Color endColor = new Color(red, green, blue);

        GradientPaint gradient = new GradientPaint(70, 70, startColor, 150, 150, endColor);
        g2d.setPaint(gradient);
        g2d.fillOval(70, 70, 100, 100);
    }
}
