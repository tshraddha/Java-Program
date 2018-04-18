/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  18-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class StaticMethod {

	public static void main(String[] args) {
		
			Utility utility = new Utility();

			System.out.println("Enter your Choice:");
			int choice=utility.inputInteger();
			
			switch (choice) {
			
			case 1:System.out.println("Binary Search method for Integer");
			       utility.binarySearchInt();
			       break;
				
			case 2:System.out.println("Binary Search method for String");
		           utility.binarySearchString();
		           break;
		       
			case 3:System.out.println("Insertion Sort method for integer");
	               utility.insertionSortInt();
	               break;
	    
			case 4:System.out.println("Insertion Sort method for string");
	               utility.insertionSortString();
	               break;
			
			case 5:System.out.println("Bubble Sort method for Integer");
	               utility.bubbleSortInt();
	               break;
		
			case 6:System.out.println("Bubble Sort method for String");
	               utility.bubbleSortString();
	               break;

			
			
			}
			}
		  

	}


