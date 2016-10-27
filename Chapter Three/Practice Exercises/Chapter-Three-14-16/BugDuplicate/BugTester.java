public class BugTester{
	public static void main(String[] args){
		Bug bug = new Bug(10);
		bug.move();
		System.out.println(bug.getPosition());
		bug.turn();
		bug.move();
		System.out.println(bug.getPosition());
	}
}