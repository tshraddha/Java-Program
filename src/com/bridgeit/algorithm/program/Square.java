/**
 *  Purpose:Program to find the square root using Newton Method.
 * @author Shraddha Thanekar
 * @since  19-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class Square {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter a number: ");

		double number = utility.inputDouble();

		utility.computeSqrtRoot(number);

	}

}
