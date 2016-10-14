/**
 * @(#)DoorTester.java
 *
 *
 * @author 
 * @version 1.00 2016/10/4
 */


public class DoorTester {

    public static void main(String[] args){
    	Door frontDoor = new Door("Front","open");
    	System.out.println("The front door is " + frontDoor.getState());
      	System.out.println("Expected:  open");
      	Door backDoor = new Door("Back", "closed");
      	System.out.println("The back door is " + backDoor.getState());
      	System.out.println("Expected:  closed");        
      	// Use the mutator to change the state variable
     	backDoor.setState("open");
     	//implicit parameter is "open", explicit parameter backDoor
      	System.out.println("The back door is " + backDoor.getState());
      	System.out.println("Expected:  open");
      	// Add code to test the setName mutator here 
      	backDoor.setName("back");
      	Door sideDoor = new Door("Side","closed");
      	sideDoor.open();
      	System.out.println("The side door is " + sideDoor.getState());
      	
    }
}