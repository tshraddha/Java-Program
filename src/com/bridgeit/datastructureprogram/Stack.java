package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class Stack {
	
	static int maxSize;
	static Object stackArray[];
	static int top;
	private static char data;
	
	 /**
	  * 
	 * @param length:Determines the length of the stack.
	 */
	public Stack(int length) {
		 
		 maxSize=length;
		 stackArray=new Object[maxSize];
		   top = -1;
	}

	 /**
	 * @return:Determines the condition of the stack ,whether empty or not.
	 */
	public static boolean empty()
	 {
		 if(top==-1)
		 {
			 System.out.println("Stack is empty.");
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
	 }
	 
	 /**
	 * @return:Determines the condition of the stack ,whether full or not.
	 */
	public static boolean full()
	 {
		 if(top==maxSize-1)
		 {
			 System.out.println("Stack is full.");
		 }
		return false; 
	 }
	 
		/**
		 * @param data:Data to be pushed in stack.
		 */
		public static <T extends Comparable <T>> void push(T data)
	    {
		if(top==maxSize-1)
		{
			System.out.println("Stack is Full");
		}
		else
		{
			top++;
			stackArray[top]=data;
			
		}
	    }
     
		/**
		 * Function to remove the data in the stack.
		 */
		public static <T extends Comparable <T>> boolean pop()
	    {
			if(top==-1)
			{
				//System.out.println("Stack is empty.");
				return false;

			}
			else
			{
			top--;
			}
			return true;
		}	
		
		/**
		 * Function to display data in the stack.
		 */
		public static <T extends Comparable <T>> void display()
		{
			if(maxSize==0)
			{
				System.out.println("Stack Empty");
			}
			else
			{
				for(int i=top;i>=0;i--)
				{
					System.out.print(stackArray[i]);
					System.out.println();
				}
			}
		}

		
		/**
		 * @param array:Takes the user arithmetic expression.
		 * @return:Determine whether the expression is balanced or unbalanced.
		 */
		public <T extends Comparable <T>> boolean parenthesis(char[] array)
		{

		int i;
				
			
			for( i=0;i<=array.length-1;i++)
			{
				if(array[i]== '(')
				{
					push(array[i]);

				}
			}
				for(i=0;i<=array.length-1;i++)
				{		
				 if(array[i] ==')')
				{
					
				boolean result1 =pop();
					if(result1==false)
					{
                     return false;
					}
				}
				 
				}
			
						
			if(empty())
			{
				return true;
				
			}
			else 
			{
				return false;	
			}
}

		}

		
	
		
		

