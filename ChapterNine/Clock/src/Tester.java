/**
 * @(#)Tester.java
 *
 *
 * @author 
 * @version 1.00 2017/2/8
 */


public class Tester {

    public static void main(String[] args) {
    	Clock c = new Clock();
    	System.out.println(c.getTime());
    	WorldClock a = new WorldClock(3);
    	System.out.println(a.getTime());
    	
    }
    
    
}