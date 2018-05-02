/**
 * Purpose: Program to simulate banking cash counter..
 * 
 * @author Shraddha Thanekar
 * @since  2-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class BankingCashCounter {



	public static void main(String[] args) {

		System.out.println("Enter total number of people.");

		Utility utility = new Utility();

		int length = utility.inputInteger();

		Queue q = new Queue(length);
		
		q.transaction1(length);
		
		}
}
	



