/**
 * @(#)BetterRectangle.java
 *
 * BetterRectangle application
 *
 * @author 
 * @version 1.00 2017/2/8
 */
 import java.awt.Rectangle;
 import java.awt.Point;
public class BetterRectangle extends Rectangle {
    
    public BetterRectangle(Point p, int w, int h) {
    	//super();
    	super.setLocation(p);
    	super.setSize(w,h);
    }
    public double getPerimeter(){
    	double w = super.getWidth();
    	double h = super.getHeight();
    	return 2*w + 2*h;
    }
    public double getArea(){
    	double w = super.getWidth();
    	double h = super.getHeight();
    	return w * h;
    }
}
