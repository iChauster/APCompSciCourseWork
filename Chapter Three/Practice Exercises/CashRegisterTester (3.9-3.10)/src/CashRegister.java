/**
 * @(#)CashRegister.java
 *
 *
 * @author 
 * @version 1.00 2016/10/6
 */


public class CashRegister {
	String cash;
	private double salesTotal;
	private int salesCount;
    public CashRegister() {
    	cash = "";
    }
    public void addItem(String item, double price){
    	String message = item + " " + String.valueOf(price) + "\n";
    	salesTotal += price;
    	salesCount ++;
    	cash = cash.concat(message);
    }
    public String printReceipt(){
    	return cash;
    }
    public double getSalesTotal(){
    	return salesTotal;
    }
    public int getSalesCount(){
    	return salesCount;
    }
    public void reset(){
    	salesCount = 0;
    	salesTotal = 0;
    }
    
    
}