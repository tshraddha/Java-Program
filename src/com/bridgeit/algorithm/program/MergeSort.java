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
		
		System.out.println("Enter number of element is array:");
		
		int number=utility.inputInteger();
		
		System.out.println("Enter elements in array:");
		
		int array[]=utility.Array1(number);
		
		utility.sort(array,0,array.length-1);
		
		 System.out.println("The merged sorted array is:");
		
          utility.mergedArray(array);

	}

	
}
