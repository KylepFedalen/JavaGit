package dpr204;

/*
 * PokerHand - Assignment is a continuation of CardDeck.  New classes: PokerRank, PokerRanker, PokerHand
 * 
 * Learning Objectives:
 * - learn how to grow small project to large project
 * - learn fundamentals of unit testing using JUnit
 * - explore functionality of an enum class (PokerRank)
 * - take advantage of Comparable interface (PokerHand implements Comparable)
 * - have fun playing poker!
 */
import java.util.Scanner;

public class MainClass {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String answer;
		do {
			playPoker();
			System.out.println("\nContinue? (n or y)");
			answer = scan.nextLine();
		} while (answer.equalsIgnoreCase("y") );
		scan.close();
	}
	
	private static void playPoker() {
		Deck deck = new Deck();
		deck.shuffle();
		PokerHand hand1 = new PokerHand(deck.deal(5));
		PokerHand hand2 = new PokerHand(deck.deal(5));
		int result = hand1.compareTo(hand2);
		System.out.println("HAND1: ");
		hand1.show();
		System.out.printf("RANK1: %s\n" , hand1.getRank());
		System.out.println("HAND2: ");
		hand2.show();
		System.out.printf("RANK2: %s\n" , hand2.getRank());
		if (result < 0) {
			System.out.printf("HAND2 wins\n");
		} else if (result == 0) {
			System.out.printf("ABSOLUTE tie!\n");
		} else {  // value > 0
			System.out.printf("HAND1 wins\n");
		}
	}

}
