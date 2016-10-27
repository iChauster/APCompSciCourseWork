public class Bug {
	private int pos;
	private int direction = 1;
	public Bug(int initialPosition){
		pos = initialPosition;
	}
	public void turn(){
		direction *= -1;
		System.out.println("Direction : " + direction);
	}
	public void move(){
		pos += 1 * direction;
	}
	public int getPosition(){
		return pos;
	}
}