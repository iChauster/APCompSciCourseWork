public class Card {
	private String cardstr;
	private String suit;
	public Card(String s){
		if(s.length() == 2){
			cardstr = s.substring(0,1);
			suit = s.substring(1,2);

		}else{
			System.out.println("more than two characters");
		}
	}
	public String getDescription(){
		String starter = "";
		if(Character.isDigit(cardstr.charAt(0))){
			int e = Integer.parseInt(cardstr);
			if(e <= 10 && e >= 2){
				starter += cardstr + " of ";
			}else{
				return "unknown";
			}
		}else if(cardstr.equals("A")){
			starter += "Ace of ";
		}else if(cardstr.equals("K")){
			starter += "King of ";
		}else if(cardstr.equals("Q")){
			starter += "Queen of ";
		}else if(cardstr.equals("J")){
			starter += "Jack of ";
		}

		if(suit.equals("D")){
			starter += "Diamonds";
		}else if(suit.equals("H")){
			starter += "Hearts";
		}else if(suit.equals("S")){
			starter += "Spades";
		}else if(suit.equals("C")){
			starter += "Clubs";
		}
		return starter;
	}
	public static void main(String[] args){
		Card c = new Card("QS");
		System.out.println(c.getDescription());
	}
}