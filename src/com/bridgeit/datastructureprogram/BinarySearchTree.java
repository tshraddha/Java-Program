/**
 * Purpose: Program to find the Binary Search Tree.
 * 
 * @author Shraddha Thanekar
 * @since  2-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class BinarySearchTree {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter number of test cases:");

		int testCase = utility.inputInteger();

		for (int i = 0; i < testCase; i++) {
			
			System.out.println("Enter the number:");

			int number = utility.inputInteger();

			utility.catalianNumber(number);
		}

	}

}
