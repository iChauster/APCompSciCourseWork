public class MorseCode{
	public static void main(String[] args){
		printString(2,".");
		printString(1," ");
		printString(3,".");
		printString(1,"-");
		printString(1," ");
		printString(1,".-");
		printString(1," ");
		printString(1, "-.");

        //.. ...- .- -. 
	}
	public static void printString(int times,String string){
		int a = times;
		for (int i = 0; i < a; i ++)
			System.out.print(string);
	}
}