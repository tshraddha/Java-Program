package com.bridgeit.objectorientedprograms;

import com.bridgeit.datastructureprogram.Node;

public class QueueLinkedList<T> {
	

    static Node head;
    
	   // static int size=0;
		static Node front;

		static Node rear=null;
	
	public static <T extends Comparable<T>> void enQueue(T data) {
		Node node = new Node();
		//node.data = data;
		//node.next = null;
		Node temp =new Node() ;
		temp.data=data;
		if(rear==null)
		{
			front=temp;
			rear=temp;
		}
		else
		{
			while(rear.next!=null)
			{
				rear=rear.next;
			}
			rear.next=temp;
			rear=temp;
		}

	}
	
	public static <T extends Comparable <T>> void displayList()
	{
		Node node = front;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		//System.out.println(node.data);
	}


}
