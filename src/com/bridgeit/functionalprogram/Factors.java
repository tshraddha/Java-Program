/**
 * Purpose: To Print the prime factors of a number.
 * 
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Factors {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter a number:");

		int number = utility.inputInteger();

		System.out.println("The factors of a number are: ");

		utility.factor(number);

	}

}
