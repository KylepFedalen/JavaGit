package dpr204;
/*
 * Hand - class is container for any number of cards.
 *        It is also a superclass for specific hands, e.g. a PokerHand
 */
public class Hand {
	private Card [] hand;
	
	public Hand(Card [] hand) {
		this.hand = hand;
	}
	
	
	public Card[] getHand() {
		return hand;
	}

	public void sort() {
		java.util.Arrays.sort(hand);
	}
	
	public void show() {
		for (int i = 0; i < hand.length; i++) {
			Card card = getCard(i);
			card.show();
			System.out.print(" ");
		}
		System.out.println();
	}
	
	public Card getCard(int which) {
		if (which < 0 || which > hand.length-1) {
			throw new IllegalArgumentException("Bad index into hand.");
		}
		return hand[which];
	}
	
}
