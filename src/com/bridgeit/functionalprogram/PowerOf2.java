/**
 * Purpose: To replace a string.
 * 
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class PowerOf2 {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter number of times: ");
		
		//int times = Integer.parseInt(args[0]);
		
		int times=utility.inputInteger();

		System.out.println("a table of the powers of 2 are :");

		utility.Power(times);

	}

}
