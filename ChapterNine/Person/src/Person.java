/**
 * @(#)Person.java
 *
 * Person application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 
public class Person {
    private String name;
    private String yob;
    public static void main(String[] args) {
    	
    }
    public Person(String n, String y){
    	this.name = n;
    	this.yob = y;
    }
    public String toString(){
    	return "Name :" + name + " Birth : " + yob;
    }
}
