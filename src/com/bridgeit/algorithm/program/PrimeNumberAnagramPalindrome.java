/**
 * Purpose: Program Anagram Detection.
 * 
 * @author Shraddha Thanekar
 * @since  19-04-2018
 *
 */
package com.bridgeit.algorithm.program;
import com.bridgeit.utility.Utility;


public class PrimeNumberAnagramPalindrome {

	public static void main(String[] args) {

		Utility utility = new Utility();
		
		System.out.println("The prime number from 1 to 100 are:");
		
		int PrimeNumber[]=utility.primeNumber();
		
		utility.primeNumAnagram(PrimeNumber[]);
		

	}

}
