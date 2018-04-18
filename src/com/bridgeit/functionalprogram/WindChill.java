/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  13-04-2018
 *
 */

package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class WindChill {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter output temperature in fahreheit:");

		double temp = Double.parseDouble(args[0]);

		System.out.println("Enter wind speed:");

		double speed = Double.parseDouble(args[1]);

		utility.windChill(temp, speed);

	}

}
