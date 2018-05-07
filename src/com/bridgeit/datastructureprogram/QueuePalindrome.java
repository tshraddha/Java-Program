package com.bridgeit.datastructureprogram;

public class QueuePalindrome {

	char[] queue = new char[20];

	int size = 0;
	int front = 0;
	int rear = 0;

	/**
	 * Function to push the data in the queue.
	 * 
	 * @param data:Contains the data to be enqueue.
	 */
	public void enqueue(char data) {
		queue[rear] = data;
		System.out.println("The enqueue data is:" + queue[rear]);
		rear++;
		size++;
	}

	/**
	 * Function to remove the front data.
	 * 
	 * @return:returns the front remove data.
	 */
	public char frontRemove() {
		char data1;
		data1 = queue[front];
		front++;
		return data1;
	}

	/**
	 * Function to remove the rear removed data.
	 * 
	 * @return:returns the rear removed data.
	 */
	public char rearRemove() {

		size--;
		rear--;
		char data2;
		data2 = queue[rear];
		return data2;
	}

	/**
	 * Function to display the data in the queue.
	 */
	public void show() {
		for (int i = 0; i < rear - 1; i++)

		{
			System.out.println(queue[i]);
		}
	}

	/**
	 * @return:returns the size of the queue.
	 */
	public int size() {
		return size;
	}

	/**
	 * Function to check whether the string is palindrome or not.
	 * 
	 * @param string:Contains the string to check whether it is palindrome or not.
	 */
	public void palindromeChecker1(String string) {

		// System.out.println("The length is: ");

		 int length=string.length();

		char array[] = string.toLowerCase().toCharArray();

		int arrayLen = array.length;

		for (int i = 0; i < arrayLen; i++) {
			enqueue(array[i]);
		}

		char data0;
		char data1;
		boolean flag = false;
		while (size() > 1) {
			data0 = frontRemove();

			data1 = rearRemove();

			if (data0 != data1) {

				flag = false;
				break;
			} else {
				flag = true;
			}

		}
		if (flag == true) {
			System.out.println("PALINDROME");
		} else {
			System.out.println("NOT PALINDROME ");
		}

	}

}
