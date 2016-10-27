import javax.swing.*;

/**
   Displays a frame that shows a house.
 */
public class EllipseViewer
{
   public static void main(String[] args)
   {
      JFrame frame = new JFrame();

      frame.setSize(300, 500);
      frame.setTitle("A house");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      EllipseWindow component = new EllipseWindow();
      frame.add(component);

      frame.setVisible(true);
   }
}
