/**
 *  Purpose: To find the value of Harmonic Series.
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Harmonics {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter value of N'th term:");

		int number = utility.inputInteger();

		System.out.println("The harmonic series of N'th factor is : ");

		utility.Harmonic(number);

	}

}
