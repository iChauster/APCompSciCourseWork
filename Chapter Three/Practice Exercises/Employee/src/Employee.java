/**
 * @(#)Employee.java
 *
 * Employee application
 *
 * @author 
 * @version 1.00 2016/10/10
 */
 
public class Employee {
   private String name;
   private double salary;
   public Employee(String employeeName, double currentSalary){
   	this.name = employeeName;
   	this.salary = currentSalary;
   }
   public String getName(){
   	return this.name;
   }
   public double getSalary(){
   	return this.salary;
   }
   public void raiseSalary(double byPercent){
   	byPercent = byPercent / 100.0;
   	double percentRaise = 1.00 + byPercent;
   	this.salary = Math.round(this.salary * percentRaise);
   }
   
}
