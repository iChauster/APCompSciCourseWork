/**
 * @(#)Button.java
 *
 * Button application
 *
 * @author 
 * @version 1.00 2016/10/4
 */
 
public class Button {
    
    private int tally;
    private int limit;
    public Button(){
    	
    }
    public void undo(){
    	if(tally > 0){
    		tally --;
    	}
    }
    public void click(){
    	if(tally < limit){
    		tally ++;
    	}
    }
    public void setLimit(int maximum){
    	limit = maximum;
    }
    
}
