package dpr204;

public class PokerHand extends Hand implements Comparable<PokerHand> {

	PokerRank rank;
	
	public PokerHand(Card [] hand) {
		super(hand);
		if (hand.length != 5) {
			throw new IllegalArgumentException();
		}		
	}

	public PokerRank getRank() {
		if (rank == null) {
			rank = PokerRanker.rank(this);
		}
		return rank;
	}
	@Override
	public int compareTo(PokerHand hand) {
		PokerRank myRank = this.getRank();
		PokerRank yourRank = hand.getRank();
		int comp = myRank.compareTo(yourRank);
		return comp;
	}
	
}
