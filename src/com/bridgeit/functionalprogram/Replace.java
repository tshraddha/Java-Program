
/**
 * Purpose: To replace a string.
 * 
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Replace {

	public static void main(String[] args) {
		Utility utility = new Utility();

		System.out.println("Enter your name:");

		String name = utility.inputString();

		String input = "Hello  <<UserName>>, How are you?";

		String replacedString = utility.replaceString(input, name);

		System.out.println(replacedString);

	}

}
