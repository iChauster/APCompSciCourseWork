public class SodaCan {
	private int h;
	private double r;
	public SodaCan(int height, int diameter){
		h = height;
		r = diameter/2.0;
	}
	public double getVolume(){
		return Math.PI * Math.pow(r,2) * h;
	}
	public double getSurfaceArea(){
		return 2 * Math.PI * Math.pow(r,2) + 2*Math.PI*r*h;
	}
}