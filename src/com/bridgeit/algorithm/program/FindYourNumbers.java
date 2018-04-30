/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  18-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class FindYourNumbers {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the range: ");

		int range = utility.inputInteger();
		
		double rangePower=Math.pow(2, range);
		
		System.out.println(rangePower);
		
		utility.findNumber(0,(int) rangePower);
		

	}

}
