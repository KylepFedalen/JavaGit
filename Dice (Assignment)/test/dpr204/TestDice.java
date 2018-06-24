package dpr204;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDice {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		Dice dice = new Dice();		
		assertTrue(dice != null);
	}
	@Test
	public void testGetFaces() {
		Dice dice = new Dice();		
		int [] faces;
		validateDice2(dice);
	}

	private void validateDice2(Dice dice) {
		int[] faces;
		faces = dice.getFaceValues();
		assertEquals(2, faces.length);
		assertTrue( (1 <= faces[0]) && (faces[0] <= 6) );
		assertTrue( (1 <= faces[1]) && (faces[1] <= 6) );
	}
	@Test
	public void testRoll() {
		Dice dice = new Dice();		
		int [] startFaces;
		startFaces = dice.getFaceValues();
		for (int i = 1; i <= 10; i++) {
			dice.roll();
			int [] newFaces;
			newFaces = dice.getFaceValues();
			if (compareFaces(startFaces, newFaces)) {
				return;  // pass
			}
		}
		fail("roll() method doesn't change face value.");
	}
	private boolean compareFaces(int [] startFaces, int [] newFaces) {
		boolean changed = false;
		assertTrue( startFaces.length == newFaces.length);
		for (int i = 0; i < newFaces.length; i++) {
			if (startFaces[i] != newFaces[i]) {
				changed = true;
			}			
			assertTrue( (1 <= newFaces[i]) && (newFaces[i] <= 6) );
		}
		return changed;
	}
}
