/*
a. Swap the first and last elements in the array.

b. Shift all elements by one to the right and move the last element into the first

position. For example, 1 4 9 16 25 would be transformed into 25 1 4 9 16.

c. Replace all even elements with 0.

d. Replace each element except the first and last by the larger of its two neighbors.

e. Remove the middle element if the array length is odd, or the middle two

elements if the length is even.

f. Move all even elements to the front, otherwise preserving the order of the

elements.

g. Return the second-largest element in the array.

h. Return true if the array is currently sorted in increasing order.

i. Return true if the array contains two adjacent duplicate elements.

j. Return true if the array contains duplicate elements (which need not be

adjacent).*/
import java.util.Arrays;
public class Arr {
	private static int[] x = {1,2,3,4,5};
	public static void main(String[] args){
		printArray(swapFirstAndLast(x));
		printArray(shiftRight(x));
		printArray(replaceEven(x));
		printArray(largestNeigh(x));
		printArray(replaceMiddle(x));
		printArray(front(x));
		System.out.println(secondLargest(x));
		System.out.println(adjacent(x));
		System.out.println(notAdjacent(x));
	}
	public static void printArray(int[] a){
		for(int num : a){
			System.out.print(num + " ");
		}
		System.out.println();
	}
	public static int[] swapFirstAndLast(int[] arr){
		int scam[] = arr.clone();
		int first = arr[0];
		scam[0] = arr[arr.length - 1];
		scam[arr.length - 1] = first;
		return scam;
	}
	public static int[] shiftRight(int[] arr){
		int[] scam = new int[arr.length];
		for(int i = 0; i < arr.length - 1; i ++){
			scam[i + 1] = arr[i];
		}
		scam[0] = arr[arr.length - 1];
		return scam;
	}
	public static int[] replaceEven(int [] arr){
		int[] scam = arr.clone();
		for (int i = 0; i < scam.length; i ++){
			if(scam[i] % 2 == 0){
				scam[i] = 0;
			}
		}
		return scam;
	}
	public static int[] largestNeigh(int[] arr){
		int[] scam = new int[arr.length];
		for (int i = 1; i < arr.length - 1; i ++){
			scam[i] = Math.max(arr[i-1],arr[i+1]);
		}
		scam[0] = arr[0];
		scam[scam.length - 1] = arr[arr.length - 1];
		return scam;
	}
	public static int[] replaceMiddle(int[] arr){
		int[] scam = new int[arr.length];
		if(arr.length % 2 == 0){
			int removalIndex = arr.length / 2;
			removalIndex --;
			for(int i = 0; i < arr.length; i ++){
				if(i == removalIndex || i == removalIndex + 1){

				}else{
					scam[i] = arr[i];
				}
			}

		}else{
			int removalIndex = arr.length/2;
			for(int i = 0; i < arr.length; i ++){
				if(i == removalIndex){

				}else{
					scam[i] = arr[i];
				}
			}
		}
		return scam;
	}
	public static int[] front(int[] arr){
		int[] scam = new int[arr.length];
		int[] lat = new int[arr.length];
		int siz = 0;
		int a = 0;
		for (int i = 0; i < arr.length; i ++){
			if(arr[i] % 2 == 0){
				scam[siz] = arr[i];
				siz ++; 
			}else{
				lat[a] = arr[i];
				a ++;
			}
		}
		printArray(lat);
		for (int b : lat){
			if(b != 0){
				scam[siz] = b;
				siz ++;
			}
		}
		return scam;
	}
	public static int secondLargest(int[] num){
		Arrays.sort(num);
		return num[num.length - 2];
	}
	public boolean sorted(int[] num){
		boolean a = true;
		for(int i = 1; i < num.length; i ++){
			if(num[i] > num[i-1]){

			}else{
				a = false;
			}
		}
		return a;
	}
	public static boolean adjacent(int[] num){
		boolean dup = false;
		for (int i = 1; i < num.length; i ++){
			if(num[i] == num[i - 1]){
				dup = true;
			}
		}
		return dup;
	}
	public static boolean notAdjacent(int[] num){
		Arrays.sort(num);
		return adjacent(num);
	}
}