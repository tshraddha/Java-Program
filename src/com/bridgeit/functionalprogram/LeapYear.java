/**
 * Purpose: To replace a string.
 * 
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class LeapYear {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the year:");

		int year = utility.inputInteger();

		utility.leap(year);

	}

}
