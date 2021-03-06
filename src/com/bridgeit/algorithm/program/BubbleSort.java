/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  18-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class BubbleSort {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the number of elements:");

		int number = utility.inputInteger();

		System.out.println("Enter the element in array: ");

		String array[] = utility.arrayString(number);

		utility.bubbleSort(array);

	}

}
