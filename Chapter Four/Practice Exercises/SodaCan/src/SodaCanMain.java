/**
 * @(#)SodaCan.java
 *
 * SodaCan application
 *
 * @author 
 * @version 1.00 2016/10/21
 */
 import java.util.Scanner;
public class SodaCanMain {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Height : ");
    	int a = in.nextInt();
    	System.out.print("Diameter : ");
    	int b = in.nextInt();
    	SodaCan sc = new SodaCan(a,b);
    	System.out.println("Volume : " + Math.round(sc.getVolume()*100)/100.0);
    	System.out.println("Surface Area : " + Math.round(sc.getSurfaceArea()*100)/100.0);
    }
}
