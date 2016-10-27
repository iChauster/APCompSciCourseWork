public class Start {
	public static void main(String[] args){
		Letter let = new Letter("Ivan","Rahoo");
		let.addLine("Hey, what's good man.");
		let.addLine("I hope you had a nice weekend.");
		System.out.println(let.getText());
	}
}