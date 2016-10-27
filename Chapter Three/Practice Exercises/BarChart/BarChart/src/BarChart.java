/**
 * @(#)BarChart.java
 *
 * BarChart application
 *
 * @author 
 * @version 1.00 2016/10/17
 */
 import java.awt.*;
public class BarChart {
	private int width;
	private int height;
	private String[] s;
	private int[] v;
    public BarChart(int w, int h, String[] name, int[] value){
    	width = w;
    	height = h;
    	s = name;
    	v = value;
    	System.out.println(width);
    	System.out.println(height);
    }
    public void draw(Graphics2D g2){
    	
    	int max = 0;
    	for (int i = 0; i < v.length; i ++){
    		if (v[i] > max){
    			max = v[i];
    		}
    	}
    	double factor = max/width;
    	System.out.println(factor);
    	int intervals = height/s.length;
    	for(int i = 0; i < v.length; i ++){
   			System.out.println(v[i]);
   			int a = (int)(v[i] / factor);
   			Rectangle re = new Rectangle(0,intervals * i,a,intervals);
   			g2.draw(re);
    	}
    	
    	
    	
    }
}
