/**
 *  Purpose:To  Write Class Static Functions to generate random number and to process distinct coupons.
 * @author Shraddha Thanekar
 * @since  19-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class MergeSort {

	public static void main(String[] args) {

		Utility utility = new Utility();
		
		System.out.println("Enter number of element in first array:");
		
		int n1=utility.inputInteger();
		
		System.out.println("Enter number of elememt in second half array:");
		
		int n2=utility.inputInteger();
		
		System.out.println("Merged array is:");
		
		utility.merge(n1,n2);

	}

}
