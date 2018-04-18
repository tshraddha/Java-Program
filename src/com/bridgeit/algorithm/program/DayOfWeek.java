/**
 * Purpose: Program to find day of week by taking input as date.
 * 
 * @author Shraddha Thanekar
 * @since  14-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class DayOfWeek {

	public static void main(String[] args) {

		Utility utility = new Utility();

		// int date = Integer.parseInt(args[0]);

		// int month = Integer.parseInt(args[1]);

		// int year = Integer.parseInt(args[2]);

		System.out.println("Enter the date:");
		
		int date = utility.inputInteger();

		System.out.println("Enter the month:");
		
		int month = utility.inputInteger();

		System.out.println("Enter the year:");
		
		int year = utility.inputInteger();
		
		utility.dayofWeek(date, month, year);

	}

}
