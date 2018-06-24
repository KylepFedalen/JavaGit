

import static org.junit.Assert.assertTrue;
import static org.junit.Assert.fail;

import java.lang.reflect.Method;

public class testUtils {

	public static void testMethod(Class methodClass, String methodName,
			int numParams, Class[] paramTypes, Class retType) {
//		System.out.println("\nBox: testing method \'sharpen\'");
		try {
			Method m = methodClass.getMethod(methodName, paramTypes);
			Class[] pTypes = m.getParameterTypes();
			if (numParams == 0) {
				assertTrue("\'" + methodName + "\' method should have no parameters", pTypes.length == 0);
			} else if (numParams == 1) {
				assertTrue("\'" + methodName + "\' method should have one parameter", pTypes.length == 1);
				assertTrue("\'" + methodName + "\' method parameter should be " + paramTypes[0].getSimpleName() + " type", pTypes[0] == paramTypes[0]);
			} else {
				throw new IllegalArgumentException("Expecting 0 or 1 parameter types");
			}
			Class rType = m.getReturnType();
			assertTrue("\'" + methodName + "\' method should return "+ retType.getSimpleName(), rType == retType);
		} catch (NoSuchMethodException | SecurityException e) {
			String failString = "\'" + methodName + "\' method should be: ";
			if (retType == Void.TYPE) {
				failString += "void ";
			} else {
				failString += retType.getSimpleName() + " ";
			}
			failString += methodName + "(";
			if (paramTypes.length > 0) {
				failString += paramTypes[0].getSimpleName() + " x";
			}
			failString += ")\n";
//System.out.println(failString);
			fail(failString);
		}

	}
	// present and name are parallel arrays
	static String getMissingMethodsString(boolean [] presence, String [] name) {
		String str = "";
		int i = 0;
		for (boolean b: presence) {
			if (!b) {
				if (!str.equals("")) {
					str += ",";
				}
				str += name[i];
			}
			i++;
		}
		return "Missing methods: " + str;
	}
	
}
