package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class StackList {
	 static Utility utility=new Utility();
	
	public static <T extends Comparable <T>> void push(T data)
	{
		System.out.println("Enter the value:");
		int value=utility.inputInteger();
		String stack[]=new String[value];
		int top=-1;
		if(top==value)
		{
			System.out.println("Stack full");
		}
		else
		{
			stack[top]= (String) data;
			top++; 
		}
	}
	

}
