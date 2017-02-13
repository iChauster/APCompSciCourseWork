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
   public void withdraw(double amount) 
   {  
   	if(getBalance() - amount >= 0){
   		super.withdraw(amount);
   	}else{
   		if(!hasOverdrafted){
   		
   		System.out.println("You can't withdraw! First time : $20 being charged.");
   		super.withdraw(20);
   		hasOverdrafted = true;
   		}
   		else{
   			System.out.println("You can't withdraw! Not your first offense: $30 being charged.");
   		super.withdraw(30);
   		}
   	}
   }
    public CheckingAccount(double initialBalance)
   {  
      super(initialBalance);
      this.hasOverdrafted = false;
   }
}
