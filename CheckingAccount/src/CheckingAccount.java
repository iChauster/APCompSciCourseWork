/**
 * @(#)BasicAccount.java
 *
 * BasicAccount application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 //9.3
public class CheckingAccount extends BankAccount{
   private boolean hasOverdrafted = false;
   private int transactions = 0;
   public void withdraw(double amount) 
   {  
   	check();
   	super.withdraw(amount);
   }
   public void deposit(double amount){
   	check();
   	super.deposit(amount);
   }
   public void check(){
   	transactions ++;
   	if(transactions >= 3){
   		super.withdraw(1.0);
   	}
   }
    public CheckingAccount(double initialBalance)
   {  
      super(initialBalance);
      this.hasOverdrafted = false;
   }
}
