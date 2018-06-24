package dpr204;

/**
 * The Deck class represents a collection (think array) of 52 standard playing cards.
 * The instance data, therefore, is:
 * 
 * private Card [] cards = new Card[52];
 * 
 * Also, when dealing you have to track the next card to deal:
 *  
 * 
 * The constructor does all of the work to create the 52 cards.
 * 
 * Additional methods:
 * 
 * int [] deal(int count)  // deal count cards from the top of the deck
 * void shuffle()          // suffle (randomize) the cards in the deck
 *
 */
public class Deck {
	
	
	private Card [] cards = new Card[52];; //the entire deck of cards(no jokers) 4 suits, 13 cards each
	private int topCard = 0; 
	private int cardCheck = 0;
	
	
	
	public Deck(){
		
		createSuit(Suit.SPADE);
		createSuit(Suit.HEART);
		createSuit(Suit.DIAMOND);
		createSuit(Suit.CLUB);
		/*Test 
		for(int i = 0; i<cards.length;i++){
			System.out.println(cards[i].toString());
		}
		*/
		
	}
	
	private void createSuit(Suit s){//only works if card value input range is (val < 0 || val > 14)
		int suitcount = 13;
		
		for(int i = 0; i < suitcount;i++){
			cards[cardCheck] = new Card(s,i+2);//+2 offsets value so suit cards are created 2 to ace
			cardCheck++;	
		}
		
	}
	
	public Card [] deal(int count){
		
		Card deal[] = new Card[count];
		
		for(int i = 0; i < count; i++ ){
			deal[i] = cards[topCard];
			topCard++;
		}
		
		return deal;
	}
	
	
	public void shuffle(){
		
		for(int i = 0; i < cards.length;i++){
			int j = (int) (Math.random() * 52);
			swap(cards,i,j);
		}
		
	}
	
	private void swap(Card[] a, int i, int j){ //helper method for shuffle(), swaps i with j in Card object array a
		Card save = a[i];
		a[i] = a[j];
		a[j]= save;
	}
}
