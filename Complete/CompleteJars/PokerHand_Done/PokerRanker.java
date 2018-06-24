package dpr204;
/* 
 * PokerRanker - contains static method for ranking a 5-card hand as per poker rules
 * with the following exceptions:
 * 1. Aces are always played high
 * 2. There are no tie breaking rules. (pair of 2s = pair of 8s)
 *    (feel free to add tie-breaking rules; however, this is hard.
 */
public class PokerRanker {
	
/*
 *  rank - static method for assigning poker ranks to a poker hand.
 *  	   The order of the if tests below CANNOT be changed.
 */
	public static PokerRank rank(PokerHand hand) {
		PokerRank rank = null;
		PokerHand sortedHand = hand;
		sortedHand.sort();
//		System.out.print("AFTER:"); sortedHand.show();
		if (isStraightFlush(sortedHand)) {
			if (sortedHand.getCard(4).getValue() == 14) {    // is the high card is an ACE?
				rank = PokerRank.ROYAL_FLUSH;
			} else {
				rank = PokerRank.STRAIGHT_FLUSH;
			}
		} else if (isFourOfAKind(sortedHand)) {
			rank = PokerRank.FOUR_OF_A_KIND;
		} else if (isFullHouse(sortedHand)) {
			rank = PokerRank.FULL_HOUSE;
		} else if (isFlush(sortedHand)) {
			rank = PokerRank.FLUSH;
		} else if (isStraight(sortedHand)) {
			rank = PokerRank.STRAIGHT;
		} else if (isThreeOfAKind(sortedHand)) {
			rank = PokerRank.THREE_OF_A_KIND;
		} else if (isTwoPair(sortedHand)) {
			rank = PokerRank.TWO_PAIR;
		} else if (isOnePair(sortedHand)) {
			rank = PokerRank.ONE_PAIR;
		} else {
			rank = PokerRank.HIGH_CARD;
		}
		if (null == rank) {
			System.out.println("PokerRank underdetermined");
			hand.show();
			System.exit(1);
		}
		return rank;
	}
	// this is a helper method
	private static boolean isValueEqual(int i, int j, PokerHand sortedHand) {
		if (i == j) {
			throw new IllegalArgumentException("Can't have i==j");
		}
		// do two cards within the hand have the same value?
		return sortedHand.getCard(i).getValue() == sortedHand.getCard(j).getValue();
	}
	// this is a helper method
	private static boolean isSuitEqual(int i, int j, PokerHand sortedHand) {
		if (i == j) {
			throw new IllegalArgumentException("Can't have i==j");
		}
		// do two cards within the hand have the same suit?
		return sortedHand.getCard(i).getSuit() == sortedHand.getCard(j).getSuit();
	}
	
	// return true if hand is both a straight and a flush.
	private static boolean isStraightFlush(PokerHand sortedHand) {
		// a straight flush is both a straight and a flush.
		return isStraight(sortedHand) && isFlush(sortedHand); 
	}
	// return true if hand is a straight.
	private static boolean isStraight(PokerHand sortedHand) {
		// a straight occurs when the card values are in ascending order with an value of +1 between each.
		for (int i = 0; i < 4; i++) {
			if (sortedHand.getCard(i+1).getValue() - sortedHand.getCard(i).getValue() != 1) {
				return false;
			}
		}
		return true;
	}
	// return true if hand is a flush.
	private static boolean isFlush(PokerHand sortedHand) {
		// a flush occurs when all cards have the same suit.
		for (int i = 0; i < 3; i++) {
			if (! isSuitEqual(i, i+1, sortedHand)) {
				return false;
			}
		}
		return true;
	}
	
	// return true if hand is 4 of a kind.
	private static boolean isFourOfAKind(PokerHand sortedHand) { //had to change the cards tested because they were not being sorted correctly
		// possibilities for four of a kind below
		//aXXXX
		//XXXXa
	    // TODO: write code to test for the possibilities above
		
		
		if(isFlush(sortedHand)){
			return false;
		}
		
		boolean t1 = false;
		boolean t2 = false;
		
		if(isValueEqual(0,1,sortedHand)&&isValueEqual(1,2,sortedHand)&&isValueEqual(2,3,sortedHand)){
			t1 = true;
		}
		
		if(isValueEqual(1,2,sortedHand)&&isValueEqual(2,3,sortedHand)&&isValueEqual(3,4,sortedHand)){
			t2 = true;
		}
		
				
		if(t1||t2){
			return true;
			
		}
		  				
		return false;	
	}
	// return true if hand is a full house.
	
