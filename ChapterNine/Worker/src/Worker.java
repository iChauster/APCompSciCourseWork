/**
 * @(#)Worker.java
 *
 * Worker application
 *
 * @author 
 * @version 1.00 2017/2/6
 */
 
public class Worker {
    
    private String name;
    private double salary;
    
    public Worker(String n, double s){
    	name = n;
    	salary = s;
    }
    public double computePay(int hours){
    	return hours;
    }
    public double getSalary(){
    	return salary;
    }
}
