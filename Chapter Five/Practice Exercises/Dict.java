import java.util.*;

public class Dict{
	public static void main(String[] args){
		System.out.println("Please enter three Strings : ");
		Scanner input = new Scanner(System.in);
		ArrayList<String> str = new ArrayList<String>();
		int x = 0;
		while(str.size() <= 2){
			str.add(input.next());
		}
		String one = str.get(0);
		String two = str.get(1);
		String three = str.get(2);
		if(one.compareTo(two) < 0 && one.compareTo(three) < 0){
			System.out.println(one);
			if(two.compareTo(three) < 0){
				System.out.println(two);
				System.out.println(three);
			}else{
				System.out.println(three);
				System.out.println(two);
			}
		}else if(two.compareTo(one) < 0 && two.compareTo(three) < 0){
			System.out.println(two);
			if(one.compareTo(three) < 0){
				System.out.println(one);
				System.out.println(three);
			}else{
				System.out.println(three);
				System.out.println(one);
			}
		}else if(three.compareTo(one) < 0 && three.compareTo(two) < 0){
			System.out.println(three);
			if(two.compareTo(one) < 0){
				System.out.println(two);
				System.out.println(one);
			}else{
				System.out.println(one);
				System.out.println(two);
			}
		}
		
	}
}