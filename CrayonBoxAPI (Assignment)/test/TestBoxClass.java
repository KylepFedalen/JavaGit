

// ATTENTION: Code to be tested must be in the dpr204 package !!!
//import Box;
//import Color;
//import Crayon;
//import testUtils;

import static org.junit.Assert.*;

import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Type;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestBoxClass {
	Box box;

	@Before
	public void setUp() throws Exception {
		box = new Box();
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testConstructor() {
		System.out.println("\nBox: testing constructor");
		Class c = box.getClass();
		Constructor[] allConstructors = c.getDeclaredConstructors();
		assertTrue("Expect one constructor: Box()", allConstructors.length == 1);
		Constructor ctor = allConstructors[0];
		Class<?>[] pTypes = ctor.getParameterTypes();
		assertTrue("Constructor should not require parameters", 0 == pTypes.length);
	}

	@Test
	public void testFields() {
		System.out.println("\nBox: testing properties (a.k.a. fields, attributes)");
		Class c = box.getClass();
		Field[] allFields = c.getDeclaredFields();
		assertTrue("Expect one field: crayons", allFields.length == 1);
		Field crayonsField = allFields[0];
		Class type = crayonsField.getType();
		assertTrue("field should be an array", type.isArray());
		Class eleType = type.getComponentType();
		assertTrue("field should be Crayon []", eleType.getSimpleName().equals("Crayon"));
	}

	@Test
	public void testMethodNames() {
		System.out.println("\nBox: testing method names");
		boolean haveToString = false;
		boolean haveSharpen  = false;
		boolean haveAdd      = false;
		boolean haveRemove   = false;
		Class c = box.getClass();
		Method[] allMethods = c.getMethods();
		for (Method m : allMethods) {
			String name = m.getName();
			Class[] paramTypes = m.getParameterTypes();
			System.out.printf("  %s ", m.getDeclaringClass().getSimpleName());
			System.out.printf("method \'%s\' param types: ", name);
			switch (name) {
			case "add":
				haveAdd = true;
				break;
			case "sharpen":
				haveSharpen = true;
				break;
			case "toString":
				haveToString = m.getDeclaringClass().getSimpleName().equals("Box");
				break;
			case "remove":
				haveRemove = true;
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
		boolean [] presence = { haveAdd, haveSharpen, haveRemove, haveToString};
		String [] names = { "add()", "sharpen()", "remove()", "toString()", };
		String msg = testUtils.getMissingMethodsString(presence, names);
//		assertTrue("add() method is missing", haveAdd);
//		assertTrue("sharpen() method is missing", haveSharpen);
//		assertTrue("remove() method is missing", haveRemove);
//		assertTrue("toString() method is missing", haveToString);
		assertTrue(msg, haveAdd);
		assertTrue(msg, haveSharpen);
		assertTrue(msg, haveRemove);
		assertTrue(msg, haveToString);
	}

//	@Test
//	public void testAddMethod() {
//		System.out.println("\nBox: testing method \'add\'");
//		try {
//			Method m = box.getClass().getMethod("add", Crayon.class);
//			Class[] paramTypes = m.getParameterTypes();
//			assertTrue("\'add()\' method should have one parameter", paramTypes.length == 1);
//			assertTrue("\'add()\' method parameter should be Crayon type", paramTypes[0] == Crayon.class);
//			Class retType = m.getReturnType();
//			assertTrue("\'add()\' method should return void", retType == Void.TYPE);
//		} catch (NoSuchMethodException | SecurityException e) {
//			fail("\'add\' method should be: \'void add(Crayon c)\'");
//		}
//
//	}
	@Test
	public void testAddMethod() {
		System.out.println("\nBox: testing method \'add\'");
		Class [] paramTypes = {Crayon.class};
		testUtils.testMethod(Box.class, "add", 1, paramTypes, Void.TYPE);
	}
//	@Test
//	public void testSharpenMethod() {
//		System.out.println("\nBox: testing method \'sharpen\'");
//		try {
//			Method m = box.getClass().getMethod("sharpen", Crayon.class);
//			Class[] paramTypes = m.getParameterTypes();
//			assertTrue("\'sharpen()\' method should have one parameter", paramTypes.length == 1);
//			assertTrue("\'sharpen()\' method parameter should be Crayon type", paramTypes[0] == Crayon.class);
//			Class retType = m.getReturnType();
//			assertTrue("\'sharpen()\' method should return void", retType == Void.TYPE);
//		} catch (NoSuchMethodException | SecurityException e) {
//			fail("\'sharpen\' method should be: \'void sharpen(Crayon c)\'");
//		}
//
//	}
	@Test
	public void testSharpenMethod() {
		System.out.println("\nBox: testing method \'sharpen\'");
		Class [] paramTypes = {Crayon.class};
		testUtils.testMethod(Box.class, "sharpen", 1, paramTypes, Void.TYPE);
	}

//	@Test
//	public void testRemoveMethod() {
//		System.out.println("\nBox: testing method \'remove\'");
//		try {
//			Method m = box.getClass().getMethod("remove", Color.class);
//			Class[] paramTypes = m.getParameterTypes();
//			assertTrue("\'remove()\' method should have one parameter", paramTypes.length == 1);
//			assertTrue("\'add()\' method parameter should be Color type", paramTypes[0] == Color.class);
//			Class retType = m.getReturnType();
//			assertTrue("\'remove()\' method should return Crayon", retType == Crayon.class);
//		} catch (NoSuchMethodException | SecurityException e) {
//			fail("\'remove\' method should be: \'Crayon remove(Color color)\'");
//		}
//
//	}
	@Test
	public void testRemoveMethod() {
		System.out.println("\nBox: testing method \'remove\'");
		Class [] paramTypes = {Color.class};
		testUtils.testMethod(Box.class, "remove", 1, paramTypes, Crayon.class);
	}
//	@Test
//	public void testToStringMethod() {
//		System.out.println("\nBox: testing method \'toString\'");
//		try {
//			Method m = box.getClass().getMethod("toString", null);
//			Class[] paramTypes = m.getParameterTypes();
//			assertTrue("\'toString()\' method should have no parameters", paramTypes.length == 0);
//			Class retType = m.getReturnType();
//			assertTrue("\'toString()\' method should return String", retType == String.class);
//		} catch (NoSuchMethodException | SecurityException e) {
//			fail("\'toString\' method should be: \'String toString()\'");
//		}
//	}
	@Test
	public void testToStringMethod() {
		System.out.println("\nBox: testing method \'toString\'");
		Class [] paramTypes = null;
		testUtils.testMethod(Box.class, "toString", 0, paramTypes, String.class);
	}
	// @Test
	// public void test() {
	// System.out.println("\n");
	// }

}
