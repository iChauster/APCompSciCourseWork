import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Rectangle;

/*
   This program draws a checkerboard.
*/
public class Checkerboard
{
   public void draw(Graphics g)
   {
      Graphics2D g2 = (Graphics2D) g;

      final int width = 20;
      g2.setColor(Color.BLUE);

      int y = 0;
      int x = 0;

      for (int i = 0; i < 8; i++)
      {
         for (int j = 0; j < 8; j++)
         {
            
            if(i % 2 == 0){
               if(j % 2 == 0){
                  g2.setColor(Color.BLACK);
                  
               }else{
                  g2.setColor(Color.WHITE);
               }
               g2.fillRect(40 * i, 40 * j, 40 , 40);
            }else{
               if(j % 2 == 0){
                  g2.setColor(Color.WHITE);
               }else{
                  g2.setColor(Color.BLACK);
               }
               
               g2.fillRect(40 * i, 40 * j, 40 , 40);
            }
         }
      }
   }
}
