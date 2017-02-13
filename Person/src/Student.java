/**
 * @(#)Person.java
 *
 * Person application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 
public class Student extends Person {
	private String major;
	
    public Student(String n, String y, String m){
    	super(n,y);
    	this.major = m;
    }
    public String toString(){
    	return super.toString() + "Major : " + major;
    }
}
