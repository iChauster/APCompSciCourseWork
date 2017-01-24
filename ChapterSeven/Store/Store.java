import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
public class Store {

    ArrayList<Sale> list = new ArrayList<Sale>();
    
    public Store(){
   	 
    }
    
    public Store(ArrayList<Sale> list){
   	 
   	 this.list = list;
    }
    
    public void addSale(String customerName, double amount) {
   	 
   	 Sale sale = new Sale(customerName, amount);
   	 list.add(sale);    
    }
    
    public String nameofBestCustomer(){
   	 
   	 Sale best = list.get(0);
   	 for (int i = 0; i < this.list.size(); i ++) {
      Sale sale = this.list.get(i);
   		 if (sale.price > best.price) {
   			 best = sale;
   		 }
   	 }
   	 return best.name;
    }
    public ArrayList<String> nameOfBestCustomers(int topN){

      if(topN > list.size()){
        ArrayList<String> top = new ArrayList<String>();
        for(int i = 0; i < list.size(); i ++){
          Sale s = list.get(i);
          top.add(s.name);
        }
        return top;
      }else{
        ArrayList<Sale> toSort = new ArrayList<Sale>(list);
        ArrayList<String> top = new ArrayList<String>();
        Collections.sort(toSort, new Comparator<Sale>() {
        @Override public int compare(Sale s1, Sale s2) {
            return (int)s1.price - (int)s2.price; // Ascending
        }

      });
        Collections.reverse(toSort);
        for(int i = 0; i < topN; i ++){
          top.add(toSort.get(i).name);
        }
        return top;
      }
    }

}






