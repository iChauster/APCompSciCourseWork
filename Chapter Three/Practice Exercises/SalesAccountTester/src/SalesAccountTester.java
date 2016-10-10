/**
 * @(#)SalesAccountTester.java
 *
 * SalesAccountTester application
 *
 * @author 
 * @version 1.00 2016/10/6
 */
 
public class SalesAccountTester {
    
    public static void main(String[] args) {
    	
    	SavingsAccount sa = new SavingsAccount(1000,10);
    	sa.addInterest(15);
    	System.out.println(sa.toString());
    	
    }
}
