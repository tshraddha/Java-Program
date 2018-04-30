
package com.bridgeit.datastructureprogram;

import java.util.Arrays;
import java.util.LinkedList;

import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class List {

	static Node head;

	public static <T extends Comparable<T>> void append(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;

		if (head == null) {
			head = node;
		} else {
			Node temp = head;
			while (temp.next != null) {
				temp = temp.next;
			}
			temp.next = node;
		}

	}

	public static <T extends Comparable<T>> void push(T data) {
		Node node = new Node();
		node.data = data;
		node.next = null;
		node.next = head;
		head = node;
	}

	public static <T extends Comparable<T>> void show() {
		Node node = head;
		while (node.next != null) {
			System.out.print(node.data + " ");
			node = node.next;
		}
		System.out.println(node.data);

	}

	public static <T extends Comparable<T>> void remove(int index) {
		Node temp = null, temp1;

		if (index == 0) {
			head = head.next;
		} else {
			for (int i = 0; i < index - 1; i++) {
				temp = temp.next;
			}
		}
		temp1 = temp.next;
		temp.next = temp1.next;

	}

	/*
	 * public static <T extends Comparable <T>> void inserAt( T data,Integer
	 * index) {
	 * 
	 * Node node=new Node(); Node temp = null; node.data=data; node.next=null;
	 * if(index.equals(0)) { insertStart(data); } else { temp=head; } for( int
	 * i=0;i<index-1;i++) { temp=temp.next; } node.next=temp.next;
	 * temp.next=node; }
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

	/*
	 * public static <T extends Comparable <T>> void sort(T data,int size) {
	 * if(size>1) { for(int i=0;i<size;i++) { Node currentNode=head; Node
	 * next=head.next; for(int j=0;j<size-1;j++) { Node temp=currentNode;
	 * currentNode=next; next=temp; }
	 * 
	 * } } show(); }
	 */

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

}
