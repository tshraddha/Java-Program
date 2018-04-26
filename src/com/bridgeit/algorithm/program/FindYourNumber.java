/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  18-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class FindYourNumber {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the range: ");

		int range = utility.inputInteger();
		
		double rangePower=Math.pow(range, 2);
		
		System.out.println(rangePower);
		
		double[] array=new double[(int) rangePower];
		
		for(int i=0;i<rangePower;i++)
		{
		array[i]=i;
		}
		
		utility.findNumber(array);
		

	}

}
