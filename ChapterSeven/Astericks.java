import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
public class Astericks {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		boolean done = false;
		ArrayList<Double> l = new ArrayList<Double>();
		ArrayList<Double> findLarge = new ArrayList<Double>();
		while(!done){
			System.out.print("Enter a number: ");
			if(input.hasNextDouble()){
				double du = input.nextDouble();
				l.add(du);
				findLarge.add(du);
			}else{
				done = true;
			}
			
		}
		Collections.sort(findLarge);
		Collections.reverse(findLarge);
		double max = findLarge.get(0);
		int i = 0;
		boolean valid = false;
		while(!valid){
			if(max == 0){
				i ++;
				max = findLarge.get(i);
			}else{
				valid = true;
			}
		}
		for(int j = 0; j < l.size(); j ++){
			l.set(j,l.get(j)/max);
		}
		System.out.println(l);
		for(int z = 0; z < l.size(); z ++){
			for(int go = 0; go < l.get(z) * 40; go ++){
				System.out.print("*");
			}
			System.out.println();
		}

	}
}