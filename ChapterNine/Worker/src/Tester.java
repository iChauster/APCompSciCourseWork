/**
 * @(#)Tester.java
 *
 *
 * @author 
 * @version 1.00 2017/2/6
 */


public class Tester {

    public static void main(String[] args){
    	
		Worker w = new  HourlyWorker("Joe", 10);
               System.out.println(w.computePay(60));
                
		Worker    a   = new  SalaryWorker("Ben", 10);
               System.out.println(a.computePay(60));

    }
    
}