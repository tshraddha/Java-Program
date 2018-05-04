/**
 * Purpose: Program to check whether the string is Palindrome or not...
 * 
 * @author Shraddha Thanekar
 * @since  3-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class CalendarStack {

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
			StackLinkedList s1 = new StackLinkedList();
			
			/*System.out.println(" " + months[month-1] + " " + year);
			System.out.println("\n");
			System.out.println(" S \t M \t Tu  \t W \t Th  \t F  \t S");
			System.out.println("\n");*/
			System.out.println("   " + months[month-1] + " " + year);
			System.out.println(" S  M Tu  W Th  F  S");
            //q.displayList();
			int d = utility.day(month, 1, year);

			for (int i = 0; i < d; i++)
				s1.push(" ");
			for (int i = 1; i <= days[month]; i++) 
			{
				s1.push(" " +i);
				if (((i + d) % 7 == 0) || (i == days[month])) 
				{
					s1.push(" ");

				}

			}
			StackLinkedList s2 = new StackLinkedList();
			
			boolean result=s1.empty();
			while(result==false)
			{
				String data=(String) s1.deleteRear();
			
				s2.push(data);
				
			}
			s2.display();
		}

	}

}
