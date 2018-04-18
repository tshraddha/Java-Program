/**
 * Purpose: Program to find the Monthly Payment.
 * 
 * @author Shraddha Thanekar
 * @since  14-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class MonthlyPayment {

	public static void main(String[] args) {

		Utility utility = new Utility();

		double principal = Double.parseDouble(args[0]);

		double year = Double.parseDouble(args[1]);

		double rate = Double.parseDouble(args[2]);

		utility.monthPayment(principal, year, rate);

	}

}
