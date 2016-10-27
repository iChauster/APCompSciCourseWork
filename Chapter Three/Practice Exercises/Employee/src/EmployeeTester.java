/**
 * @(#)EmployeeTester.java
 *
 *
 * @author 
 * @version 1.00 2016/10/10
 */


public class EmployeeTester {

    public static void main(String[] args){
    	Employee emp = new Employee("Hacker, Harry", 50000);
    	emp.raiseSalary(10);
    	System.out.println(emp.getSalary());
    }
}