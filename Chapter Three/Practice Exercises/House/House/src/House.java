import java.awt.Graphics2D;
import java.awt.Rectangle;
import java.awt.geom.Line2D;
import java.awt.Color;
/**
   This class draws a house by allowing the user to specify houses of different sizes.
*/
public class House
{
   private int xPosition;
   private int yPosition;
   /**
      Constructor to initiate the bottom left corner
      @param x the left corner coordinate
      @param y the bottom corner coordinate
   */
   public House(int x, int y)
   {
      xPosition = x;
      yPosition = y; 
   }

   /**
      Draws the house
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle rect = new Rectangle(xPosition,yPosition-50,50,50);
      g2.setColor(Color.white);
      g2.fill(rect);
      g2.setColor(Color.black);
      Rectangle door = new Rectangle(xPosition + 10, yPosition-25,10,25);
      g2.fill(door);
      Rectangle window = new Rectangle(xPosition + 30, yPosition - 20, 10,10);
      g2.fill(window);
      g2.setColor(Color.white);
      g2.drawLine(xPosition,yPosition-50,xPosition+25,yPosition-75);
      g2.drawLine(xPosition+50,yPosition-50,xPosition+25,yPosition-75);
     
      
   }


}
