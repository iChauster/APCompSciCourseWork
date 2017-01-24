
import java.util.ArrayList;
import java.util.Scanner;

public class StoreTester {

public static void main(String[] args) {
   	 
    	Scanner input = new Scanner(System.in);
    	ArrayList<Sale> store = new ArrayList<Sale>();
    	Store items = new Store(store);
   	 
    	System.out.println("Number of sales?");
    	int count = input.nextInt();
    	for (int i = 0; i < count; i++) {
   		 System.out.println("Print customer's name: ");
   		 String name = input.next();
   		 System.out.println("Print amount of customer's sale: ");
   		 double am = input.nextDouble();
   		 items.addSale(name, am);
    	}
    	System.out.println(items.nameofBestCustomer() + " is the best customer!");
      System.out.println(items.nameOfBestCustomers(5));
	}
}





