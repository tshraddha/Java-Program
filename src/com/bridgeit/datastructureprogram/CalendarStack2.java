package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class CalendarStack2 {

	public static void main(String[] args) {
				
		  // Stack1 stk2=new Stack1();
		  Utility utility = new Utility();
		  
		    StackCalendar s1 = new StackCalendar();
			StackCalendar s2 = new StackCalendar();

			int i;
			
			System.out.println("Enter the month:");

			int month = utility.inputInteger();

			System.out.println("Enter the year:");

			int year = utility.inputInteger();
		  String[] months = { "", "january", "February", "March", "April", "May", "June", "July", "Agust", "September",
		    "October", "November", "December" };
		  int[] days = { 0, 31, 28, 31, 30, 31, 30, 31, 31, 30, 31, 30, 31 };
		  if (month == 2 && utility.leapYear(year))
		   days[month] = 29;

		  System.out.println("  " + months[month] + " " + year);
		  System.out.println();
		  System.out.println("  sun " + " Mon " + " Tue " + " wed " + " Thu  " + " Fri  " + " sat");
		  int d = utility.day(month, 1, year);
		  for ( i = 0; i < d; i++) {

		   s1.push("    ");
		  }
		  /*
		   * for(int i=1;i<=days[month];i++) { //System.out.printf("%2d ",i); stk.push(i);
		   * //stk.pop(); if((i+d)%7==0||i==days[month]) { //System.out.println(" ");
		   * stk.push("\n"); //stk.pop(); } }
		   */
		  for ( i = 1; i <= days[month]; i++) {

		   if (i < 10) {
		    s1.push(" " + i);
		   } else {
		    s1.push(""+i);
		   }

		   if ((i + d) % 7 == 0 || i == days[month]) {
		    s1.push("\n");
		   }

		  }
		  // System.out.println("first stack");
		  // stk.display();
		  int size = s1.size();
		  for ( i = 0; i < size; i++) {
		   String n = (String) s1.pop();
		   // System.out.println(n);
		   s2.push(" ");
		   s2.push(""+n);
		  }

		  //stk.size();
		  // System.out.println("second stack");
		  s2.display();
		 }

	

	}


