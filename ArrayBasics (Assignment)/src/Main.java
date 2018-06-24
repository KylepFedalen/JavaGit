/**
 * DIRECTIONS: Fill in code in each method below.
 * Consult the textbook BJLO pp. 258 - 268
 *                      BJLO 2nd. ed. pp. 270 - 279
 * 
 * Right click on file TestMain.java and Run As => Junit Test.
 * 
 * Seek out the comment: // your code goes here
 */
import java.util.Arrays;

public class Main {
	/**
	 * This method returns the smallest number in the scores array.
	 * @param scores array of double.
	 * @return smallest value of array.
	 */
	public static double smallest(double [] scores) {
		// your code goes here
		int scoresPlace = 0;
		double smallNum = scores[0];
		while(scoresPlace<scores.length){
			
			if(smallNum > scores[scoresPlace]){
				smallNum = scores[scoresPlace];
				scoresPlace++;
			}else{
				scoresPlace++;
			}
		}
		double smallest = smallNum;
		
		
		return smallest;
	}
	/**
	 * This method returns the largest number in the scores array.
	 * @param scores array of double.
	 * @return largest value of array.
	 */
	public static double largest(double [] scores) {
		// your code goes here
		int scoresPlace = 0;
		double largeNum = scores[0];
		while(scoresPlace<scores.length){
			
			if(largeNum < scores[scoresPlace]){
				largeNum = scores[scoresPlace];
				scoresPlace++;
			}else{
				scoresPlace++;
			}
		}
		double largest = largeNum;
		return largest;
	}
	
	// mean, mode, median
	/**
	 * This method returns the mean (average) of the scores.
	 * @param scores array of test scores.
	 * @return mean (average)
	 */
	public static double mean(double [] scores) {
		// your code goes here
		double total = 0.0;
		double mean = 0.0;
		for(int i=0; i < scores.length;i++){
			total = total+scores[i];
		}
		
		mean=total/scores.length;
		return mean;
	}
	/**
	 * This method returns the "middle" value when the scores are 
	 * arranged from lowest to highest. This requires the scores to be sorted.
	 * In the case where there are an odd # of scores the middle value is the one in the middle.
	 * In the case where there are an even # of scores the mean is the average of the 
	 * two middle scores.
	 *
	 * ATTENTION: You must make a copy of the scores array within the method.
	 * and you must sort the values.  Consider using the static methods in the Arrays class:
	 * - copyOf()
	 * - sort()
	 * 
	 * @param scores immutable array of test scores.
	 * @return median score.
	 */
	public static double median(double [] scores) {
		// your code goes here
		double median  = 0.0;
		double[] copy = Arrays.copyOf(scores,scores.length);
		Arrays.sort(copy);
		if(copy.length%2 == 0){
			median = (copy[copy.length/2]+copy[copy.length/2-1])/2;
		}else{
			median = copy[copy.length/2];
		}
		return median;
	}
	/**
	 * This method returns the most frequently occurring value in scores.
	 * If all of the values are unique, then the method returns -1.0.
	 *
	 * ATTENTION: You must make a copy of the scores array within the method.
	 * and you must sort the values.  Consider using the static methods in the Arrays class:
	 * - copyOf()
	 * - sort()
	 * 
	 * @param scores array of test scores.
	 * @return mode of the test scores.
	 */
	public static double mode(double [] scores) {
		// your code goes here
		double[] copy = Arrays.copyOf(scores,scores.length);
		Arrays.sort(copy);
		double mode = -1.;
		double maxValue = copy[0];
		int maxCount = 0;
		for(int a = 0; a < copy.length; a++){
			int count = 0;
			for(int b = 0; b < copy.length; b++){
				if(copy[b]==copy[a]){
					count++;
				}
			}
			if(count > maxCount){
				maxCount = count;
				maxValue = copy[a];
			}
		}
		if(maxCount != 1){
			mode = maxValue;
		}
		return mode;
	}
	
	public static void main(String[] args) {
		// Just run the test classes as follows:
		// right click on the test class, e.g. TestSmallest
		// from the pop-up menu select Run As => JUnit test.
		// 
		// Implement and test in this order:
		// smallest()
		// largest()
		// mean()
		// median()
		// mode()
	}

}
