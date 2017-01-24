import java.util.Scanner;

public class TheaterSeats {

    public static void main(String[] args) {
   	 
   	 Scanner input = new Scanner(System.in);
   	 boolean picked = false;
   	 int row, column;
   	 int[][] seats = {
   	 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
   	 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
   	 {10, 10, 10, 10, 10, 10, 10, 10, 10, 10},
   	 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
   	 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
   	 {10, 10, 20, 20, 20, 20, 20, 20, 10, 10},
   	 {20, 20, 30, 30, 40, 40, 30, 30, 20, 20},
   	 {20, 30, 30, 40, 50, 50, 40, 30, 30, 20},
   	 {30, 40, 50, 50, 50, 50, 50, 50, 40, 30}
   	 };
   	 
   	  System.out.println("Pick seat by number? (y/n)");
        String ans = input.next();
        if(ans.equalsIgnoreCase("y")){
         System.out.print("Enter desired row : ");
         row = input.nextInt();
         System.out.print("Enter desired column : ");
         column = input.nextInt();
         if(row < seats.length && column < seats[0].length){
            if(seats[row][column] != 0){
               System.out.println("row : " + row + " column : " + column + " is available.");
               seats[row][column] = 0;
            }else{
              System.out.println("Seat is not available/out of bounds");
            }
         }
        }else{
         System.out.print("Enter desired price - 10,20,30,40,50 : ");
         int price = input.nextInt();
         boolean selected = false;
         int i = 0;
         while(!selected && i < seats.length * seats[0].length){
            for(int j = 0; j < seats.length && !selected; j ++){
               for(int k = 0; k < seats.length && !selected; k ++){
                  if(seats[j][k] == price){
                     System.out.println("Seat located for $" + price);
                     System.out.println("Do you want seat row : " + j + " column : " + k + " (y/n)");
                     String res = input.next();
                     if(res.equalsIgnoreCase("y")){
                        selected = true;
                        break;
                     }else{
                        continue;
                     }
                  }
               }
            }
         }
        }
   	 //print the seat/prices chart
    }

}