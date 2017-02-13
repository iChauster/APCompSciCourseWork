/**
 * @(#)HourlyWorker.java
 *
 *
 * @author 
 * @version 1.00 2017/2/6
 */


public class HourlyWorker extends Worker {

    public HourlyWorker(String n, double s) {
    	super(n,s);
    	super.getSalary();
    }
    public double computePay(int hours){
    	double pay = 0;
    	if(hours > 40){
    		pay += super.getSalary() * hours + super.getSalary() * 0.5 * (hours-40);
    	}else{
    		pay = super.getSalary() * hours;
    	}
    	return pay;
    }
    
    
}