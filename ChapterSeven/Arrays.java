import java.util.Scanner;
public class Arrays {
	public static void main(String[] args){
		Scanner input = new Scanner(System.in);
		System.out.print("Enter number : ");
		int num = input.nextInt();
		int row = num - 1;
		int col = num / 2;
		int[][] arr = new int[num][num];
		/*
		Set row = n - 1, column = n / 2.

		For k = 1 ... n * n

		Place k at [row][column].

		Increment row and column.

		If the row or column is n, replace it with 0.

		If the element at [row][column] has already been filled

		Set row and column to their previous values.

		Decrement row. */

		for (int k = 1; k < num*num; k++){
			arr[row][col] = k;
			int a = arr[row][col];
			int rowBefore = row;
			int colBefore = col;
			row ++;
			col ++;
			if(row == 5){
				row = 0; 
			}
			if(col == 5){
				col = 0;
			}
			System.out.println(row + " , " + col);
			if(arr[row][col] != 0){
				row = rowBefore;
				col = colBefore;
				row --;
				if(row == -1){
					row = 4;
				}
				arr[row][col] = k;
			}
		}
		System.out.println(printArray(arr));


	}
	public static String printArray(int[][] arr){
		String res = "";
		for(int i = 0; i < arr.length; i ++){
			for(int j = 0; j < arr[0].length; j ++){
				res += (arr[i][j] + "  ");
			}
			res += "\n";
		}
		return res;
	}
}