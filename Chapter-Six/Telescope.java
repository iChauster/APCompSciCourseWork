import java.awt.Color;
public class Telescope
{
   public static void main(String[] args)
   {
      Picture pic = new Picture();
      pic.load("queen-mary.png");
      double radius = Math.max(pic.getWidth(),pic.getHeight()) * 0.4;
      double centerX = pic.getWidth() / 2.0;
      double centerY = pic.getHeight() / 2.0;
      for (int x = 0; x < pic.getWidth(); x++)
      {
         for (int y = 0; y < pic.getHeight(); y++)
         {  
            double distFromX = x - centerX;
            double distFromY = y - centerY;
            double distToCenter = Math.sqrt(Math.pow(distFromX,2) + Math.pow(distFromY,2));
            if(distToCenter > radius){
               Color black = new Color(0,0,0);
               pic.setColorAt(x,y,black);
            }
         }
      }
   }

}
