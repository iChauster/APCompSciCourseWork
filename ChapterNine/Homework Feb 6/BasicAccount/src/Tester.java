/**
   This program tests the SavingsAccount class.
*/
public class Tester
{
   public static void main(String[] args)
   {
      BasicAccount momsSavings = new BasicAccount(5);

      momsSavings.withdraw(7);
      System.out.println(momsSavings);
      CheckingAccount s = new CheckingAccount(100);
      s.withdraw(101);
      System.out.println(s);
      s.withdraw(81);
      System.out.println(s);
      
      
   }
}

