/**
 * @(#)Manager.java
 *
 *
 * @author 
 * @version 1.00 2017/2/2
 */


public class Manager extends Employee{
	private String department;
    public Manager(String n, double s, String d) {
    	super(n,s);
    	this.department = d;
    }
    public String toString(){
    	return super.toString() + " Department : " + department;
    }
    
    
}