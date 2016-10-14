public class Letter {
	private String text = "";
	private String recip;
	public Letter(String from, String to){
		text = text.concat("Dear " + to + ", \n");
		recip = from;
	}
	public void addLine(String line){
		text = text.concat(line + "\n");
	}
	public String getText(){
		return text.concat(recip);
	}
}

