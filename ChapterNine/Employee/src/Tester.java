/**
 * @(#)Tester.java
 *
 *
 * @author 
 * @version 1.00 2017/2/2
 */


public class Tester {

    public static void main(String[] args){
    	Manager m = new Manager("Joe", 100000, "Technology");
    	System.out.println(m);
    	Executive e = new Executive("Bill", 1000000, "Sales");
    	System.out.println(e);
    	Employee em = new Employee("Chris", 10000);
    	System.out.println(em);
    }
    
    
}