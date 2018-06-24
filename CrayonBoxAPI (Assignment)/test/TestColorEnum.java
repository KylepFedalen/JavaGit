

//import static Color.*;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

//import dpr204.Color;

public class TestColorEnum {
	Color col;

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testExistence() {
		System.out.println("\nColor enum: testing existence");
		assertTrue("Color should be an enum type", Color.RED.getClass().isEnum());
	}

	@Test
	public void testConstants() {
		System.out.println("\nColor enum: testing constants");
		boolean haveRED = false;
		boolean haveORANGE = false;
		boolean haveYELLOW = false;
		boolean haveGREEN = false;
		boolean haveBLUE = false;
		boolean haveVIOLET = false;
		boolean haveBROWN = false;
		boolean haveBLACK = false;
		boolean haveEXTRA = false;
		Color[] constants = Color.RED.getClass().getEnumConstants();
		for (Color c : constants) {
			switch (c.toString()) {
			case "RED":
				haveRED = true;
				break;
			case "ORANGE":
				haveORANGE = true;
				break;
			case "YELLOW":
				haveYELLOW = true;
				break;
			case "GREEN":
				haveGREEN = true;
				break;
			case "BLUE":
				haveBLUE = true;
				break;
			case "VIOLET":
				haveVIOLET = true;
				break;
			case "BROWN":
				haveBROWN = true;
				break;
			case "BLACK":
				haveBLACK = true;
				break;
			default:
				haveEXTRA = true;
			}
		}
		assertTrue("Constant RED    is missing", haveRED   );
		assertTrue("Constant ORANGE is missing", haveORANGE);
		assertTrue("Constant YELLOW is missing", haveYELLOW);
		assertTrue("Constant GREEN  is missing", haveGREEN );
		assertTrue("Constant BLUE   is missing", haveBLUE  );
		assertTrue("Constant VIOLET is missing", haveVIOLET);
		assertTrue("Constant BROWN  is missing", haveBROWN );
		assertTrue("Constant BLACK  is missing", haveBLACK );
		assertTrue("Color has an extra constant",!haveEXTRA );
	}

}
