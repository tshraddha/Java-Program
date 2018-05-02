/**
 * Purpose: Program to check whether the string is Palindrome or not...
 * 
 * @author Shraddha Thanekar
 * @since  2-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class CalendarQueue {

	public static void main(String[] args) {


		Utility utility = new Utility();

		System.out.println("Enter the month:");

		int month = utility.inputInteger();

		System.out.println("Enter the year:");

		int year = utility.inputInteger();

		String months[] = { "January", "February", "March", "April", "May", "June", "July", "August", "September",
				"October", "November", "December" };

		int days[] = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };

		if (month == 2 && utility.leapYear(year))
			days[month] = 29;
		{
			Queue q = new Queue(year);
			
			q.queue("   " + months[month] + " " + year);
			q.queue(" S  M Tu  W Th  F  S");
            q.display();
			int d = utility.day(month, 1, year);

			for (int i = 0; i < d; i++)
				System.out.print("   ");
			for (int i = 1; i <= days[month]; i++) 
			{
				System.out.printf("%2d ", i);
				if (((i + d) % 7 == 0) || (i == days[month])) 
				{
					System.out.println();

				}

			}
		}
	}

}
