/**
 * Override the random assignments to variables a, b, c in the methods below
 * to score a goal.  If you make the correct assignments your output will 
 * look like this:
 * 1. Goal!
 * 2. Goal!
 * ...
 * 12. Goal!
 */

public class Main {
	private static int count = 1;

	public static int randomInt(int N) {
		return (int) (Math.random() * N) + 1;

	}

	public static boolean randomBool() {
		return Math.random() > .5 ? true : false;

	}

	public static void ifTest1() {
		/**
		 * override the random values assigned to a, b to score a goal.
		 */
		int a = 2;
		int b = 1;
		// your code goes here
		if (a > b) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest2() {
		/**
		 * override the random values assigned to a, b, and c to score a goal.
		 */
		int a = 2;
		int b = 1;
		int c = 3;
		// your code goes here
		if (a > b) {
			if (b < c) {
				System.out.printf("%d. Goal!\n", count);
			}
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest3() {
		/**
		 * override the random values assigned to a, b, and c to score a goal.
		 */
		int a = 1;
		int b = 1;
		int c = 1;
		// your code goes here
		if (a == b && b == c) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest4() {
		/**
		 * override the random values assigned to a, b, and c to score a goal.
		 */
		int a = 1;
		int b = 1;
		int c = 2;
		// your code goes here
		if (a == b)  {
			if (b != c) {
				System.out.printf("%d. Goal!\n", count);
			} else {
				System.out.printf("%d. Miss!\n", count);
			}
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest5() {
		/**
		 * override the random values assigned to a, b, and c to score a goal.
		 */
		int a = 3;
		int b = 2;
		int c = 2;
		// your code goes here
		if (!(a < b) && (a > c)) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest6() {
		/**
		 * use the correct String comparison function.
		 */
		String a = "abc";
		String b = "acb";		
		// use the String.compareTo() method instead of < operator
		// and replace EVERYTHING between the first and last parentheses below.
		// your code goes here
		int var = a.compareTo(b);
		if (var == -1) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}
	
	public static void ifTest7() {
		/**
		 * use the correct String comparison function.
		 */
		String a = "abc";
		// the sequence below is to thwart a compiler optimization
		// that leads to a false conclusion.
		String b  = "a";		
		       b += "b";		
		       b += "c";
		// You should not use == to test for string equality
		// so change the code within the parentheses.
		if (a.equals(b)) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest8() {
		/**
		 * override the random values assigned to a, b to score a goal.
		 */
		boolean a = true;
		boolean b = true;
		// your code goes here
		if ( a && b) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest9() {
		/**
		 * override the random values assigned to a, b to score a goal.
		 */
		boolean a = false;
		boolean b = false;
		// your code goes here
		if ( !a || !b ) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest10() {
		/**
		 * override the random values assigned to a, b to score a goal.
		 */
		boolean a = true;
		boolean b = false;
		// your code goes here
		if ( (!a && b) || (a && !b)) {
			System.out.printf("%d. Goal!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void ifTest11() {
		/**
		 * override the random values assigned to a to score a goal.
		 */
		int a = 5;
		// your code goes here
		if (a == 1) {
			System.out.printf("%d. Miss!\n", count);
		} else if (a == 2) {
			System.out.printf("%d. Miss!\n", count);
		} else if (a == 3) {
			System.out.printf("%d. Miss!\n", count);
		} else if (a == 4) {
			System.out.printf("%d. Miss!\n", count);
		} else if (a == 5) {
			System.out.printf("%d. Goal!\n", count);
		} else if (a == 6) {
			System.out.printf("%d. Miss!\n", count);
		} else {
			System.out.printf("%d. Miss!\n", count);
		}
	}
	public static void switchTest12() {
		/**
		 * override the random values assigned to a to score a goal.
		 */
		int a = 6;
		// your code goes here
		switch (a) {
		case 1:	
			System.out.printf("%d. Miss!\n", count);
			break;
		case 2:	
			System.out.printf("%d. Miss!\n", count);
			break;
		case 3:	
			System.out.printf("%d. Miss!\n", count);
			break;
		case 4:	
			System.out.printf("%d. Miss!\n", count);
			break;
		case 5:	
			System.out.printf("%d. Miss!\n", count);
			break;
		case 6:	
			System.out.printf("%d. Goal!\n", count);
			break;
		default:
			System.out.printf("%d. Miss!\n", count);
		}
	}

	public static void main(String[] args) {
		// Don't touch this code!
		ifTest1(); count++;
		ifTest2(); count++;
		ifTest3(); count++;
		ifTest4(); count++;
		ifTest5(); count++;
		ifTest6(); count++;
		ifTest7(); count++;
		ifTest8(); count++;
		ifTest9(); count++;
		ifTest10(); count++;
		ifTest11(); count++;
		switchTest12(); count++;
	}
}
