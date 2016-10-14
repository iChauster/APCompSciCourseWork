/**
 * @(#)BankAccount.java
 *
 * BankAccount application
 *
 * @author 
 * @version 1.00 2016/10/6
 */
 
public class BankAccount {
    private int balance;
    
    public BankAccount(){
    	balance = 0;	
    }
    public BankAccount(int startingBalance){
    	balance = startingBalance;
    }
    public void addInterest(int interest){
    	double inter = interest/100.0;
    	balance *= 1.0 + inter;
    }
    public void deposit(int m){
    	balance += m;
    }
    public void withdraw(int amount){
    	balance -= amount;
    }
 	public String toString(){
 		return Integer.toString(balance);
 	}
}
