public class MothTester{
	public static void main(String[] args){
		Moth mth = new Moth(20);
		mth.moveToLight(30);
		System.out.println(mth.getPosition());
		mth.moveToLight(45);
		System.out.println(mth.getPosition());
	}
}