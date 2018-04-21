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

		System.out.println("Enter number of element in array:");

		int number = utility.inputInteger();

		System.out.println("Enter elements in an array");

		String array[] = utility.array1(number);

		System.out.println("Enter your Choice:");
		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			System.out.println("Binary Search method for Integer");
			boolean result = utility.binarySearch(array);
			if (result == false) {
				System.out.println("key not present ");
			} else {
				System.out.println("key present at " + result + "location");
			}
			break;

		case 2:
			System.out.println("Binary Search method for String");
			String array1[] = utility.wordSort(array);
			System.out.println("Enter the key:");
			String key = utility.inputString();
			int result = utility.binarySearchWord(array1, 0, array1.length - 1, key);
			if (result == -1) {
				System.out.println("key not present ");
			} else {
				System.out.println("key present at " + result + "location");
			}
			break;

		case 3:
			System.out.println("Insertion Sort method for integer");
			utility.insertionSort(array, key);
			break;

		case 4:
			System.out.println("Insertion Sort method for string");
			utility.insertionSort(array, key);
			break;

		case 5:
			System.out.println("Bubble Sort method for Integer");
			utility.bubbleSort(array);
			break;

		case 6:
			System.out.println("Bubble Sort method for String");
			utility.bubbleSort(array);
			break;

		}
	}

}
