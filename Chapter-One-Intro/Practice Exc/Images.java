import java.net.URL;
import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
public class Images
{
   public static void main(String[] args) throws Exception
   {
      URL imageLocation = new URL(
            "http://i.imgur.com/9bbqgv7.png");
      JOptionPane.showMessageDialog(null, "Hi!", "What's good?", 
            JOptionPane.PLAIN_MESSAGE, new ImageIcon(imageLocation));
   }
}