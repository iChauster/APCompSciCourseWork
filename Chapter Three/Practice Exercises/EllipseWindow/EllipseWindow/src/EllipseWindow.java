/**
 * @(#)EllipseWindow.java
 *
 * EllipseWindow application
 *
 * @author 
 * @version 1.00 2016/10/13
 */
 import java.awt.*;
 import javax.swing.JComponent;
public class EllipseWindow extends JComponent{
    public void paintComponent(Graphics g){
    	Graphics2D g2 = (Graphics2D) g;
    	g2.drawOval(0,0,getWidth(),getHeight());
    	g2.setColor(Color.cyan);
    	g2.fillOval(0,0,getWidth(),getHeight());
    }
}
