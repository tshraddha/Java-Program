/**
 * Purpose: To replace a string.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class FlipCoin {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter number of times to flip coin:");

		int flip = utility.inputInteger();

		utility.percentHeadTail(flip);

	}

}
