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

		System.out.println(file);

		String[] stringArray = file.split("\\s");

		List l = new List();

		for (int i = 0; i < stringArray.length; i++) {
			
			l.push(stringArray[i]);

		}
		System.out.println("The pushed data in linked list is:");

		l.show();

		System.out.println("\n\nEnter the word to be searched:");

		String searchItem = utility.inputString();

		l.search(searchItem);

		FileWriter fw = new FileWriter("/home/bridgeit/shraddha/WordSearch.txt");

		BufferedWriter bw = new BufferedWriter(fw);

		PrintWriter pw = new PrintWriter(bw);

		Node node = head;

		if (head == null) {
			System.out.println("Empty");
		} else if (head.next == null) {
			pw.print(node.data + " ");
		} else {
			while (node.next != null) {
				pw.print(node.data + " ");

				node = node.next;
			}
		}
		// pw.print(node.data);
		pw.close();

	}

}
