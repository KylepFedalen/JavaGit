package dpr204;
/**
 * Directions: Fill in the body of the Card class.   
 * Don't forget to declare private instance variables for the class.
 * 
 * Constructor:
 *   public Card(Suit s, int val)
 *   
 * Methods:
 *   // these methods should have public visibility.
 *   Suit getSuit() // return the Suit of the card
 *   int getValue() // return the value of the card
 *   void print()   // print the suit and value of the card.  E.g. value: 2 suit: SPADE
 *                  // Hint: every suit object has a toString() method.  E.g. suit.toString()
 *   int compare()  // see below
 */

public class Card implements Comparable<Card> {
	
	private int value;
	private Suit suit;
/**
 * print starts as a dummy method to avoid syntax errors.
 */
	public void print() {
		//System.out.print("value: "+ value + " suit: " + suit.toString());
		//System.out.println(toString()+suit.toString());
		System.out.println(toString() + " : " + ((Card)this));
	}
	
	public Card(Suit s, int val){
		suit = s;
		value = val;
	}
	public Suit getSuit(){//returns suit object assigned in constructor
		return suit;
	}
	
	public int getValue(){//value of the card ex. jack == 11
		return value;
	}
	
/**
 * compare starts as a dummy method to avoid syntax errors.
 * The first card is the invoking object so a call 
 * on this method looks like:  c1.compare(c2)
 * The result is an int value that reflects:
 *   c1 < c2
 *   c1 = c2
 *   c1 > c2
 *   
 *   You should just compare the value of each card
 *   and ignore the Suit of the card.	
 */
	public int compare(Card c2) {	
		int comp = value - c2.getValue();
		return comp;
	}
	
	@Override
	public String toString(){
		String sCard = "";
		switch(value){
		case 2:
		case 3:
		case 4:
		case 5:
		case 6:
		case 7:
		case 8:
		case 9:
		case 10:
						sCard = value+":";
						break;
		case 11: sCard = "J:";
						break;
		case 12: sCard = "Q:";
						break;
		case 13: sCard = "K:";
						break;
		case 14: sCard = "A:";
						break;
		}
		return sCard + suit;
	}
	//wrong way:obj.toString().equals(((Card)this).toString())
	@Override
	public boolean equals(Object obj){
		if (  obj.equals(((Card)this).value)==true) {
			return true;
		}else{
			return false;
		}
	}

	@Override
	public int compareTo(Card card2) {
		int x =  Card.this.value-card2.getValue();
		
		return x;
		
		
	}
	
	
}
