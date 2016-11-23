import java.util.Scanner;

public class Largest{
	public static void main(String[] args){
		System.out.println("Please enter three doubles : ");
		Scanner input = new Scanner(System.in);
		System.out.println("First : ");
		double a = input.nextDouble();
		System.out.println("Second : ");
		double b = input.nextDouble();
		System.out.println("Third : ");
		double c = input.nextDouble();

		System.out.println(Math.max(a, Math.max(b,c)));
	}
}