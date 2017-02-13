/**
 * @(#)Clock.java
 *
 * Clock application
 *
 * @author 
 * @version 1.00 2017/2/8
 */
 import java.util.Date;

public class WorldClock {
    private int offset;
    private Date d = new Date();
    public WorldClock(int num) {
    	d = new Date();
    	d = new Date(d.getTime() + (1000 * 60 * 60 * num));
    }
    public int getHours(){
    	return d.getHours();
    }
    public int getMinutes() {
    	return d.getMinutes();
    }
    public String getTime() {
    	return "Hour : " + getHours() + " Minutes : " + getMinutes();
    }
}
