public class CircuitClass {
	
	private int firstSwitch = 0;
	private int secondSwitch = 1;
	private int firstSwitchState;
	private int secondSwitchState;
	private int lampState;
	
	public int getSwitchState(int switchNum){
		if(switchNum == firstSwitch){
			return firstSwitchState;
		}else if (switchNum == secondSwitch){
			return secondSwitchState;
		}
	}
	public int getLampState(){
		return lampState;
	}
	public void toggleSwitch(int switchNum){
		if(switchNum == firstSwitch){
			if(firstSwitchState == 0){
				firstSwitchState = 1;
			}else{
				firstSwitchState = 0;
			}
		}else{
			if(secondSwitchState == 0){
				secondSwitchState = 1;
			}else{
				secondSwitchState = 0;
			}
		}
	}
	
    public CircuitClass() {
    	firstSwitchState = 0;
    	secondSwitchState = 0;
    }
    
    
}


