package com.bridgeit.datastructureprogram;

public class StackLinkedList <T> {
	
	
	 Node head;
	 int top;
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
	public  <T extends Comparable <T>> void display()
	{
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		//System.out.println(node.data);
	}

	

	
	
	
}
