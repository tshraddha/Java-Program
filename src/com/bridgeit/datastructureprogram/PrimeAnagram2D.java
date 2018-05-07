/**
 * Purpose:Program to find the Prime Number 2D array.
 * 
 * @author Shraddha Thanekar
 * @since  3-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class PrimeAnagram2D  {

	public static void main(String[] args) throws Exception {
		
		Utility utility = new Utility();
		
		System.out.println("Enter the n'th term:");
		
		int number=utility.inputInteger();
		
		int []primeArray=utility.primeNumber(number);
		
		int anagram[]=utility.primeAnagram2D(primeArray);
	
        
	}

}
