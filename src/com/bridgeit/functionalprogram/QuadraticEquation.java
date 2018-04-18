/**
 * Purpose: Program to find the roots of Quadratic Equation.
 * 
 * @author Shraddha Thanekar
 * @since  12-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class QuadraticEquation {

	public static void main(String[] args) {

		System.out.println("Enter the values of a,b,c:");

		Utility utility = new Utility();

		double a = utility.inputDouble();

		double b = utility.inputDouble();

		double c = utility.inputDouble();

		utility.quadraticEqu(a, b, c);

	}

}
