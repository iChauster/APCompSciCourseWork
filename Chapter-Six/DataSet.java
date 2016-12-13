import java.util.Scanner;
public class DataSet{
	private double sum = 0.0;
	private int entries = 0;
	public DataSet() {

	}	
	public void add(double value){
		sum += value;
		entries ++;
	}
	public double getAverage(){
		return sum / entries;
	}
	public double getStandardDev(){
		return Math.sqrt((Math.pow(sum,2) - (1.0 / entries) * Math.pow(sum,2)) / entries - 1);
	}
	public static void main(String[] args){
		DataSet ds = new DataSet();
		boolean done = false;
		Scanner input = new Scanner(System.in);
		do{
			System.out.println("Enter a number, or something else to quit : ");
			if(input.hasNextDouble()){
				double a = input.nextDouble();
				ds.add(a);
			}else{
				System.out.println("Calculating...");
				done = true;
			}
		}while(!done);
		System.out.println("Average : " + ds.getAverage() + " getStandardDev : " + ds.getStandardDev());
	}

}