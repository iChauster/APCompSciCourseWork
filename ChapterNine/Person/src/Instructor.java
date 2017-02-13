/**
 * @(#)Person.java
 *
 * Person application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 
public class Instructor extends Person {
	private double salary;
	
    public Instructor(String n, String y, double s){
    	super(n,y);
    	this.salary = s;
    }
    public String toString(){
    	return super.toString() + "Salary : " + salary;
    }
}
