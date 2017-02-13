/**
 * @(#)BasicAccount.java
 *
 * BasicAccount application
 *
 * @author 
 * @version 1.00 2017/2/2
 */
 
public class BasicAccount extends BankAccount{
   //9.1
    public void withdraw(double amount) 
   {  
   	if(getBalance() - amount >= 0){
   		super.withdraw(amount);
   	}else{
   		System.out.println("You can't withdraw!");
   	}
   }
   /*9.2
   public void withdraw(double amount) 
   {  
   	if(getBalance() - amount >= 0){
   		super.withdraw(amount);
   	}else{
   		System.out.println("You can't withdraw! $30 being charged.");
   		super.withdraw(30);
   	}
   }*/
    public BasicAccount(double initialBalance)
   {  
      super(initialBalance);
   }
}
