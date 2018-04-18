/**
 * Purpose: Program to calculate  Euclidean distance.
 * 
 * @author Shraddha Thanekar
 * @since  11-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class Distance {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the value of x1:");

		double x1 = utility.inputDouble();

		System.out.println("Enter the value of y1:");

		double y1 = utility.inputDouble();

		utility.Distance(x1, y1);

	}

}
