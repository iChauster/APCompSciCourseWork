import javax.swing.JComponent;
import java.awt.*;

public class BarChartComponent extends JComponent {
	private int height;
	private int width;
	
	public BarChartComponent(int w, int h){
		width = w;
		height = h;
	}
	public void paintComponent(Graphics g){
		Graphics2D g2 = (Graphics2D) g;
		String[] s = {"Golden Gate", "Brooklyn","Delaware Memorial","Mackinac"};
		int[] i = {4200,1595,2150,3800};

		BarChart bc = new BarChart(width,height,s,i);
		bc.draw(g2);
	}
}