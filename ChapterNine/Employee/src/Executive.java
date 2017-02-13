/**
 * @(#)Executive.java
 *
 *
 * @author 
 * @version 1.00 2017/2/2
 */


public class Executive extends Manager{

    public Executive(String n, double s, String d) {
    	super(n,s,d);
    }
    public String toString(){
    	return "Executive : " + super.toString();
    }
    
    
}