/**
 * Do NOT touch this code.
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMain {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testLoop1() {
		assertEquals(55, Main.loop1(10));
	}

	@Test
	public void testLoop2() {
		assertEquals(110, Main.loop2(10));
	}
	
	@Test
	public void testLoop3() {
		assertEquals(100, Main.loop3(10));
	}
	
	@Test
	public void testLoop4() {
		assertEquals(2.283333, Main.loop4(), .000001);
	}
	
	@Test
	public void testLoop5() {
		assertEquals(1.937500, Main.loop5(), .000001);
	}
	
	@Test
	public void testLoop6() {
		assertEquals(0.800000, Main.loop6(), .000001);
	}
	
	@Test
	public void testLoop7() {
		assertEquals(0.783333, Main.loop7(), .000001);
	}
}
