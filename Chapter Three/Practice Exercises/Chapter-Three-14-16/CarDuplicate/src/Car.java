/**
 * @(#)Car.java
 *
 * Car application
 *
 * @author 
 * @version 1.00 2016/10/10
 */
 
public class Car {
    private double mpg;
    private double gas;

   	public Car(double milesPerGallon){
   		this.mpg = milesPerGallon;
   	}
   	public void addGas(double gallons){
   		gas += gallons;
   	}
   	public void drive(double miles){
   		double gasConsumed = miles / mpg;
   		this.gas = this.gas - gasConsumed;
   	}
   	public double getGasInTank(){
   		return gas;
   	}
}
