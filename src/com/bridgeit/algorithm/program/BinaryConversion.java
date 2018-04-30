/**
 *  Purpose:To  Write Class Static Functions to generate random number and to process distinct coupons.
 * @author Shraddha Thanekar
 * @since  19-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class BinaryConversion {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter a number:");

		int decimalNum = utility.inputInteger();

		String binaryString=utility.convertBinary(decimalNum);

	
		
		utility.convertDecimal(binaryString);

	}

}
