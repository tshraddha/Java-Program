/**
 * Purpose: Program Anagram Detection.
 * 
 * @author Shraddha Thanekar
 * @since  13-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class PermutationString {

	public static void main(String[] args) {

		Utility utility = new Utility();
		
		System.out.println("Enter a string:");
		
		String string = utility.inputString();

		int lengthString = string.length();

		utility.permute(string, 0, lengthString - 1);

	}

}
