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
			QueueLinkedList q = new QueueLinkedList();
			q.enQueue("\t\t\t   " + months[month-1] + " " + year);
			q.enQueue("\n");
			q.enQueue("\t S \t M \t Tu  \t W \t Th  \t F  \t S");
			q.enQueue("\n");
            //q.displayList();
			int d = utility.day(month, 1, year);

			for (int i = 0; i < d; i++)
				q.enQueue("\t");
			for (int i = 1; i <= days[month]; i++) 
			{
				q.enQueue("\t " +i);
				if (((i + d) % 7 == 0) || (i == days[month])) 
				{
					q.enQueue("\n");

				}

			}
			q.displayList();
		}
	}

}
