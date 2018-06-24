

//import Color;
//import Crayon;
//import Sharpness;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestCrayonClass {
	Crayon crn;
	@Before
	public void setUp() throws Exception {
		 crn = new Crayon(12.0, Color.RED);
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testInterfaces() {
		System.out.println("\nCrayon: testing interfaces");
		Class c = crn.getClass();
		Class [] allClasses = c.getInterfaces();
		boolean haveComparable = false;
		for (Class i: allClasses) {
			if (i == Comparable.class) {
				haveComparable = true;
			}
		}
		assertTrue("Crayon doesn't implement Comparable<Crayon>", haveComparable);
	}

	
	@Test
	public void testConstructor() {
		System.out.println("\nCrayon: testing constructor");
		Class c = crn.getClass();
		Constructor[] allConstructors = c.getDeclaredConstructors();
		assertTrue("Expect one constructor: Crayon()", allConstructors.length == 1);
		Constructor ctor = allConstructors[0];
		Class<?>[] paramTypes = ctor.getParameterTypes();
		assertTrue("Constructor should two parameters", 2 == paramTypes.length);
		assertTrue("\'Crayon()\' constructor's first parameter should be double type", paramTypes[0] == double.class);
		assertTrue("\'Crayon()\' constructor's second parameter should be Color type", paramTypes[1] == Color.class);
//		assertTrue("\'Crayon()\' constructor's third parameter should be Sharpness type", paramTypes[2] == Sharpness.class);
	}

	@Test
	public void testFields() {
		System.out.println("\nCrayon: testing properties (a.k.a. fields, attributes");
		boolean haveLength = false;
		boolean haveColor = false;
		boolean haveSharpness = false;
		boolean haveSomethingElse = false;
		Class c = crn.getClass();
		Field[] allFields = c.getDeclaredFields();
		assertTrue("Crayon should have 2 properties", 2 == allFields.length);
		for (Field f: allFields) {
			Class fieldType = f.getType();
			if (fieldType == double.class) {
				haveLength = true;
			} else if (fieldType == Color.class) {
				haveColor = true;
//			} else if (fieldType == Sharpness.class) {
//				haveSharpness = true;
			} else {
				haveSomethingElse = true;
			}
		}
		if (!haveLength) {
			fail("Crayon is missing property: double length;");
		}
		if (!haveColor) {
			fail("Crayon is missing property: Color color;");
		}
//		if (!haveSharpness) {
//			fail("Crayon is missing property: Sharpness sharp;");
//		}
		if (haveSomethingElse) {
			fail("Crayon has an extra property");
		}

	}

	@Test
	public void testMethodNames() {
		System.out.println("\nCrayon: testing methods");
		boolean haveGetSharpness = false;
		boolean haveSetSharpness = false;
		boolean haveGetColor     = false;
		boolean haveGetLength    = false;
		boolean haveSetLength    = false;
		boolean haveCompareTo    = false;
		boolean haveToString     = false;
		boolean haveDraw         = false;
		Class c = crn.getClass();
		Method[] allMethods = c.getMethods();
		for (Method m : allMethods) {
			String name = m.getName();
			Class[] paramTypes = m.getParameterTypes();
			System.out.printf("  %s ", m.getDeclaringClass().getSimpleName());
			System.out.printf("method \'%s\' param types: ", name);
			switch (name) {
			case "getSharpness":
				haveGetSharpness = true;
				break;
			case "setSharpness":
				haveSetSharpness = true;
				break;
			case "getLength":
				haveGetLength = true;
				break;
			case "setLength":
				haveSetLength = true;
				break;
			case "toString":
				haveToString = m.getDeclaringClass().getSimpleName().equals("Crayon");
				break;
			case "compareTo":
				haveCompareTo =  m.getDeclaringClass().getSimpleName().equals("Crayon");
				break;
			case "draw":
				haveDraw =  true;
				break;
			}
			if (paramTypes.length == 0) {
				System.out.print("none");
			} else {
				for (Class pType : paramTypes) {
					System.out.printf("%s ", pType.getSimpleName());
				}
			}
			System.out.println();
		}
		boolean [] presence = { haveGetLength, haveSetLength, haveCompareTo, haveDraw};
		String [] names = { "getLength()", "setLength()", "toString()", "compareTo()", "draw()" };
		String msg = testUtils.getMissingMethodsString(presence, names);
//		assertTrue("getSharpness() method is missing", haveGetSharpness);
//		assertTrue("setSharpness() method is missing", haveSetSharpness);
//		assertTrue("getLength() method is missing", haveGetLength);
//		assertTrue("setLength() method is missing", haveSetLength);
//		assertTrue("toString() method is missing", haveToString);
//		assertTrue("compareTo() method is missing", haveCompareTo);
//		assertTrue("draw() method is missing", haveDraw);
		assertTrue(msg, haveGetLength);
		assertTrue(msg, haveSetLength);
		assertTrue(msg, haveToString);
		assertTrue(msg, haveCompareTo);
		assertTrue(msg, haveDraw);

	}

//	@Test
//	public void testGetSharpnessMethod() {
//		System.out.println("\nCrayon: testing method \'getSharpness\'");
//		Class [] paramTypes = null;
//		testUtils.testMethod(Crayon.class, "getSharpness", 0, paramTypes, Sharpness.class);
//	}
//
//	@Test
//	public void testSetSharpnessMethod() {
//		System.out.println("\nCrayon: testing method \'setSharpness\'");
//		Class [] paramTypes = {Sharpness.class};
//		testUtils.testMethod(Crayon.class, "setSharpness", 1, paramTypes, Void.TYPE);
//	}

	@Test
	public void testGetColorMethod() {
		System.out.println("\nCrayon: testing method \'getColor\'");
		Class [] paramTypes = null;
		testUtils.testMethod(Crayon.class, "getColor", 0, paramTypes, Color.class);
	}

	@Test
	public void testGetLengthMethod() {
		System.out.println("\nCrayon: testing method \'getLength\'");
		Class [] paramTypes = null;
		testUtils.testMethod(Crayon.class, "getLength", 0, paramTypes, double.class);
	}

	@Test
	public void testSetLengthMethod() {
		System.out.println("\nCrayon: testing method \'setLength\'");
		Class [] paramTypes = {double.class};
		testUtils.testMethod(Crayon.class, "setLength", 1, paramTypes, Void.TYPE);
	}

//	@Test
//	public void test() {
//		System.out.println("\nCrayon: testing method \'\' ");
//		Class [] paramTypes ;
//		testUtils.testMethod(class, methodName, numParams, paramTypes, retType);
//	}

}
