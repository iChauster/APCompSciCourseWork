/**
 * @(#)VendingMachine.java
 *
 * VendingMachine application
 *
 * @author 
 * @version 1.00 2016/10/4
 */
 /* Methods : statusCans returns # cans and  -> getCanCount
  * statusTokens : returns # tokens -> getTokenCount
  * fillUp (int cans)
  * insertToken()
  *  */
public class VendingMachine {
	private int cans;
	private int tokens;
    public VendingMachine(){
    	cans = 10;
   		tokens = 0;
    }
    public VendingMachine(int newCans){
    	cans = newCans;
    	tokens = 0;
    }
    public int statusCans(){
    	return cans;
    }
    public int statusTokens(){
    	return tokens;
    }
    public void fillUp(int newCans){
    	cans += newCans;
    }
    public void insertToken(){
    	if(cans > 0){
    		tokens ++;
    		cans --;
    	}
    }
    
    
}
