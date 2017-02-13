/**
 * @(#)Employee.java
 *
 * Employee application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 
public class Employee {
    private String name;
    private double salary;
   
    public Employee(String n, double s){
    	this.name = n;
    	this.salary = s;
    }
    public String toString(){
    	return "Name : " + name + " Salary : " + salary;
    }
}
