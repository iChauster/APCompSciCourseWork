/**
 * @(#)Numbers.java
 *
 * Numbers application
 *
 * @author 
 * @version 1.00 2016/10/21
 */
 import java.text.DecimalFormat;
 import java.util.Scanner;
public class Numbers {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("Enter number : ");
    	int n = in.nextInt();
    	DecimalFormat dec = new DecimalFormat("#.00");
    	dec.setGroupingSize(3);
    	dec.setGroupingUsed(true);
    	System.out.println(dec.format(n));
    	
    }
}
