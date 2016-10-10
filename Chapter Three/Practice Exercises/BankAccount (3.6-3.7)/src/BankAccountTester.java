/**
 * @(#)BankAccountTester.java
 *
 *
 * @author 
 * @version 1.00 2016/10/6
 */


public class BankAccountTester {
	
	public static void main(String[] args){
		BankAccount ba = new BankAccount();
		ba.deposit(1000);
		ba.withdraw(500);
		ba.withdraw(400);
		System.out.println(ba.toString());
		BankAccount newBa = new BankAccount(1000);
		newBa.addInterest(10);
		System.out.println(newBa.toString());
		
	}
    
}