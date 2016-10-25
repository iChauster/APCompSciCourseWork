/**
 * @(#)TwoInts.java
 *
 * TwoInts application
 *
 * @author 
 * @version 1.00 2016/10/21
 */
 import java.util.Scanner;
public class TwoIntsEnhanced {
    
    public static void main(String[] args) {
    	Scanner in = new Scanner(System.in);
    	System.out.print("First Int : ");
    	int first = in.nextInt();
    	System.out.print("Second Int : ");
    	int second = in.nextInt();
    	int sum = first + second;
    	int diff = first - second;
    	int prod = first * second;
    	double avg = (first + second) / 2.0;
    	double dist = Math.abs(diff);
    	int max = Math.max(first, second);
    	int min = Math.min(first,second);
    	System.out.printf("Sum %5d " + sum);
    	System.out.println("Diff " + diff);
    	System.out.println("Product " + prod);
    	System.out.println("Average " + avg);
    	System.out.println("Distance " + dist);
    	System.out.println("Max " + max);
    	System.out.println("Min " + min);
    	
    }
}
