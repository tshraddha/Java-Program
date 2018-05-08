/**
 * 
 * @author Shraddha Thanekar
 * @since  3-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import com.bridgeit.utility.Utility;

public class Ordered {

	public static void main(String[] args) throws IOException {
		Utility utility = new Utility();

		LinkedList<Integer> list = new LinkedList<Integer>();

		FileReader read = new FileReader("/home/bridgeit/shraddha/number.txt");

		@SuppressWarnings("resource")
		BufferedReader br = new BufferedReader(read);

		String file = br.readLine();

		System.out.println(file);

		String[] stringArray = file.split("\\s");

		Object[] array = list.Sort(stringArray);

		int i, j;

		System.out.println("The sorted array is:");

		for (i = 0; i < stringArray.length; i++) {
			System.out.println(array[i]);

		}

		for (j = 0; j < i; j++) {

			list.add(array[j]);
		}
		System.out.println("LinkedList containts:");
		list.show();
		System.out.println("Enter the any value:");
		String value = utility.inputString();
		int index = list.search(value);

		if (index == 0) {
			list.sortedAdd(value);
		} else {
			list.remove(value,index);
		}

		System.out.println("The final Linked List is:");

		list.show();
		
		list.printOrdered();

	}

}
