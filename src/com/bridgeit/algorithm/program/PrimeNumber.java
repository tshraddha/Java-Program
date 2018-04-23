/**
 * Purpose: Program Anagram Detection.
 * 
 * @author Shraddha Thanekar
 * @since  14-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class PrimeNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();
		
		System.out.println("Enter the size:");
		
		int size=utility.inputInteger();

		System.out.println("The Prime Numbers from 1 to "+ size + " are: ");

		int[] primeNumber=utility.primeNumber(size);

	}
}
