/**
 *  Purpose:To  Write Class Static Functions to generate random number and to process distinct coupons.
 * @author Shraddha Thanekar
 * @since  17-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class Square {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter a number: ");
		
		float number = utility.inputFloat();

		utility.computeSqrtRoot(number);

	}

}
