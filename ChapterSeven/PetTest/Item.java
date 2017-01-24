public class Item {
    
    double price;
    boolean isPet;
    int quantity;
    
    public Item() {
   	  price = 0;
   	  isPet = false;
   	  quantity = 0;
    }
    public Item(double d, boolean isPet, int quantity) {
   	 this.price = d;
   	 this.isPet = isPet;
   	 this.quantity = quantity;
    }
}
