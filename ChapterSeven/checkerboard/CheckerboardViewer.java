import java.awt.Graphics;
import javax.swing.JFrame;
import javax.swing.JComponent;

public class CheckerboardViewer
{
   public static void main(String[] args)
   {
      // Do not look at the code in the main method
      // Your code will go into the draw method of Checkerboard.java

      JFrame frame = new JFrame();

      final int FRAME_WIDTH = 400;
      final int FRAME_HEIGHT = 400;

      frame.setSize(FRAME_WIDTH, FRAME_HEIGHT);
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      JComponent component = new JComponent()
      {
         public void paintComponent(Graphics graph)
         {
            Checkerboard checkerboard = new Checkerboard();
            checkerboard.draw(graph);
         }
      };

      frame.add(component);
      frame.setVisible(true);
   }

}
