package dpr204;

public class MainClass {

	public static void main(String[] args) {
// Uncomment the next 15 lines for the Card assignment
// AFTER you have filled in the code for Card class.

		Card card1 = new Card(Suit.CLUB, 2);
		Card card2 = new Card(Suit.HEART, 12);
		Card card3 = new Card(Suit.SPADE, 10);
		Card card4 = new Card(Suit.DIAMOND, 2);
		
		card1.print();
		System.out.println();
		card2.print();
		System.out.println();
		card3.print();
		System.out.println();
		card4.print();
		System.out.println();
		
		compareCards(card1, card2);
		compareCards(card1, card4);
		compareCards(card2, card3);
		

	}
	// DON'T TOUCH THE CODE BELOW
	private static void show(Card[] hand) {
		int count = hand.length;
		for (int i = 0; i < count; i++) {
			System.out.print(hand[i].toString() + " ");
		}
		System.out.println();
	}

	private static void compareCards(Card card1, Card card2) {
		int result = card1.compare(card2);
		card1.print();
		if (result < 0) {
			System.out.print(" < ");
		} else if (result == 0) {
			System.out.print(" = ");
		} else {
			System.out.print(" > ");
		}
		card2.print();
		System.out.println();
	}
		

}
