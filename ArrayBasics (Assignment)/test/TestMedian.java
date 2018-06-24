import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMedian {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		double [] scores = {13., 18., 13., 14., 13., 16., 14., 21., 13.};
		double [] copy   = {13., 18., 13., 14., 13., 16., 14., 21., 13.};
		assertEquals(14., Main.median(scores), .0001);
		assertArrayEquals(copy, scores, .0001);
	}
	
	@Test
	public void test2() {
		double [] scores = {12., 13., 18., 13., 14., 13., 16., 14., 21., 13.};
		double [] copy   = {12., 13., 18., 13., 14., 13., 16., 14., 21., 13.};
		assertEquals(13.5, Main.median(scores), .0001);
		assertArrayEquals(copy, scores, .0001);
	}
	

}
