public class Sale {

    double price;
    public String name;
    
    public Sale(){
   	 this.price = 0;
   	 this.name = "";
    }
    
    public Sale(String name, double price) {
   	 this.price = price;
   	 this.name = name;
    }
}