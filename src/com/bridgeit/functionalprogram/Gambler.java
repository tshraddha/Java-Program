/**
 * Purpose: Gambler.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Gambler {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter number of times gambler plays game:");

		int play = utility.inputInteger();

		System.out.println("Enter the stack amount:");

		int stack = utility.inputInteger();

		System.out.println("Enter value of goal:");

		int goal = utility.inputInteger();

		utility.winloss(play, stack, goal);

	}

}
