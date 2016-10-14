/**
 * @(#)Circuit.java
 *
 * Circuit application
 *
 * @author 
 * @version 1.00 2016/10/4
 */
 
public class CircuitTester {
    
    public static void main(String[] args) {
    	Circuit circ = new Circuit();
    	System.out.println(circ.toString());
    	circ.toggleFirstSwitch();
    	System.out.println(circ.toString());
    	System.out.println("Expected : First -> 1 Second -> 0 Lamp -> 0");
    	circ.toggleSecondSwitch();
    	System.out.println(circ.toString());
    	System.out.println("Expected : First -> 1 Second -> 1 Lamp -> 0");
    }
}
