package dpr204;

/*
 * PokerRank - An enum with standard ranking for poker game.
 */
public enum PokerRank {
	// must be ordered from low to high.  Why? So that the built-in 'compareTo' can be called to get the right comparison.
	HIGH_CARD,
	ONE_PAIR,
	TWO_PAIR,
	THREE_OF_A_KIND,
	STRAIGHT,
	FLUSH,
	FULL_HOUSE,
	FOUR_OF_A_KIND,
	STRAIGHT_FLUSH,
	ROYAL_FLUSH,
}
