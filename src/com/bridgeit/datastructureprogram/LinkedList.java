package com.bridgeit.datastructureprogram;

public class LinkedList<T> {
	public class Node<T> {
		Node next;
		T data;
	}

	Node head;

	/**
	 * Function to push data in linked list.
	 * 
	 * @param data:Contains data to be pushed.
	 */
	public <T> void add(T data) {
		// System.out.println("yes we are addng"+"\n");
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

	/**
	 * Function to display Linked List.
	 */
	public <T> void show() {
		//int count = 0;
		Node node = head;
		while (node != null) {
			//count++;
			System.out.println(node.data);
			node = node.next;
		}
		//System.out.println(node.data);
		//System.out.println("total words are:" + (count + 1));
	}
	
	

	/**
	 * Function to Search the data.
	 * @param item:Contains the data to be searched .
	 * @return
	 */
	public <T> int search(T item) {
		Node temp = head;
		int count = 0;
		while (temp != null) {
			count++;
			if ((temp.data).equals(item)) {
				return count;
			}
			temp= temp.next;
		}

		return 0;

	}

	/**
	 * Function to remove the data from linked list.
	 * @param data:Contains the data to be removed.
	 * @param flag
	 */
	public <T> void remove(T data, int flag) {
		Node temp = head;
		Node temp1 = null;
		if (flag == 1) {
			head = head.next;
		} else {
			for (int i = 0; i < flag - 2; i++) {
				temp= temp.next;
			}
			temp1 = temp.next;
			temp.next = temp1.next;
			System.out.println(temp1.data + " removed from linked list");
		}
	}

	/**
	 * Function to put the data at the desired position.
	 * 
	 * @param number:Contains the integer to insert in the desired position.
	 * @param i:Position the data to be inserted.
	 */
	public <T extends Comparable<T>> void sortedAdd(T number) {
		Node node = new Node();
		node.data = number;
		node.next = null;
		Node insert=null;
		
		//Node previousNode = new Node();
		if (head == null) 
		{
			head=null;
		} 
		else 
			
		{
			Node temp = head;
			
			while (temp.next != null)
			{
			if(((Comparable<T>) temp.data).compareTo(number)<0	&& ((Comparable<T>) temp.next.data).compareTo(number) > 0) 
			{
				insert=node;
				insert.next=temp.next;
				temp.next=insert;
				break;
				

			}
			temp=temp.next;
			}
			temp.next=node;
		}
	}
	
	  /**
		 * Generic Function to find the bubble sort.
		 * 
		 * @param array:Contains
		 *            the element in array.
		 * @return:Returns the sorted array.
		 */
		public <T extends Comparable<T>> T[] Sort(T[] array) {

			T temp;
			for (int i = 0; i < array.length; i++) {
				for (int j = 0; j < array.length; j++) {
					if ((array[i]).compareTo(array[j]) < 0) {
						temp = array[i];
						array[i] = array[j];
						array[j] = temp;

					}
				}

			}

			return array;
		}

		
	/*	public <T> void hashFunction() 
		{
			
			System.out.println("Enter the length:");
			
			int length=i
			Node box[];
			
			for(int i=0;i<11)
		}
		}*/
}
