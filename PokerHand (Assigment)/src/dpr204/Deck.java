package dpr204;

public class Deck {

	private Card [] cards;
	private int topCard;
	Deck() {
		cards = new Card [52];
		int startPosition = 0;
		for (Suit s: Suit.values()) {
			createSuit(s, startPosition);
			startPosition = startPosition + 13;
		}
		topCard = 0;
	}
	
	private void createSuit(Suit s, int startPosition) {
		for (int i=0; i < 13; i++) {
			cards[startPosition+i] = new Card(s, i+2);
		}	
	}
	
	public void shuffle() {
		topCard = 0;
		int rand;
		Card temp;
		for (int i=0; i < 52; i++) {
			rand = (int) (Math.random() * 52);
			temp = cards[i];
			cards[i] = cards[rand];
			cards[rand] = temp;
		}
	}
	
	public Card[] deal(int count) {
		if (topCard + count > 52) {
			throw new IllegalArgumentException("Deck is empty - must resuffle.");
		}
		Card [] d = new Card[count];
		for (int i=0; i<count; i++) {
			d[i] = cards[topCard+i];
		}
		topCard = topCard + count;
		return d;
	}
	
	public Card getCard(int which) {
		return cards[which];
	}
	
}
