package com.bridgeit.datastructureprogram;

public class QueuePalindrome {
	
	char[]queue=new char[20];
	int size=queue.length;
	int front=0;
	int rear=0;
	
	
	public void enqueue(char data)
	{
		queue[rear]=data;
		rear++;
		size++;
		
	}
	
	public char frontRemove()
	{
		char data;
		data=queue[front];
		front++;
		return data;
	}
	
	public char rearRemove()
	{
		char data1;
		data1=queue[rear];
		rear++;
		return data1;
	}
	
	public void show()
	{
	for(int i=0;i<rear-1;i++)
	{
		System.out.println(queue[i]);
	}
	}
	
	public int size()
	{
		return size;
	}

	public void palindromeChecker(String string) {
		
		char[] array=string.toLowerCase().toCharArray();

		for(int i=0;i<array.length;i++)
		{
			enqueue(array[i]);
		}
		
		char data1,data2;
		
		boolean result=false;
		
		while(size()>1)
		{
			data1=frontRemove();
			data2=rearRemove();
			if(data1!=data2)
			{
				result=false;
				break;
			}
			else
			{
				result=true;
				
			}
			if(result=true)
			{
				System.out.println("Palindrome");
			}
			else
			{
				System.out.println("Non Palindrome");
			}
		}

	}

}
