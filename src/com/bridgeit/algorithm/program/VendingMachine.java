/**
 * Purpose: Program to find the Monthly Payment.
 * 
 * @author Shraddha Thanekar
 * @since  16-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class VendingMachine {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter amount to withdraw:");

		int amount = utility.inputInteger();

		System.out.println("The amount withdraw format is:");

		utility.vendingMachine(amount);

	}
}
