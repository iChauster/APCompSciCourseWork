/**
 * @(#)HourlyWorker.java
 *
 *
 * @author 
 * @version 1.00 2017/2/6
 */


public class SalaryWorker extends Worker{

    public SalaryWorker(String n, double s) {
    	super(n,s);
    	super.getSalary();
    }
    public double computePay(int hours){
    	
    	return super.getSalary() * hours;
    	
    }
    
    
}