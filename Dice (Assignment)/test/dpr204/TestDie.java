package dpr204;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestDie {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		Die d1 = new Die();
		assertTrue(d1 != null);
	}
	@Test
	public void testGetFaceValue() {
		Die d1 = new Die();
		assertTrue( (1 <= d1.getFaceValue()) && (d1.getFaceValue() <= 6) );
	}
	@Test
	public void testSetFaceValue() {
		Die d1 = new Die();
		for (int i = 1; i <= 6; i++) {
			d1.setFaceValue(i);
			assertTrue(d1.getFaceValue() == i);
		}
	}
	@Test
	public void testRoll() {
		Die d1 = new Die();
		int startFaceValue = d1.getFaceValue();
		for (int i = 1; i <= 10; i++) {
			d1.roll();
			int newFaceValue = d1.getFaceValue();
			assertTrue( (1 <= newFaceValue) && (newFaceValue <= 6) );
			if (newFaceValue != startFaceValue) {
				return;  // pass
			}
		}
		fail("roll() method doesn't change face value.");
	}
}
