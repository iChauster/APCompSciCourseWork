/**
 * @(#)Circles.java
 *
 * Circles application
 *
 * @author 
 * @version 1.00 2016/10/21
 */
 import java.util.Scanner;
public class Circles {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Radius : ");
    	int radius = in.nextInt();
    	double area = Math.PI * Math.pow(radius,2);
    	double circumference = Math.PI * 2 * radius;
    	double volume = (4.0/3.0) * Math.PI * Math.pow(radius,3);
    	double surfA = 4 * Math.PI * Math.pow(radius,2);
    	System.out.println("Area : " + Math.round(area*100)/100.0 + " Circumference : " + Math.round(circumference*100)/100.0);
    	System.out.println("Volume : " + Math.round(volume*100)/100.0 + " Surface Area " + Math.round(surfA)/100.0);
    }
}
