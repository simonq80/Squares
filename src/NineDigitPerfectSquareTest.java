import static org.junit.Assert.*;

import org.junit.Test;

/**
 * Test class for NineDigitPerfectSquare
 * 
 * @author 
 *
 *	TODO: Implement tests to cover the functionality provided by your methods.
 *
 */

public class NineDigitPerfectSquareTest {

	@Test
	public void testConstructor() {
		NineDigitPerfectSquare tmp = new NineDigitPerfectSquare();
		assertNotNull("Testing the constructor of NineDigitPerfectSquare", tmp);
	}

	/**
	 * Test method for the containsAllDigitsOnce method
	 */
	@Test
	public void testContainsAllDigitsOnce() {
		NineDigitPerfectSquare ndps = new NineDigitPerfectSquare();
		assertEquals("Testing containsAllDigitsOnce with 123456789, expected true", true, ndps.containsAllDigitsOnce(123456789) );
		assertEquals("Testing containsAllDigitsOnce with 111111111, expected false", false, ndps.containsAllDigitsOnce(111111111) );
		assertEquals("Testing containsAllDigitsOnce with 987654321, expected true", true, ndps.containsAllDigitsOnce(978645321) );
	}
	@Test
	public void testCountNineDigitPerfectSquares() {
		NineDigitPerfectSquare ndps = new NineDigitPerfectSquare();
		assertEquals("Testing getNineDigitPerfectSquares() with 30, expected true", 30, ndps.countNineDigitPerfectSquares());
	}
	/*@Test
	public void testGetNineDigitPerfectSquares() {
		NineDigitPerfectSquare ndps = new NineDigitPerfectSquare();
		int[]array = ndps.getNineDigitPerfectSquares();
		for(int i = 0; i < array.length; i++){
			assertEquals("Testing containsAllDigitsOnce with each perfect square, expected true", true, ndps.containsAllDigitsOnce(array[i]) );
		}
	}*/
}
