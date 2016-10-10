/**
 * @(#)VendingMachineTester.java
 *
 *
 * @author 
 * @version 1.00 2016/10/4
 */


public class VendingMachineTester {

    public static void main(String[] args) {
      VendingMachine machine = new VendingMachine();
      machine.fillUp(10); // Fill up with ten cans
      machine.insertToken();
      machine.insertToken();
      System.out.print("Token count: ");
      System.out.println(machine.statusTokens());
      System.out.println("Expected: 2");
      System.out.print("Can count: ");
      System.out.println(machine.statusCans()); 
      System.out.println("Expected: 8");
   } 
    
    
}