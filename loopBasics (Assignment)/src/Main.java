/**
 * DIRECTIONS: Within each of the methods (e.g. loop1()) below write a loop
 * (for, while, do) statement that accomplishes the described goal.
 * 
 * You can test your code by right clicking on the test file TestMain.java 
 * and selecting Run As => JUnit test. You get the "green bar" when all test
 * cases pass.
 * 
 * Seek out the comment  // your code goes here
 */

import java.lang.Math;

public class Main {

	public static int loop1(int n) {
		int sum = 0;
		// write a loop that determines the sum of the first n positive integers: 1 + 2 + 3 + ...
		// your code goes here.
		int num1 = 1;		
		for(int i = n; i > 0;i--){
			sum = sum + num1;
			num1++;
		}
		return sum;
	}
	
	public static int loop2(int n) {
		int sum = 0;
		// write a loop that determines the sum of the first n positive even integers: 2 + 4 + 6 + ...
		// your code goes here.
		int num1 = 2;		
		for(int i = n; i > 0;i--){
			sum = sum + num1;
			num1 = num1 + 2;
		}
		return sum;
	}
	
	public static int loop3(int n) {
		int sum = 0;
		// write a loop that determines the sum of the first n positive odd integers: 1 + 3 + 5 + ...
		// your code goes here.
		int num1 = 1;		
		for(int i = n; i > 0;i--){
			sum = sum + num1;
			num1 = num1 + 2;
		}
		return sum;
	}

	public static double loop4() {
		double sum = 0.0;
		// write a loop that determines the sum of the first 5 terms of the series:
		// 1. + 1./2. + 1./3. + 1./4. + 1./5. +  ...
		// your code goes here.	
		for(double i = 1; i < 6;i++){
			sum = sum+(1/i);
		}
		return sum;
	}
	
	public static double loop5() {
		double sum = 0.0;
		// write a loop that determines the sum of the first 5 terms of the series:
		// 1. + 1./2. + 1./4. + 1./8. + 1./16. + ...
		// Hint: the denominators are powers of 2.
		// your code goes here.
		double stagernum=1;
		for(double i = 1; i < 6;i++){
			sum = sum+(1/stagernum);
			stagernum = Math.pow(2,i);
		}
		
		return sum;
	}

	public static double loop6() {
		double sum = 0.0;
		// write a loop that determines the sum of the first 4 terms of the series:
		// 1./(1.*2.) + 1./(2.*3.) + 1./(3.*4.) + 1./(4.*5.) + ...
		// your code goes here.
		for(double i = 1; i < 5;i++){
			sum = sum+(1/(i*(i+1)));
		}
		return sum;
	}

	public static double loop7() {
		double sum = 0.0;
		// write a loop that determines the sum of the first 5 terms of the series:
		// 1. - 1./2. + 1./3. - 1./4. + 1./5. + ...
		// Hint: use modulus operator to determine if the iteration is odd (positive term) or even (negative term).
		// your code goes here.
		for(double i = 1; i < 6;i++){
			if((i%2)==0){
				sum = sum-(1/i);
			}
			else{
				sum = sum+(1/i);
			}
		}
		return sum;
	}

		
	public static void main(String [] args) {
		System.out.printf("Sum first 10 pos. integers: %d\n", loop1(10));
		System.out.printf("Sum first 10 pos. even integers: %d\n", loop2(10));
		System.out.printf("Sum first 10 pos. odd  integers: %d\n", loop3(10));
		System.out.printf("Sum first 5 terms of harmonic series: %f\n", loop4());
		System.out.printf("Sum first 5 terms of halving denominator series: %f\n", loop5());
		System.out.printf("Sum first 5 terms of unity series: %f\n", loop6());
		System.out.printf("Sum first 5 terms of ln(2) series: %f\n", loop7());
	}

}