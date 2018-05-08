
package com.bridgeit.datastructureprogram;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;
import java.util.LinkedList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class List <T> {

	static Node head;

	
	/**
	 * Function to add value at end in linked list.
	 * 
	 * @param data:Takes the data.
	 */
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

	/**
	 * Function to push data at start.
	 * 
	 * @param data:Takes the data.
	 */
	public static <T extends Comparable<T>> void push(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	/**
	 * Function to print data.
	 */
	public static <T extends Comparable<T>> void show() {
		Node node = head;
		while (node != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		//System.out.println(node.data);

	}

	/**
	 * Function to remove the data in linked list.
	 * 
	 * @param index:Determines at which position to delete the data.
	 */
	public static <T extends Comparable<T>> void remove(int index) {
		Node temp = null, temp1;

		if (index == 0) 
		{
			head = head.next;
		} else 
		{
			temp=head;
			temp1=null;
			for (int i = 0; i < index - 1; i++) 
			{
				temp = temp.next;
			}
		
		temp1 = temp.next;
		temp.next = temp1.next;
		temp1=null;
		}
	}

/**
	 * Function to search a value.
	 * 
	 * @param searchItem:Takes the value to search from user.
	 */
	public <T extends Comparable<T>> void search(T searchItem) {
		Node node = new Node();

		Node temp = head;

		int i = 0;
		while (temp != null) {
			if ((temp.data).equals(searchItem))
           {
				remove(i);
				break;
			}
			temp = temp.next;
			i++;
			if ((temp == null)) {
				push(searchItem);
				i++;

			}
		}
		System.out.println("The final linked list is:");

		show();

	}

	/**
	 * Function to find the size of linked list.
	 * 
	 * @return: returns the size of linked list.
	 */
	public static <T extends Comparable<T>> int size() {
		int size = 0;
		Node temp = head;
		while (temp.next != null) {
			temp = temp.next;
			size++;
		}
		return size;
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

	
	/**
	 * Function to display the output in the file.
	 * 
	 * @throws IOException
	 */
	public void printUnordered() throws IOException
	{
		FileWriter fw = new FileWriter("/home/bridgeit/shraddha/WordSearch.txt");

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
	}
}
