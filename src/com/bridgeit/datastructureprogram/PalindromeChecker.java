/**
 * Purpose: Program to check whether the string is Palindrome or not...
 * 
 * @author Shraddha Thanekar
 * @since  2-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class PalindromeChecker {

	public static void main(String[] args) {

		Utility utility = new Utility();

		QueuePalindrome pq = new QueuePalindrome();

		System.out.println("Enter the string:");
		
		String string = utility.inputString();
		
		pq.palindromeChecker1(string);

	}

}
