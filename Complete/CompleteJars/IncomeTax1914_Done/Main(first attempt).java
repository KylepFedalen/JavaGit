package dpr204;

import java.util.Scanner;
/**
 * Directions: Write a income tax calculator for the 1913 income tax. The tax
 * for any amount is as follows:
 *  1) 1 percent on the first $50,000
 *  2) 2 percent on the amount over $50,000 up to $75,000
 *  3) 3 percent on the amount over $75,000 up to $100,000
 *  4) 4 percent on the amount over $100,000 up to $250,000
 *  5) 5 percent on the amount over $250,000 up to $500,000
 *  6) 6 percent on the amount over $500,000.
 * 
 * Hints:
 *  1) This is progressive income tax. If the taxable amount is $80,000
 * the tax rate is not 3% on the total amount. Please read the rules carefully.
 *  2) There are two ways to structure the logic:
 *    a. A sequence of if/else for mutually exclusive brackets. If you do this you can pre-compute the tax on
 *      all lower brackets
 *    b. Independent if statements starting from highest amount to least amount.
 *  3) You must add exception handling to the statement:
 *     income = in.nextDouble();
 *  since the nextDouble() can throw an Exception. See: 
 *  https://docs.oracle.com/javase/9/docs/api/java/util/Scanner.html#nextDouble--
 *  4) If you get a bad input (anything that is NOT a double) you must
 *  discard it by calling in.next() method.
 */

public class Main {

	/**
	 * calcTax method takes the taxable income and returns the tax on that amount
	 * 
	 * @param income
	 * @return
	 */
	public static double calcTax(double income) {
		double tax = 0.0;
		double tax1 = 0;
		double tax2 = 0;
		double tax3 = 0;
		double tax4 = 0;
		double tax5 = 0;
		double tax6 = 0;
		
		// TODO: Write the code that computes the correct tax.
		if(income<=50000){
			tax = income*0.01;
		}else if(income > 50000 && income <= 75000){
			tax1 = (income-(income - 50000))*.01;
			tax2 = (income - 50000)*.02;
			tax = (tax1 + tax2);
		}else if(income > 75000 && income <= 100000){
			tax1 = (income-(income - 50000))*.01;
			tax2 = (75000-50000)*.02;
			tax3 = (income - 75000)*.03;
			tax = (tax1 + tax2 + tax3);
		}else if(income > 100000 && income <= 250000){
			tax1 = (income-(income - 50000))*.01;
			tax2 = (75000-50000)*.02;
			tax3 = (100000 - 75000)*.03;
			tax4 = (income-100000)*.04;
			tax = (tax1 + tax2 + tax3 + tax4);
		}else if(income > 250000 && income <= 500000){
			tax1 = (income-(income - 50000))*.01;
			tax2 = (75000-50000)*.02;
			tax3 = (100000 - 75000)*.03;
			tax4 = (250000-100000)*.04;
			tax5 = (income - 250000)*.05;
			tax = (tax1 + tax2 + tax3 + tax4 + tax5);
		}else if(income > 500000){
			tax1 = (income-(income - 50000))*.01;
			tax2 = (75000-50000)*.02;
			tax3 = (100000 - 75000)*.03;
			tax4 = (250000-100000)*.04;
			tax5 = (500000 - 250000)*.05;
			tax6 = (income - 500000)*.06;
			tax = (tax1 + tax2 + tax3 + tax4 + tax5 + tax6);
		}
		
		return tax;
	}

	public static double getIncome(Scanner in){
		double income = 0.0;
		System.out.println("Enter the income amount (0 to quit): ");
		// TODO: Surround the next statement with exception handling code
		//       You can either write a loop that repeats until a valid
		//       input is entered -OR- Display an error message and stop
		//       the program using System.exit(0);	
		
		for(boolean i = false;i==false;)
			if(in.hasNextDouble()!=true){
				System.out.println("Error, Invalid Input");
				in.next();
				i=false;
			}else{
				income = in.nextDouble();
				i=true;
			}
		return income;
	}

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		boolean done = false;
		while (!done) {
			double tax;
			double income = getIncome(in);
			if (income == 0.0) {
				done = true;
			} else {
				tax = calcTax(income);
				System.out.printf("Tax on %7.2f is %7.2f\n", income, tax);
			}
		}
		in.close();
	}
}
