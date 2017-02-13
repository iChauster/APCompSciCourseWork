/**
 * @(#)RandomStringChooser.java
 *
 * RandomStringChooser application
 *
 * @author 
 * @version 1.00 2017/2/13
 */
 import java.util.Random;
 import java.util.ArrayList;
public class RandomStringChooser {
    ArrayList wordArray;
    public static void main(String[] args) {
    	String[] wa = {"wheels","on","the","bus"};
    	RandomStringChooser sChooser = new RandomStringChooser(wa);
    	for (int k = 0; k < 6; k ++){
    		System.out.print(sChooser.getNext() + " ");
    	}
    	System.out.println();
    	RandomLetterChooser letterChooser = new RandomLetterChooser("cat");
    	for(int k = 0; k < 4; k++){
    		System.out.print(letterChooser.getNext());
    	}
    	
    }
    public RandomStringChooser(String[] arr){
  		wordArray = new ArrayList<String>(); 	
  		for(String s : arr){
  			wordArray.add(s);
  		}
    }
    public String getNext(){
    	Random r = new Random();
    	if(wordArray.size() < 1){
    		return "NONE";
    	}
    	int n = r.nextInt(wordArray.size());
    	String re = (String)wordArray.get(n);
    	wordArray.remove(n);
    	return re;
    }
}
