/**
 * Purpose: A library for reading in 2D arrays of integers, doubles, or 
 *          booleans from standard input and printing them out to standard output.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Array {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter a choice:");

		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			System.out.println("Integer Array contains");
			utility.Array();
			break;

		case 2:
			System.out.println("Double");
			utility.doubleArray();
			break;

		case 3:
			System.out.println("Boolean");
			utility.booleanArray();
			break;

		default:
			System.out.println("Invalid");

		}

	}

}
