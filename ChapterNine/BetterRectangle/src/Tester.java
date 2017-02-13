import java.awt.Point;
public class Tester{
	public static void main(String[] args){
		Point p = new Point(10,10);
		BetterRectangle r = new BetterRectangle(p, 20, 10);
		System.out.println(r);
	}
}