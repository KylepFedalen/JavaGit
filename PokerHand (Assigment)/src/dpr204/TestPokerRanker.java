package dpr204;

import static org.junit.Assert.*;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

/**
 * This is a Junit 4 test class.  Make sure your project is using the Junit 4 library (comes with Eclipse).
 * @BeforeClass is an annotation that means call setUpBeforeClass at the very beginning.  
 * @Test is an annotation that means the next method is a test case.
 * @Ignore is an annotation that means ignore the test case until @Ignore is removed or commented out.
 */

public class TestPokerRanker {

	static Deck deck;	// this is a *new* deck with a pre-determined order
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		deck = new Deck();
	}
	//@Ignore
	@Test
	public void testRoyalFlush() {
		System.out.println("testRoyalFlush");
		// Notice how the cards that make up a straight flush are picked from the deck!
		Card [] hand = {deck.getCard(12), deck.getCard(11),deck.getCard(10), deck.getCard(9),deck.getCard(8)};
		PokerHand straightFlush = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		
		PokerRank rank = PokerRanker.rank(straightFlush);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.ROYAL_FLUSH);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore
	@Test
	public void testStraightFlush() {
		System.out.println("testStraightFlush");
		// Notice how the cards that make up a straight flush are picked from the deck!
		Card [] hand = {deck.getCard(9), deck.getCard(8),deck.getCard(7), deck.getCard(6),deck.getCard(5)};
		PokerHand straightFlush = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		
		PokerRank rank = PokerRanker.rank(straightFlush);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.STRAIGHT_FLUSH);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore
	@Test
	public void testFourOfAKind() {
		System.out.println("testFourOfAKind");
		Card [] hand = {deck.getCard(0), deck.getCard(13),deck.getCard(26), deck.getCard(9),deck.getCard(39)};
		PokerHand fourOfAKind = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		
		PokerRank rank = PokerRanker.rank(fourOfAKind);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.FOUR_OF_A_KIND);
		
		System.out.println("<------------------------------------->");
		
		
		Card [] hand2 = {deck.getCard(22), deck.getCard(9),deck.getCard(0), deck.getCard(35),deck.getCard(48)};
		fourOfAKind = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		
		rank = PokerRanker.rank(fourOfAKind);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.FOUR_OF_A_KIND);
		
		System.out.println("-----------------------------------------");
		
	}
	//@Ignore
	@Test
	public void testFullHouse() {
		System.out.println("testFullHouse");
		Card [] hand = {deck.getCard(7), deck.getCard(20),deck.getCard(10), deck.getCard(46),deck.getCard(23)};
		PokerHand fullHouse = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(fullHouse);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.FULL_HOUSE);
		
		System.out.println("<------------------------------------->");
		
		Card [] hand2 = {deck.getCard(22), deck.getCard(32),deck.getCard(45), deck.getCard(9),deck.getCard(48)};
		fullHouse = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		rank = PokerRanker.rank(fullHouse);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.FULL_HOUSE);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore	
	@Test
	public void testFlush() {
		System.out.println("testFlush");
		Card [] hand = {deck.getCard(13), deck.getCard(18),deck.getCard(20), deck.getCard(22),deck.getCard(14)};
		PokerHand flush = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(flush);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.FLUSH);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore	
	@Test
	public void testStraight() {
		System.out.println("testStraight");
		Card [] hand = {deck.getCard(1), deck.getCard(41),deck.getCard(16), deck.getCard(4),deck.getCard(18)};
		PokerHand straight = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(straight);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.STRAIGHT);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore	
	@Test
	public void testThreeOfAKInd() {
		System.out.println("testThreeOfAKind");
		Card [] hand = {deck.getCard(34), deck.getCard(8),deck.getCard(47), deck.getCard(45),deck.getCard(13)};
		PokerHand kind3 = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(kind3);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.THREE_OF_A_KIND);
		
		System.out.println("<------------------------------------->");
		Card [] hand2 = {deck.getCard(0), deck.getCard(18),deck.getCard(44), deck.getCard(48),deck.getCard(31)};
		kind3 = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		rank = PokerRanker.rank(kind3);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.THREE_OF_A_KIND);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore
	@Test
	public void testTwoPair() {
		System.out.println("testTwoPair");
		Card [] hand = {deck.getCard(2), deck.getCard(15),deck.getCard(24), deck.getCard(45),deck.getCard(32)};
		PokerHand twoPair = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(twoPair);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.TWO_PAIR);
		
		System.out.println("<------------------------------------->");
		Card [] hand2 = {deck.getCard(20), deck.getCard(33),deck.getCard(9), deck.getCard(48),deck.getCard(40)};
		twoPair = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		rank = PokerRanker.rank(twoPair);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.TWO_PAIR);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore	
	@Test
	public void testOnePair() {
		System.out.println("testOnePair");
		Card [] hand = {deck.getCard(2), deck.getCard(15),deck.getCard(24), deck.getCard(44),deck.getCard(32)};
		PokerHand onePair = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(onePair);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.ONE_PAIR);
		
		System.out.println("<------------------------------------->");
		
		Card [] hand2 = {deck.getCard(20), deck.getCard(33),deck.getCard(9), deck.getCard(39),deck.getCard(40)};
		onePair = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		rank = PokerRanker.rank(onePair);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.ONE_PAIR);
		
		System.out.println("-----------------------------------------");
	}
	//@Ignore	
	@Test
	public void testHighCard() {
		System.out.println("testHighCard");
		Card [] hand = {deck.getCard(2), deck.getCard(16),deck.getCard(24), deck.getCard(44),deck.getCard(32)};
		PokerHand highCard = new PokerHand(hand);
		
		for(int i = 0; i < hand.length;i++){
			System.out.print(" "+hand[i]);
		}
		System.out.print("\n");
		
		PokerRank rank = PokerRanker.rank(highCard);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.HIGH_CARD);
		
		System.out.println("<------------------------------------->");
		Card [] hand2 = {deck.getCard(18), deck.getCard(33),deck.getCard(9), deck.getCard(39),deck.getCard(40)};
		highCard = new PokerHand(hand2);
		
		for(int i = 0; i < hand2.length;i++){
			System.out.print(" "+hand2[i]);
		}
		System.out.print("\n");
		
		rank = PokerRanker.rank(highCard);
		System.out.println("Rank is: " + rank);
		assertTrue("Result", rank == PokerRank.HIGH_CARD);
		
		System.out.println("-----------------------------------------");
	}
}
