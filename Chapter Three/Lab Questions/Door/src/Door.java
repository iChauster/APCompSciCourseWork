/**
 * @(#)Door.java
 *
 * Door application
 *
 * @author 
 * @version 1.00 2016/10/4
 */
 
public class Door {
    private String state;
    private String name;
   
    public Door(){
    	
    }
    public Door(String doorState, String doorName){
    	state = doorState;
    	name = doorName;
    }
    public void open(){
    	state = "open";
    }
    public void close(){
    	state = "close";
    }
    public String getName(){
    	return name;
    }
    public String getState(){
    	return state;
    }
    public void setName(String newName){
    	name = newName;
    }
    /*
     * state is an instance variable;
     * newState is a local variable, a formal and explicit parameter to 
     * the setState function. They exist when a method is called and accessed
     * from inside the statements in the method */
     
    public void setState(String newState){
    	state = newState;
    }
    
}
