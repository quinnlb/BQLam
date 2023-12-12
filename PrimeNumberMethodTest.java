/*
 * Class: CMSC201 
 * Instructor:
 * Description: Test isPrime method using JUnit
 * Due: 12/11/23
 * I pledge that I have completed the programming assignment independently.
   I have not copied the code from a student or any source.
   I have not given my code to any student.
   Print your Name here:  Bao Quyen Lam_________
*/


import org.junit.Test;
import static org.junit.Assert.*;

	public class PrimeNumberMethodTest {
		/**
	     * Test the isPrime method with various input values.
	     */
	   @Test
	    public void testIsPrime() {
	        assertTrue(PrimeNumberMethod.isPrime(2));
	        assertTrue(PrimeNumberMethod.isPrime(3));
	        assertTrue(PrimeNumberMethod.isPrime(5));
	        assertTrue(PrimeNumberMethod.isPrime(17));
	        assertTrue(PrimeNumberMethod.isPrime(13));
	        assertTrue(PrimeNumberMethod.isPrime(11));
	        assertFalse(PrimeNumberMethod.isPrime(10));
	        assertFalse(PrimeNumberMethod.isPrime(6));
	        assertFalse(PrimeNumberMethod.isPrime(8));
	        assertFalse(PrimeNumberMethod.isPrime(9));
	        assertFalse(PrimeNumberMethod.isPrime(4));
	    }
	}