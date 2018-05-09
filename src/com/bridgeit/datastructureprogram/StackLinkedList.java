package com.bridgeit.datastructureprogram;

public class StackLinkedList <T> {
	
	
	 Node head;
	 Node top=null;
	int size=0;
	
	public  <T extends Comparable<T>> void append(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null)
		{
			head = node;
		} else 
		{
			Node temp = head;
			while (temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = node;
		}

	}
	
	public  <T extends Comparable<T>> void push(T data) {
		Node node = new Node();
        node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}
public int size()
{
	return size;
}
	
	public  <T extends Comparable <T>> T deleteRear()
	{
		Node temp = head;
		Node temp1 = null;
		if(head==null)
		{
			//System.out.println("Deletion not possible.");
		}
		/*else if(head.next==null)
		{
			System.out.println("Element delete:"head);
		}*/
		
		else
		{
			//temp=head;
			//System.out.println(head);
		  //System.out.println(""+temp.data);
			head=head.next;
			 temp1=temp;
			 System.out.println(temp1.data);
			temp=null;
			size--;
			
		}
		return (T) temp1.data;
	}
	public boolean empty()
	 {
		 if(top==null)
		 {
			 System.out.println("Stack is empty.");
			 
			 return true;
		 }
		 else
		 {
			 return false;
		 }
		
	 }
	public  <T extends Comparable <T>> void display()
	{
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		//System.out.println(node.data);
	}

	public  <T > void display1()
	{
		Node temp;
		temp=top;
		if(top.next==null)
		{
			System.out.println("Empty");
		}
		else
		{
			while(temp!=null)
			{
				System.out.println(""+temp.data);
				temp=temp.next;
			}
		}
	}
	public String pop() {
	
		Node temp = null;
		System.out.println(top);
		if(top==null)
		{
			//System.out.println("Stack is empty");
		}
		else
		{
			temp=top;
			//System.out.println();
			top=temp.next;
		}
		return (String) temp.data;
	}

	

	
	
	
}
