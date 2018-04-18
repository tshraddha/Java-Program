/**
 * Purpose: Program Anagram Detection.
 * 
 * @author Shraddha Thanekar
 * @since  14-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class TemperatureConvert {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the temperature in Celsius:");

		double tempInCel = utility.inputDouble();

		utility.tempConvert(tempInCel);

	}

}
