package dpr204;
/**
 * Directions: Fill in the body of the Card class.
 * Don't forget to declare instance variables for the class.
 * 
 * Constructor:
 *   Card(Suit s, int val)
 *   
 * Methods:
 *   Suit getSuit() // return the Suit of the card
 *   int getValue() // return the value of the card
 *   void print()   // print the suit and value of the card.  E.g. value: 2 suit: SPADE
 *   int compare()  // see below
 */

public class Card implements Comparable<Card> {
	private Suit suit;
	private int value;

	public Card(Suit s, int val) {
		if (s == null) {
			throw new IllegalArgumentException("Suit cannot be null");
		}
		
		if (val < 0 || val > 14) {
			throw new IllegalArgumentException("Value out of range: " + value);
		}
		
		suit = s;
		value = val;
	}
	
	Suit getSuit() {
		return suit;
	}
	
	int getValue() {
		return value;
	}
	
	void print() {
		System.out.printf("value: %d suit: %s", value, suit.toString());
	}
	@Override
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
	case 10:	
				sCard = value + ":";
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
	
	@Override
	public boolean equals(Object obj) {
		return ((Card)this).value == ((Card) obj).value;
	}
	
/**
 * compare is a dummy method to avoid syntax errors.
 * The first card is the invoking object so a call 
 * on this method looks like:  c1.compare(c2)
 * The result is an int value that reflects:
 *   c1 < c2
 *   c1 == c2
 *   c1 > c2
 *   
 *   You should just compare the value of each card
 *   and ignore the Suit of the card.	
 */
	public int compareTo(Card c2) {
		if (this.value < c2.value) {
			return -1;
		} else if (this.value > c2.value) {
			return +1;
		}
		return 0;
	}
	
}
