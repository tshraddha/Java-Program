package com.bridgeit.datastructureprogram;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintStream;
import java.io.PrintWriter;

import com.bridgeit.datastructureprogram.LinkedList.Node;
import com.bridgeit.utility.Utility;

public class HashList {
	public class Node<T extends Comparable <T>> {
		public T data;
		public Node next;
		
		
	}
	  public Node table[];
	  public int size;
       Node head;
	
	    
	    /**
	     * @param tableSize:Determines the size of the hash table to build.
	     */
	    public HashList(int tableSize)
	    {
	    	table=new Node[tableSize];

	    	size=0;
	    }
    
	    /**
	     * @return:returns the size .
	     */
	    public boolean empty()
	    {
	    	return size==0;
	    }
    
    /**
     * Function to add the data in the linked list.
     * 
     * @param data:Contains the data to be inserted in the linked list.
     */
    public  void add(int data) {
		
		Node node=new Node();
		size++;
		int position=hashMap(data);

		node.data = data;
		node.next = null;

		if (table[position] == null)
		{
			table[position] = node;
			
		} 
		else 
		{
			node.next=table[position];
			table[position]=node;
		}

	}
    
    
    
    /**
     * Function to remove the data from the linked list.
     * 
     * @param data:Contains the data to be removed.
     * 
     */
    public  void remove(int data)
    {
    	Node node=new Node();
    	
    	int position=hashMap(data);
    	
		Node temp =table[position];
		Node temp1 = null;
		
		Integer nodeData=(Integer) temp.data;
		
		if (nodeData.equals(data)) 
		{
			temp1=temp;
			temp=temp.next;
			table[position]=temp;
			temp1=null;
			return;
		} 
		else
		{
		while(temp!=null)
		{
			nodeData=(Integer) temp.data;
			if(nodeData.equals(data))
			{
				break;
			}
			else
			{
				temp1=temp;
				temp=temp.next;
			}
			temp1.next=temp.next;
		}
				
		}
	}
    
    
    
	/**
	 * Function to determine the position of the data in the linked list.
	 * 
	 * @param data:Takes the data.
	 * @return:returns the result.
	 */
	private  int hashMap(int data) 
	{
	
		int position=data;
		 position=position%table.length;
		
		return position;
	}

	/**
	 * Function to add the number in the linked list.
	 * 
	 * @param addNumber:The number to be added in the linked list.
	 */
	public void search(int number) 
	{
		
		
		int position=hashMap(number);
		Integer data=number;
        int count=0;
		Node temp=table[position];
		//Integer temp1=temp.data;
		
		while(temp!=null)
		{
			if(temp.data.equals(data))
			{
				count++;
				break;
			}
			temp=temp.next;
		}
		
		if(count>0)
		{
			System.out.println("File found in the table");
			remove(data);
		}
		else
		{
			System.out.println("File not found in the table");
			add(data);
		}
		
	}
	
	
	
	/**
	 * Function to display the output of hash function.
	 */
	public <T> void display() {
		
		for(int i=0;i<table.length;i++)
		{
			System.out.print(i+ " : ");
			Node temp=table[i];
			while(temp!=null)
			{
				System.out.print(temp.data+" ");
				temp=temp.next;
			}
			System.out.println();
		}
	}
	
	
	
	/**
	 *Function to display the data in the file.
	 * 
	 * @throws IOException
	 */
	/*public void printHashList() throws IOException
	{
		FileWriter fw = new FileWriter("/home/bridgeit/shraddha/number.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		PrintWriter pw = new PrintWriter(bw);

		Node node = head;
		
		if (head == null)
		{
			System.out.println("Empty");
		} 
		else if (head.next == null) 
		{
			pw.print(node.data + " ");
		} 
		else {
			while (node != null)
           {
				pw.print(node.data + " ");

				node = node.next;
			}
		}
		// pw.print(node.data);
		pw.close();
	}*/
	
	Utility utility = new Utility();
	public void write()
	{
		utility.write1("/home/bridgeit/shraddha/Hash.txt",table);
	}

	
}