	private static boolean isFullHouse(PokerHand sortedHand) {
		// possibilities for a full house below
		// XXXYY
		// YYXXX
	    // TODO: write code to test for the possibilities above
		
		boolean t1 = false;
		boolean t2 = false;
		if(isValueEqual(0,1,sortedHand)&&isValueEqual(1,2,sortedHand)&&isValueEqual(3,4,sortedHand)){
			t1 = true;
		}
		
		if(isValueEqual(0,1,sortedHand)&&isValueEqual(2,3,sortedHand)&&isValueEqual(3,4,sortedHand)){
			t2 = true;
		}
		if(t1||t2){
			return true;
		}

		return false;
		
	}
	
	// return true if hand is 3 of a kind.
	private static boolean isThreeOfAKind(PokerHand sortedHand) {
		// possibilities for three of a kind below
		// XXXab
		// aXXXb
		// abXXX
	    // TODO: write code to test for the possibilities above
		
		
		
		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = false;
		
		boolean check = true;
		if(isFullHouse(sortedHand)||isFourOfAKind(sortedHand)){
			check = false;
		}
		
		if(isValueEqual(0,1,sortedHand)&& isValueEqual(1,2,sortedHand)&&!isValueEqual(3,0,sortedHand)&&!isValueEqual(4,0,sortedHand)&&!isValueEqual(3,4,sortedHand)){
			t1 = true;
		}
		
		if(isValueEqual(1,2,sortedHand)&&isValueEqual(2,3,sortedHand)&&!isValueEqual(0,1,sortedHand)&&!isValueEqual(4,1,sortedHand)&&!isValueEqual(0,4,sortedHand)){
			t2 = true;
		}
		
		if(isValueEqual(2,3,sortedHand)&&isValueEqual(3,4,sortedHand)&&!isValueEqual(0,2,sortedHand)&&!isValueEqual(1,2,sortedHand)&&!isValueEqual(0,1,sortedHand)){
			t3 = true;
		}
		
		if((t1||t2||t3)&&check){
			return true;
		}
		
		
		return false;
		
		
			
	}
	// return true if hand is two pair.
	private static boolean isTwoPair(PokerHand sortedHand) {
		// possibilities for two pair below
	    // XXYYa
	    // XXaYY
	    // aXXYY
	    // TODO: write a sequence of if tests for the above possibilities

		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = false;
		
		boolean check = true;
		
		if(isFourOfAKind(sortedHand)||isFullHouse(sortedHand)||isThreeOfAKind(sortedHand)){
			check = false;
		}
		
		if(isValueEqual(0,1,sortedHand)&&isValueEqual(2,3,sortedHand)){
			t1 = true;
		}
		if(isValueEqual(0,1,sortedHand)&&isValueEqual(3,4,sortedHand)){
			t2 = true;
		}
		if(isValueEqual(1,2,sortedHand)&&isValueEqual(3,4,sortedHand)){
			t3 = true;
		}
		
		if((t1||t2||t3)&&check){
			return true;
		}
		return false;
	}

	private static boolean isOnePair(PokerHand sortedHand) {
		// possibilities for one pair below
	    // XXabc
	    // aXXbc
	    // abXXc
	    // abcXX
		// TODO: write a sequence of if tests for the above possibilities
		boolean t1 = false;
		boolean t2 = false;
		boolean t3 = false;
		boolean t4 = false;
		
		boolean check = true;
		if(isTwoPair(sortedHand)||isThreeOfAKind(sortedHand)||isFullHouse(sortedHand)||isFourOfAKind(sortedHand)){
			check = false;
		}
		
		if(isValueEqual(0,1,sortedHand)){
			t1=true;
		}
		if(isValueEqual(1,2,sortedHand)){
			t2 = true;
		}
		if(isValueEqual(2,3,sortedHand)){
			t3 = true;
		}
		if(isValueEqual(3,4,sortedHand)){
			t4 = true;
		}
		
		if((t1||t2||t3||t4)&&check){
			return true;
		}
		return false;
	}


}
