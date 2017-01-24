import java.util.ArrayList;
public class Invoice {
    
    double d = 0;
    ArrayList<Item> invoice;
    
    public Invoice(){
   	 
    }
    public Invoice(ArrayList<Item> invoice) {
   	 
   	 this.invoice = invoice;
    }
    
    public void add(Item anItem) {
   	 
   	 invoice.add(anItem);
    }
    
    public double getDiscount(){
   	 
   	 double total = 0;
   	 for (int i = 0; i < invoice.size(); i++) {
   		 if (invoice.get(i).isPet == false) {
   			 total += invoice.get(i).price;
   		 }
   	 }
   	 d = total * 0.20;
   	 return d;
    }
}