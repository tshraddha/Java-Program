/**
 * Purpose: Program Anagram Detection.
 * 
 * @author Shraddha Thanekar
 * @since  18-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class AnagramDetection {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the first String:");

		String string1 = utility.inputString1();

		System.out.println("Enter the second String:");

		String string2 = utility.inputString1();

		System.out.println("State whether the string is Anagram or Not..");

		utility.anagramDetect(string1, string2);

	}

}
