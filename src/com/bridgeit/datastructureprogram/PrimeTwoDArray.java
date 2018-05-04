/**
 * Purpose:Program to find the Prime Number 2D array.
 * 
 * @author Shraddha Thanekar
 * @since  3-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class PrimeTwoDArray {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the row:");

		int row = utility.inputInteger();

		System.out.println("Enter the column:");

		int col = utility.inputInteger();

		utility.prime2d(row, col);

	}

}
