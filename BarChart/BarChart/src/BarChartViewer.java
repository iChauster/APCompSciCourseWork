import javax.swing.*;

public class BarChartViewer {
	public static void main (String[] args){
	JFrame frame = new JFrame();

      frame.setSize(300, 500);
      frame.setTitle("BarChart");
      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

      BarChartComponent component = new BarChartComponent(frame.getWidth(),frame.getHeight());
      frame.add(component);

      frame.setVisible(true);
	}
}