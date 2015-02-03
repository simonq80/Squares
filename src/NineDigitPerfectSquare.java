/**
 * CS2010 (Hilary Term) - Assignment 1
 * 
 * Nine Digit Perfect Square
 * 
 * A natural number, p, is a perfect square if for some natural number k, k^2=p.
 * For example, 16 is a perfect square, as 4^2=16. The number 20 is not a
 * perfect square as there is no natural number k such that k^2=20.
 * 
 * Problem: Develop an algorithm that will find all nine-digit perfect squares
 * that use all nine digits exactly once. For example, 139,854,276 is a solution
 * (the first) as 11,826^2=139,854,276.
 * 
 * 1) Fill in the implementation of the methods described in this file.
 * 
 * 2) Test your implementation by developing suitable test suite in the
 * NineDigitPerfectSquareTest JUnit test case.
 * 
 * @author:
 * 
 */

public class NineDigitPerfectSquare {

	private static final int FIRST_NUM = 123456789; // smallest candidate for an
													// answer
	private static final int LAST_NUM = 987654321; // largest candidate for an
													// answer
	private static final int FIRST_ROOT = 11112;
	private static final int LAST_ROOT = 31426;

	/**
	 * The nine digit perfect squares containing all 9 digits will never change.
	 * 
	 * It might thus be a good idea to perform the computation in the
	 * constructor, storing the result in a private class variable.
	 */
	public NineDigitPerfectSquare() {
		int[] squares = getNineDigitPerfectSquares();
	}
	
	/**
	 * A method to determine if the number specified in parameter "number"
	 * contains all 9 digits exactly once.
	 * 
	 * @param number
	 *            : A number to be tested
	 * @return whether the number contains all 9 digits exactly once
	 */
	public boolean containsAllDigitsOnce(int number) {
		if(number>LAST_NUM ||number<FIRST_NUM)return false;
		int x = number;
		int remainder;
		int[] digits = new int[10];
		while(x>0){
			remainder = x%10;
			x = x/10;
			if(digits[remainder]==0)digits[remainder]=1;
			else return false;
		}
		
		for(int i = 1; i<10; i++)if(digits[i]==0) return false;
		return true;
	}
	


	/**
	 * A method to return the number of perfect nine digit squares, which
	 * contain all digits 1..9 exactly once.
	 * 
	 * @return number of 9-digit perfect squares containing all numbers 1..9
	 */
	public int countNineDigitPerfectSquares() {
		int count = 0;
		for(int i = FIRST_ROOT; i <= LAST_ROOT; i++)if(containsAllDigitsOnce(i*i))count++;
		return count;
	}

	/**
	 * A method to return an array containing all the squares discovered
	 * 
	 * @return an array containing all of the perfect squares which
	 * contain all digits 1..9 exactly once.
	 */
	public int[] getNineDigitPerfectSquares() {
		int[] array = new int[countNineDigitPerfectSquares()];
		int count = 0;
		for(int i = FIRST_ROOT; i <= LAST_ROOT; i++){
			if(containsAllDigitsOnce(i*i)){
				array[count] = i;
				count++;
			}	
		}
		return array;
	}
}