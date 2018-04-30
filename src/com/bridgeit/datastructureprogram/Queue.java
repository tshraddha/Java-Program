package com.bridgeit.datastructureprogram;

import com.bridgeit.utility.Utility;

public class Queue {
	Utility utility = new Utility();
	
	static Object queueArray[];
	static int size;
	static int front;
	static int rear;
	
	/**
	 * @param length:Determines the length of the Queue.
	 */
	public Queue(int length) {
size=length;
front=0;
rear=-1;
queueArray=new Object[size];
	}

	/**
	 * @return:States whether the queue if empty or not.
	 */
	public boolean empty()
	{
		if((rear==-1) && (front>rear))
		{
			return true;
		}
		else
		{
			return false;
		}
	}
	
	/**
	 * @param data:To insert the data in the queue
	 */
	public <T extends Comparable <T>> void queue(T data)
	{
		if(rear ==size -1)
		{
			System.out.println("Queue is Full.");
		}
		else
		{
			++rear;
			queueArray[rear]=data;
			
		}
		
	}
	
	/**
	 * Function to remove the data from the queue.
	 */
	public <T extends Comparable <T>> void deQueue()
	{
		if((rear==-1) || (front>rear))
		{
			System.out.println("Queue is empty.");
		}
		else
			
		{
			front++;
		}
	}
	
public  void transaction()
{
	int totalBankBalance=100000;
	
	System.out.println("Enter 1 to deposit.");
	
	System.out.println("Enter 2 for withdraw.");
	
    int choice=utility.inputInteger();

       if(choice ==1)
{
	System.out.println("Enter the deposit amount");
	
	int deposit=utility.inputInteger();
	
totalBankBalance=totalBankBalance+deposit;
System.out.println("Updated Total Bank Balance is:"+totalBankBalance);
	
 }
       else
       {
    	   System.out.println("Enter the withdrawal amount");
    	   int withdrawAmount=utility.inputInteger();
    	   if(withdrawAmount<=totalBankBalance)
    	   {
    		totalBankBalance=totalBankBalance-withdrawAmount;  
    		
    	   }
    	   else
    	   {
    		   System.out.println("Out of Balance");
    	   }
    	   System.out.println("Updated Total Bank Balance"+totalBankBalance);
       }
}
}
