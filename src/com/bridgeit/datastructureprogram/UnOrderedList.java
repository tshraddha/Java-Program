/**
 * Purpose: Program to implement Ordered linked list..
 * 
 * @author Shraddha Thanekar
 * @since  26-04-2018
 *
 */
package com.bridgeit.datastructureprogram;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.io.FileNotFoundException;
import com.bridgeit.utility.Utility;

public class UnOrderedList {

	static Node head;

	public static void main(String[] args) throws Exception {

		Utility utility = new Utility();

		FileReader read = new FileReader("/home/bridgeit/shraddha/WordSearch.txt");

		BufferedReader br = new BufferedReader(read);

		String file = br.readLine();
		br.close();

		System.out.println(file);

		String[] stringArray = file.split("\\s");

		List list = new List();

		for (int i = 0; i < stringArray.length; i++) {
			
			list.push(stringArray[i]);

		}
		System.out.println("The pushed data in linked list is:");

		list.show();

		System.out.println("\n\nEnter the word to be searched:");

		String searchItem = utility.inputString();

		list.search(searchItem);

		list.printUnordered();

	}

}
