import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMean {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test1() {
		double [] scores = {13., 18., 13., 14., 13., 16., 14., 21., 13.};
		assertEquals(15., Main.mean(scores), .0001);
	}

	@Test
	public void test2() {
		double [] scores = {13., -12., -13., 14., 13., 16., 14., 21., -18.};
		assertEquals(5.333, Main.mean(scores), .001);
	}
}
