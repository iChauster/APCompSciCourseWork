public class Moth {
	private double pos;
	public Moth(double initialPosition){
		pos = initialPosition;
	}
	public void moveToLight(double lightPosition){
		pos += (lightPosition - pos) / 2.0;
	}
	public double getPosition(){
		return pos;
	}
}