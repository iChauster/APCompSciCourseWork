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
    	firstSwitchState = 0;
    	secondSwitchState = 0;
    	lampState = 0;
    }
    public String toString(){
    	return "First -> " + firstSwitchState + " Second -> " + secondSwitchState + " Lamp -> " + lampState;
    	
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
    public void toggleSecondSwitch(){
    	if(secondSwitchState == 1){
    		secondSwitchState = 0;
    	}else{
    		secondSwitchState = 1;
    	}
    }
    public void toggleLampState(){
    	if(lampState == 1){
    		lampState = 0;
    	}else{
    		lampState = 1;
    	}
    }
    
    
}