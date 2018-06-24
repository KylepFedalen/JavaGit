package dpr204;
public class Card implements Comparable<Card> {

	private Suit suit;
	private int value;

	Card(Suit suit, int value) {
		if (suit == null) {
			throw new IllegalArgumentException("Suit cannot be null.");			
		}
		if (value < 2 || value > 14) {
			throw new IllegalArgumentException("Card value is out of range.");
		}
		this.suit = suit;
		this.value = value;
	}
	
	public int compareTo(Card c2) {
		int result = value - c2.value;
//		if you want to compare suits activate (uncomment) the following if statement/		
//		if (result == 0) {
//			result = suit.ordinal() - c2.suit.ordinal();
//		}
		return result;
	}
	
	public Suit getSuit() {
		return suit;
	}
	
	public int getValue() {
		return value;
	}
	
	public void show() {
		System.out.print(this.toString());
	}
	
	public String toString() {
		String sCard = "";
		switch (value) {
	case 2:
	case 3:
	case 4:
	case 5:
	case 6:
	case 7:
	case 8:
	case 9:
	case 10:	sCard = Integer.valueOf(value).toString() + ":";
				break;
	case 11:	sCard = "J:";
				break;
	case 12:	sCard = "Q:";
				break;
	case 13:	sCard = "K:";
				break;
	case 14:	sCard = "A:";
				break;
		}
		return sCard + suit.toString();
	}
	

	
}
