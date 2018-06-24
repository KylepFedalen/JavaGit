/**
 * Do NOT change any code in this file!
 */

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestStringBasics {

	private final String alpha =  "abcdefghijklmnopqrstuvwxyz";
	private final String alpha2 = "zyxwutsrqponmlkljihgfedcba";
	private final String numeric = "0123456789";
	
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1a() {
		String a = "abc";
		String b = "def";
		assertEquals("abcdef", StringBasics.method1(a, b));
	}

	@Test
	public void test1b() {
		String a = "xxx";
		String b = "yyy";
		assertEquals("xxxyyy", StringBasics.method1(a, b));
	}

	@Test
	public void test2a() {
		assertEquals(25, StringBasics.method2(alpha2 + "a"));
	}

	@Test
	public void test2b() {
		String alpha =  "abcdefghijklmnopqrstuvwxyz";
		assertEquals(0, StringBasics.method2("a" + alpha));
	}

	@Test
	public void test3a() {
		assertEquals(26, StringBasics.method3(alpha2 + "a"));
	}

	@Test
	public void test3b() {
		String alpha =  "abcdefghijklmnopqrstuvwxyz";
		assertEquals(1, StringBasics.method3("a" + alpha));
	}

	@Test
	public void test4a() {
		String x = "abaacaaad";
		assertEquals(6, StringBasics.method4(x));
	}

	@Test
	public void test4b() {
		String x = "bcdefg";
		assertEquals(0, StringBasics.method4(x));
	}

	@Test
	public void test5a() {
		String x = "abracadabra!";
		int expected [] = { 5, 2, 1};
		int count [] = new int [3];
		StringBasics.method5(x, count);
		assertArrayEquals(expected, count);
	}

	@Test
	public void test6a() {
		assertEquals(26, StringBasics.method6(alpha));
	}
	
	@Test
	public void test6b() {
		assertEquals(0, StringBasics.method6(numeric));
	}
	
	@Test
	public void test7a() {
		assertEquals(10, StringBasics.method7(numeric));
	}
	
	@Test
	public void test7b() {
		assertEquals(0, StringBasics.method7(alpha));
	}
	
	@Test
	public void test8a() {
		int expected [] = { 26, 10};
		int count [] = new int [2];
		StringBasics.method8(numeric + alpha, count);
		assertArrayEquals(expected, count);
	}

	@Test
	public void test9() {
		assertEquals( 65535, StringBasics.method9("65535"));
	}
	
}
