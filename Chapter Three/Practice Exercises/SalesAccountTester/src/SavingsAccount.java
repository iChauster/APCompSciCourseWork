/**
 * @(#)SavingsAccount.java
 *
 *
 * @author 
 * @version 1.00 2016/10/6
 */


public class SavingsAccount {
	private int balance;
	private int interest;
    public SavingsAccount() {
    	
    }
    public SavingsAccount(int bal, int inter) {
    	balance = bal;
    	interest = inter;
    }
    public void addInterest(int newInt){
    	interest += newInt;
    }
    public String toString(){
    	double interes = interest/100.0;
    	double value = balance * (1.00 + interes);
    	return "interest of " + interes + " value of " + value;
    }
    
    
}