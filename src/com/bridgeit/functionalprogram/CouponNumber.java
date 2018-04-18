/**
 * Purpose: Program to find day of week by taking input as date.
 * 
 * @author Shraddha Thanekar
 * @since  17-04-2018
 *
 */
package com.bridgeit.functionalprogram;

import com.bridgeit.utility.Utility;

public class CouponNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the number of coupons: ");

		int sizeArray = utility.inputInteger();

		utility.distinctCoupons(sizeArray);

	}

}
