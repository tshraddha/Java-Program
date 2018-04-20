/**
 * Purpose: Program to Simulate Stopwatch.
.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class StopWatch {

	public static void main(String[] args) {

		Utility utility = new Utility();
		
		System.out.println("Enter the start time: ");

		long start = utility.inputLong();

		System.out.println("Enter the stop time: ");

		long stop = utility.inputLong();

		System.out.println("The elapsed time between start and end time is: ");

		utility.eTime(start,stop);

	}

}
