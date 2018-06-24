package dpr204;

import java.util.Arrays;

/**
 * The Hand class represents a collection (think array) of cards that have been dealt
 * from the deck.
 * 
 * Most classes require a constructor and so does Hand.  The constructor receives
 * an array of cards as a parameter and saves a reference to them in an instance 
 * variable.
 * 
 * Hand(Card [] cards)
 * 
 * Hand has two methods:
 * 
 * Card getCard(int i)  // return a reference to i_th card in the hand.
 * void sort()          // sort the cards in the hand (Hint: call Arrays.sort() method
 * int getCount()       // return the number of cards in the hand.
 * String toString()    // return a string for all of the cards in the hand.
 * 
 */
public class Hand {
	private Card[] hand;
	public Hand(Card [] cards){//Hand constructor takes Card[] array,  Deck.deal(i) gives Card[] array 
		hand = new Card[cards.length];
		for(int i = 0; i < cards.length;i++){
			hand[i] = cards[i];
		}
		
	}
	public void sort(){
		Arrays.sort(hand);
	}
	// dummy method to avoid syntax errors.
	int getCount() {
		return hand.length;
	}
	// dummy method to avoid syntax errors.
	Card getCard(int i ) {
		return hand[i];
	}
	@Override
	public String toString(){
		String handstr = "A hand: ";
		for(int i = 0; i < hand.length;i++){
			handstr = handstr + hand[i].toString() + " ";
		}
		return handstr;
	}
}
