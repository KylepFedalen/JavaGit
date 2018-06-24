/**
 * DIRECTIONS: Fill in code in each method below using methods from
 * the String class:
 *   indexOf()
 *   lastIndexOf()
 *   charAt()
 *   etc.
 * 
 * And some other static methods:
 * Character.isLetter(), Character.isDigit(), and Integer.parseInt().
 * 
 * ATTENTION: You will have to override return value for each method.
 * 
 * Right click on file TestStringBasics.java and Run As => Junit Test.
 * 
 * Seek out the comment: // your code goes here
 */

public class StringBasics {
	
	public static String method1(String a, String b) {
		// return the concatenated value of the first parameter with the second parameter.
		// your code goes here
		String stringsum = a + b;
		return stringsum;
	}
	
	public static int method2(String x) {
		// return the position of the first letter 'a' within the string parameter.
		// your code goes here
		int charpos = x.indexOf('a'); 
		return charpos;		
	}
		
	public static int method3(String x) {
		// return the position of the last letter 'a' within the string parameter.
		int lastindex = x.lastIndexOf('a');
		return lastindex;		
	}

	public static int method4(String x) {
		// return the count of the letter 'a' within the string parameter.
		// your code goes here
		int varOccour = 0;
		int indexPlace = 0;
		while( indexPlace < x.length()){
			if( x.charAt(indexPlace)== 'a'){
				varOccour++;
				indexPlace++;
				
			}else{
				indexPlace++;
			}
		}
		return varOccour;	
	}
	
	public static void method5(String x, int [] count) {
		// return the frequency of the letters 'a', 'b', 'c' in the count
		// array such that count[0] == the 'a' count, count[1] == the 'b' count, etc.
		// your code goes here
		char dict [] = {'a','b','c'};
		int result = 0;
		int dictindex = 0;
		int stringPlace = 0;
		for(int i = 0;i < 3; i++){
			while(stringPlace < x.length()){
				if(dict[dictindex]==x.charAt(stringPlace)){
					result++;
					stringPlace++;
				}else{
					stringPlace++;
				}
			}
			count[dictindex] = result;
			
			dictindex++;
			result=0;
			stringPlace = 0;
		}
		
	}
	
	public static int method6(String x) {
		// return the count of letters (isLetter() returns 'true')
		// in the string parameter.
		// your code goes here
		int lettervar = 0;
		for(int i = 0;i < x.length();i++){
			boolean cha = Character.isLetter(x.charAt(i));
			if(cha==true){
				lettervar++;
			}
		}
		return lettervar;
	}
	
	
	public static int method7(String x) {
		// return the count of digits (isDigit() returns 'true')
		// in the string parameter.
		// your code goes here
		int numvar = 0;
		for(int i = 0;i < x.length();i++){
			boolean cha = Character.isDigit(x.charAt(i));
			if(cha==true){
				numvar++;
			}
		}
		return numvar;	
	}
	
	public static void method8(String x, int [] count) {
		// return the count of letters and digits in the string parameter.
		// in the string parameter.
		// array such that count[0] == the letter count, count[1] == the digits count.
		// your code goes here
		int numvar = 0;
		int lettervar = 0;
		for(int i = 0;i < x.length();i++){
			boolean cha1 = Character.isLetter(x.charAt(i));
			boolean cha2 = Character.isDigit(x.charAt(i));
			if(cha1==true){
				lettervar++;
			}else if(cha2==true){
				numvar++;
			}
		}
		count[0]= lettervar;
		count[1]= numvar;
	}

	public static int method9(String x) {
		// return the integer (int) value of the string (e.g. "123")
		// your code goes here
		String str = x;
		int num = Integer.parseInt(str);
		return num;
	}
	
	
	public static void main(String[] args) {
		
	}

}
