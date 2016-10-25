/**
 * @(#)CashRegisterTester.java
 *
 * CashRegisterTester application
 *
 * @author 
 * @version 1.00 2016/10/6
 */
 
public class CashRegisterTester {
    
    public static void main(String[] args) {
    	CashRegister cr = new CashRegister();
    	cr.addItem("Veggies", 25.00);
    	cr.addItem("Broccoli",10.00);
    	System.out.println(cr.printReceipt());
    }
}
