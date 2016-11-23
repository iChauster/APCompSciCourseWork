public class Taxes {
	private int inc = 0;
	public Taxes(int income){
		this.inc = income;
	}
	public double computeTaxes(){
		/*
		•1 percent on the first $50,000.
		•2 percent on the amount over $50,000 up to $75,000.
		•3 percent on the amount over $75,000 up to $100,000.
		•4 percent on the amount over $100,000 up to $250,000.
		•5 percent on the amount over $250,000 up to $500,000.
		•6 percent on the amount over $500,000.
		*/
		int i = this.inc;
		if(i <= 50000){
			return inc * 0.01;
		}else if(i <= 75000){
			return inc * 0.02;
		}else if(i <= 100000){
			return inc * 0.03;
		}else if(i <= 250000){
			return inc * 0.04;
		}else if(i <= 500000){
			return inc * 0.05;
		}else if(i >= 500000){
			return inc * 0.06;
		}else{
			return 0.0;
		}
	}
	public static void main(String[] args){
		Taxes t = new Taxes(90000);
		System.out.println("The taxes due : " + t.computeTaxes());
	}
}