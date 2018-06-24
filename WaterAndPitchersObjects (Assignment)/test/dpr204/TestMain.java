package dpr204;

import static org.junit.Assert.*;

import java.io.BufferedReader;
import java.io.ByteArrayOutputStream;
import java.io.IOException;
import java.io.PrintStream;
import java.io.StringReader;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestMain {
	boolean [] amounts = new boolean[9];  // 0..8 allowed
	boolean missing = false;
	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	private boolean parseLine(String line) {
		if (line.charAt(0) != '(') return false;
		if (!Character.isDigit(line.charAt(1))) return false;
		if (line.charAt(2) != ',') return false;
		if (!Character.isDigit(line.charAt(3))) return false;
		if (line.charAt(4) != ')') return false;
		return true;
	}
	
	private void processAmount(int amount) {
		//System.out.printf("Process amount %d\n", amount);
		if (0 <= amount && amount <= 8) {
			amounts[amount] = true;
		}
	}

	private void checkAmount(int i) {
		//System.out.printf("Check amount %d\n", i);
		if (!amounts[i]) {
			System.out.printf("Missing amount %d\n", i);
			missing = true;
		}
	}
	

	private void parseLines(String lines) {
		BufferedReader br = new BufferedReader(new StringReader(lines));
		String line;
		try {
			while ((line = br.readLine()) != null) {
				if (parseLine(line)) {
					int amount1 = line.charAt(1) - '0';
					int amount2 = line.charAt(3) - '0';
					processAmount(amount1);
					processAmount(amount2);
				}
			}
		} catch (IOException e) {
			System.out.println("Error reading captured output");
		}
		checkAmount(1);
		checkAmount(2);
		checkAmount(3);
		checkAmount(4);
		checkAmount(6);
		checkAmount(7);
		if (missing) fail("Some amount is missing.  See console output.");
	}

	@Test
	public void mainTest() {
		// setup
		final PrintStream stdOut = System.out;
		final ByteArrayOutputStream myOut = new ByteArrayOutputStream();
		String printResult = null;
		try {
			System.setOut(new PrintStream(myOut));
			MainObjects.main(null);
			printResult = myOut.toString();
			myOut.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.setOut(stdOut);
		//System.out.println(printResult);
		parseLines(printResult);
	}

}
