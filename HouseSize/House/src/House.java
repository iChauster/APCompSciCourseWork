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
   private int height;
   private int width;
   /**
      Constructor to initiate the bottom left corner
      @param x the left corner coordinate
      @param y the bottom corner coordinate
   */
   public House(int x, int y, int xSize, int ySize)
   {
      xPosition = x;
      yPosition = y; 
      height = xSize;
      width = ySize;
   }

   /**
      Draws the house
      @param g2 the graphics context
   */
   public void draw(Graphics2D g2)
   {
      Rectangle rect = new Rectangle(xPosition,(yPosition- height),width,height);
      g2.setColor(Color.white);
      g2.fill(rect);
      g2.setColor(Color.black);
      Rectangle door = new Rectangle((int)(xPosition + (0.2 * width)),(int)(yPosition - (0.5 * height)),(int)(0.2 * width),(int)(0.5*height));
      g2.fill(door);
      Rectangle window = new Rectangle((int)(xPosition + (0.6 * width)), (int)(yPosition - (0.4 * height)), (int)(0.2 * width),(int)(0.2 * height));
      g2.fill(window);
      g2.setColor(Color.white);
      g2.drawLine(xPosition,yPosition-height,(int)(xPosition+(0.5* width)),yPosition-(height * 3 / 2));
      g2.drawLine(xPosition+width,yPosition-height,(int)(xPosition+(0.5 * width)),yPosition-(height * 3 / 2));
     
      
   }


}
