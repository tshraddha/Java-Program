package com.bridgeit.datastructureprogram;

import java.util.NoSuchElementException;

import com.bridgeit.utility.Utility;

public class Queue {
	Utility utility = new Utility();

	private int length;
	
	static Object queueArray[];
	static int size;
	static int front;
	static int rear;
	
	/**
	 * @param length:Determines the length of the Queue.
	 */
	public Queue(int length) {
size=length;
front=-1;
rear=-1;
queueArray=new Object[size];
	}
public Queue()
{
	
}
	
	/**
	 * Function to remove front data from the queue.
	 * 
	 * @return:returns the front removed data.
	 */
	public <T extends Comparable <T>> char frontRemove()
	{
		char data;
		 data=(char) queueArray[front];
		 front++;
		 return data;
		
	}
	/**
	 * Function to remove rear data from the queue.
	 * 
	 * @return:returns the rear remove data.
	 */
	public <T extends Comparable <T>> char rearRemove()
	{
		char data1;
		 data1=(char) queueArray[rear];
		 
		 return data1;
		
	}
	/**
	 * @return:States whether the queue if empty or not.
	 */
	public boolean empty()
	{
		/*if((rear==-1) && (front>rear))
		{
			return true;
		}
		else
		{
			return false;
		}*/
		return front==-1;
	}
	
	
	
	/**
	 * Function to display the data in the queue.
	 */
	public static <T extends Comparable<T>> void show() {
		for(int i=0;i<=rear-1;i++)
		{
			System.out.println(queueArray[i]);
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
			System.out.println("");
		}
		else
			
		{
			front++;
		}
		
	
	}
	
	public <T extends Comparable <T>> Object remove()
	{
		Object element;
		if(empty())
		{
			throw new NoSuchElementException("Underflow Exception");
		}
		else
		{
			size--;
			
	    element=queueArray[front];
	   
			if(front==rear)
			{
				front=-1;
				rear=-1;
			}
			else
			{
				front++;
			}
		}
		return element;
	}
	
	
	public  String palindrome(String string)
	{
		for(int i=0;i<string.length();i++)
		{
			queue(string.charAt(i));
		}
		String reverse="";
		
		for(int i=0;i<string.length();i++)
		{
			reverse=reverse+remove();
		}
		System.out.println(reverse);
		return reverse;
	}
public int size()
{
	return size;
	
}
static	int totalBankBalance=100000;

public  void transaction1(int length) {
	for(int i=0;i<length;i++)
	{
	

	System.out.println("Enter 1 to deposit.");
	
	System.out.println("Enter 2 for withdraw.");
	
	
	
    int choice=utility.inputInteger();

       switch (choice)
       
    	   
{
       case 1:	System.out.println("DEPOSIT");
    	        System.out.println("Enter the deposit amount");
	            int deposit=utility.inputInteger();
	            totalBankBalance=totalBankBalance+deposit;
	            System.out.println("Updated Total Bank Balance is:"+totalBankBalance);
                deQueue(); 
                break;

       case 2:	System.out.println("WITHDRAW");
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
    	        deQueue(); 
    	        break;
    	        
      
}


	}

	}

}
