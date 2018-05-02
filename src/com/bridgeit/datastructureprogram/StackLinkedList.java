package com.bridgeit.datastructureprogram;

public class StackLinkedList <T> {
	
	static Node head;
	
	public static <T extends Comparable<T>> void append(T data) {
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
	
	
	public static <T extends Comparable <T>> void deleteRear()
	{
		
		if(head==null)
		{
			System.out.println("Deletion not possible.");
		}
		/*else if(head.next==null)
		{
			System.out.println("Element delete:"head);
		}*/
		
		else
		{
			Node temp=head;
			head=head.next;
			temp=null;
			
			
		}
	}
	
	public static <T extends Comparable <T>> void display()
	{
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);
	}
	
}
