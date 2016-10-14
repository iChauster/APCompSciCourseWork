/**
 * @(#)Circuit.java
 *
 *
 * @author 
 * @version 1.00 2016/10/4
 */


public class Circuit {
	private int firstSwitchState;
	private int secondSwitchState;
	private int lampState;
	
    public Circuit() {
    	
    }
    
    public int getFirstSwitchState(){
    	return firstSwitchState;
    }
    public int getSecondSwitchState(){
    	return secondSwitchState;
    }
    public int getLampState(){
    	return lampState;
    }
    public void toggleFirstSwitch(){
    	if(firstSwitchState == 1){
    		firstSwitchState = 0;
    	}else{
    		firstSwitchState = 1;
    	}
    }
    
    
}