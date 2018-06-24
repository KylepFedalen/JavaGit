package dpr204;

public class MainClass {

	public static void main(String[] args) {
// Uncomment the following lines for the Deck assignment
// AFTER you have filled in the constructor and deal() method for Deck class.

		Deck deck = new Deck();
		Card[] hand1 = deck.deal(13);
		Card[] hand2 = deck.deal(13); 
		Card[] hand3 = deck.deal(13); 
		Card[] hand4 = deck.deal(13);
		System.out.println("A deck:");
		show(hand1);
		show(hand2);
		show(hand3);
		show(hand4);
		
		// Uncomment the following lines for the Deck assignment
		// AFTER you have filled in the code for shuffle() method in the Deck class.
		Deck deck1 = new Deck();
		deck1.shuffle();
		Card[] hand5 = deck1.deal(13); 
		Card[] hand6 = deck1.deal(13); 
		Card[] hand7 = deck1.deal(13); 
		Card[] hand8 = deck1.deal(13);
		System.out.println("A shuffled deck:");
		show(hand5);
		show(hand6);
		show(hand7);
		show(hand8);
		
		// Uncomment the following lines for the Deck assignment
		// AFTER you have filled in the all of the code the Hand class.
		Deck deck2 = new Deck();
		deck2.shuffle();
		Hand hand9 = new Hand(deck2.deal(5));//Hand takes Card[] array  Deck.deal(i) gives Card[] array 
		Hand hand10 = new Hand(deck2.deal(5));//deck2.deal(5)
		hand9.sort();
		hand10.sort();
		compareHands(hand9, hand10);

		System.out.println(hand9.toString());
		System.out.println(hand10.toString());
	}

	// Don't touch the code below.
	private static void show(Card[] hand) {
		int count = hand.length;
		for (int i = 0; i < count; i++) {
			System.out.print(hand[i].toString() + " ");
		}
		System.out.println();
	}

	private static void compareHands(Hand hand1, Hand hand2) {
		System.out.println("Comparing hands:");
		int count = hand1.getCount();
		if (count != hand2.getCount()) {
			throw new IllegalArgumentException("Cannot compare hands of different sizes.");
		}
		for (int i = 0; i < count; i++) {
			Card card1 = hand1.getCard(i);
			Card card2 = hand2.getCard(i);
			int result = card1.compareTo(card2);
			if (result < 0) {
				System.out.println(card1 + " < " + card2);
			} else if (result == 0) {
				System.out.println(card1 + " = " + card2);
			} else {
				System.out.println(card1 + " > " + card2);
			} 
		}
	}
		

}
