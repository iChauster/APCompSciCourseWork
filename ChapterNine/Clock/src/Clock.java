/**
 * @(#)Clock.java
 *
 * Clock application
 *
 * @author 
 * @version 1.00 2017/2/8
 */
 import java.util.Date;
public class Clock {
    
    public Clock() {
    	
    }
    public int getHours(){
    	return new Date().getHours();
    }
    public int getMinutes() {
    	return new Date().getMinutes();
    }
    public String getTime() {
    	return "Hour : " + getHours() + " Minutes : " + getMinutes();
    }
}
