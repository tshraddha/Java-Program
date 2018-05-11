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

		int i;
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
			StackCalendar s1 = new StackCalendar();
			StackCalendar s2 = new StackCalendar();
			

			System.out.println("    " + months[month - 1] + " " + year);

			System.out.println(" S  M Tu  W Th  F  S");

			int d = utility.day(month, 1, year);

			for ( i = 0; i < d; i++)
			{
				s1.push(" ");
			 
			}
			
			for ( i = 0; i <= days[month]; i++)
			{
				if(i<10)
				{
					s1.push(" "+i);
				}
				else
				{
					s1.push(""+i);
				}
			}

			
			if((i+d)%7==0 || i==days[month])
			{
				s1.push("\n");
			}
			int len = s1.size();
			for ( i = 0; i < len; i++) {
				String data = s1.pop();
				s2.push(" ");
				s2.push(""+data);
			}

			s1.display();

		}

	}

}
