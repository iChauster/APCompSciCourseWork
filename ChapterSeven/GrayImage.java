public class GrayImage{
	public static final int BLACK = 0;
	public static final int WHITE = 255;
	private int[][] pixelValues;
	public int countWhitePixels(){
		int counter = 0;
		for(int i = 0; i < pixelValues.length; i ++){
			for(int j = 0; j < pixelValues[0].length; j ++){
				if(pixelValues[i][j] == WHITE){
					counter ++;
				}
			}
		}
		return counter;
	}
	public void processImage(){
		for(int i = 0; i < pixelValues.length; i ++){
			for(int j = 0; j < pixelValues[0].length; j ++){
				if(!(i + 2 >= pixelValues.length) && !(j + 2 >= pixelValues[0].length)){
					int num = pixelValues[i][j];
					int sub = pixelValues[i+2][j+2];
					num -= sub;
					if(num < 0){
						num = 0;
					}
				}
			}
		}
	}
	public static void main(String[] args){
		this.pixelValues = {
			{221,184,178,84,135},
			{84,255,255,130,84},
			{78,255,0,0,78},
			{84,130,255,130,84}
		};
		this.processImage();
	}
	public static void printArray(int[][] arr){
		for(int i = 0; i < arr.length; i ++){
			for (int j = 0; j < arr[0].length; j ++){
				System.out.print(arr[i][j] + " ");
			}
			System.out.println();
		}
	}

}