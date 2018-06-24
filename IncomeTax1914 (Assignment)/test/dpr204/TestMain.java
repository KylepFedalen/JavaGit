package dpr204;

import static org.junit.Assert.*;

import org.junit.Test;
import static dpr204.Main.*;

public class TestMain {

	@Test
	public void test50000() {

	// Failure message:
	// Tax on $50,000 is $500.

	double tax = Main.calcTax(50_000.);
	assertEquals(500., tax, .01);

	}
	
	@Test
	public void test75000() {

	// Failure message:
	// Tax on $75,000 is $1,000.

	double tax = Main.calcTax(75_000.);
	assertEquals(1000., tax, .01);
	}
	
	@Test
	public void test100000() {

	// Failure message:
	// Tax on $100,000 is $1,750.

	double tax = Main.calcTax(100_000.);
	assertEquals(1750., tax, .01);

	}
	@Test
	public void test250000() {

	// Failure message:
	// Tax on $250,000 is $7,750.

	double tax = Main.calcTax(250_000.);
	assertEquals(7750., tax, .01);

	}
	@Test
	public void test500000() {

	// Failure message:
	// Tax on $500,000 is $20,250.

	double tax = Main.calcTax(500_000.);
	assertEquals(20_250., tax, .01);

	}
	@Test
	public void testOneMillion() {

	// Failure message:
	// Tax on $1,000,000 is $50,250.

	double tax = Main.calcTax(1_000_000.);
	assertEquals(50_250., tax, .01);

	}

	@Test
	public void test70000() {

	// Failure message:
	// Tax on $70,000 is $900.

	double tax = Main.calcTax(70_000.);
	assertEquals(900., tax, .01);

	}
	@Test
	public void test25000() {

	// Failure message:
	// Tax on $25,000 is $250.

	double tax = Main.calcTax(25_000.);
	assertEquals(250., tax, .01);

	}
	@Test
	public void test82000() {

	// Failure message:
	// Tax on $82,000 is $1,210

	double tax = Main.calcTax(82_000.);
	assertEquals(1_210., tax, .01);

	}
	@Test
	public void test110000() {

	// Failure message:
	// Tax on $110,000 is $2,150

	double tax = Main.calcTax(110_000.);
	assertEquals(2_150., tax, .01);

	}
}
