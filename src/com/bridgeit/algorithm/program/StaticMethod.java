/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  23-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

public class StaticMethod {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter your Choice:");
		int choice = utility.inputInteger();

		switch (choice) {

		case 1:
			System.out.println("Binary Search method for Integer");
			System.out.println("Enter number of element in array:");
			int number = utility.inputInteger();
			System.out.println("Enter elements in an array");
			Integer array[] = utility.arrayInt(number);
			Integer array1[] = utility.sortInt(array);
			System.out.println("Enter the key:");
			Integer key = utility.inputInteger();
			int result = utility.binarySearch(array1, 0, array.length-1, key);
			if (result == -1) {
				System.out.println("key not present ");
			} else {
				System.out.println("key present at " + result + " location");
			}
			break;

		case 2:
			System.out.println("Binary Search method for String");
			System.out.println("Enter number of element in array:");
			int size = utility.inputInteger();
			System.out.println("Enter elements in an array");
			String arrayStr[] = utility.arrayString(size);
			String arraySt[] = utility.wordSort(arrayStr);
			System.out.println("Enter the key:");
			String keyStr = utility.inputString();
			int resultStr = utility.binarySearch(arraySt, 0, arraySt.length-1, keyStr);
			if (resultStr == -1) {
				System.out.println("key not present ");
			} else {
				System.out.println("key present at " + resultStr + "location");
			}
			break;

		case 3:
			System.out.println("Insertion Sort method for integer");
			System.out.println("Enter number of element in array:");
			int numberInsert = utility.inputInteger();
			System.out.println("Enter elements in an array");
			Integer arrayInsertion[] = utility.arrayInt(numberInsert);
			
			System.out.println("Enter the key:");
			Integer keyInsertion = utility.inputInteger();
			System.out.println("Insertion Sort method for integer");
			utility.insertionSort(arrayInsertion, keyInsertion);
			break;

		case 4:
			System.out.println("Insertion Sort method for string");
			System.out.println("Enter number of element in array:");
			int numberInsertStr = utility.inputInteger();
			System.out.println("Enter elements in an array");
			Integer arrayInsertionStr[] = utility.arrayInt(numberInsertStr);
			
			Integer keyInsertionStr = utility.inputInteger();
			utility.insertionSort(arrayInsertionStr, keyInsertionStr);
			break;

		case 5:
			System.out.println("Bubble Sort method for Integer");
			System.out.println("Enter number of element in array:");
			int numberBubble = utility.inputInteger();
			System.out.println("Enter elements in an array");
			Integer arrayBubble[] = utility.arrayInt(numberBubble);
			utility.bubbleSort(arrayBubble);
			break;

		case 6:
			System.out.println("Bubble Sort method for String");
			System.out.println("Enter number of element in array:");
			int numberBubbleStr = utility.inputInteger();
			System.out.println("Enter elements in an array");
			Integer arrayBubbleStr[] = utility.arrayInt(numberBubbleStr);
			utility.bubbleSort(arrayBubbleStr);
			break;

		}
	}

}
