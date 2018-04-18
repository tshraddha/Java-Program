/**
 * Purpose: sum of three integers.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class SumOfThreeInt {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the number of values to be entered in an array:");

		int noOfUserValue = utility.inputInteger();

		System.out.println("Enter the values in an array:");

		int array[] = utility.Array1(noOfUserValue);

		System.out.println("Check whether the sum of three integer adds to zero or not...");

		utility.sumResult(array);

	}

}
