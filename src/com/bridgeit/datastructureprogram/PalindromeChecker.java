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
		
      QueuePalindrome q = new QueuePalindrome();
      
		System.out.println("Enter the string:");
		
		String string=utility.inputString();
		
		q.palindromeChecker(string);
		
		
		/*String reverse= " ";
		System.out.println("Enter the string to check palindrome:");
		
		String string=utility.inputString();
		
        int length = string.length();

		Queue q = new Queue(length);
		
		for(int i=0;i<string.length();i++)
		{
			q.queue(string.charAt(i));
		}
		//for(int i=0;i<string.length();i++)
		
		while(!q.empty())
		{
			reverse=reverse+q.remove();
		}
		
		System.out.println(reverse);

 
		if(string.equals(reverse))
		{
			System.out.println("Palindrome");
		}
		else
		{
			System.out.println("Not Palindrome");
		}*/
	}

}
