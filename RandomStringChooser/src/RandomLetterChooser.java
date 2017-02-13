/**
 * @(#)RandomLetterChooser.java
 *
 *
 * @author 
 * @version 1.00 2017/2/13
 */


public class RandomLetterChooser extends RandomStringChooser {

    public RandomLetterChooser(String str){
    	
    	super(getSingleLetters(str));
    }
    public static String[] getSingleLetters(String str){
    	String[] s = new String[str.length()];
    	for(int i = 0; i < str.length(); i++){
    		s[i] = ""+str.charAt(i);
    	}
    	return s;
    }
    
    
}