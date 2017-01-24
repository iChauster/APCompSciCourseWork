import java.util.ArrayList;
import java.util.Scanner;

public class PetTester {

	public static void main(String[] args) {
   	 
    	Scanner input = new Scanner(System.in);
   	 
    	ArrayList<Item> invoice = new ArrayList<Item>();
    	Invoice items = new Invoice(invoice);

    	Item i = new Item();
        System.out.println("Enter a price, or -1 : ");
    	
        double price = 0.0;
    	String pet = "";
    	
        price = input.nextDouble();

    	while (price != -1) {
            
        	i.price = price;
        	System.out.println("Enter quantity: ");
        	i.quantity = input.nextInt();
        	System.out.println("Is it a pet (y/n)");
        	pet = input.next();
        	boolean b = false;
        	if (pet.equalsIgnoreCase("y")) {
            	b = true;
        	}
        	else {
            	b = false;
        	}
        	i.isPet = b;
        	items.add(i);
        	System.out.println("Enter a price, -1 if you are done adding items: ");
        	price = input.nextDouble();
    	}
    	double discount = items.getDiscount();
    	System.out.println("Here is the discount you are eligible for: $" + discount + " off.");
    	input.close();
	}

}
