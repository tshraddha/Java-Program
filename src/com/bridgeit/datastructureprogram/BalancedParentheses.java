/**
 * Purpose: Program to check Balanced Parenthesis using stack.
 * 
 * @author Shraddha Thanekar
 * @since  30-04-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class BalancedParentheses {

	public static void main(String[] args) {

		Utility utility = new Utility();

		System.out.println("Enter the arthematic expression:");

		String expression = utility.inputString();

		int length = expression.length();

		char[] array = expression.toCharArray();

		for (int i = 0; i < array.length; i++) {
			System.out.println(array[i]);
		}
		Stack stack = new Stack(length);

		System.out.println("State whether the arithematic expression is Balanced or Not..");

		boolean result = stack.parenthesis(array);

		if (result == true) {
			System.out.println("Balanced");
		} else {
			System.out.println("Unbalanced");
		}

	}

}
