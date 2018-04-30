/**
 * Purpose: Program to implement Ordered linked list..
 * 
 * @author Shraddha Thanekar
 * @since  25-04-2018
 *
 */
package com.bridgeit.datastructureprogram;

import java.io.BufferedReader;
import java.io.FileReader;
import java.util.Arrays;

import com.bridgeit.utility.Utility;
import com.sun.xml.internal.ws.policy.privateutil.PolicyUtils.Collections;

public class OrderedList {
	static Node head;

	public static void main(String[] args) throws Exception {

		Utility utility = new Utility();

		FileReader read = new FileReader("/home/bridgeit/shraddha/number.txt");

		BufferedReader br = new BufferedReader(read);

		String file = br.readLine();

		System.out.println(file);

		String[] stringArray = file.split("\\s");

		List l = new List();

		String a[] = l.Sort(stringArray);

		System.out.println("The sorted array is:");

		for (int i = 0; i < stringArray.length; i++)
		{
			System.out.println(a[i]);

		}

		for (int i = 0; i < stringArray.length; i++) 
		{
			l.push(a[i]);

		}
		System.out.println("The pushed data in linked list is:");

		l.show();

		System.out.println("Enter the word to be searched:");

		String searchItem = utility.inputString();

		l.search(searchItem);

		/*
		 * FileWriter fw=new
		 * FileWriter("/home/bridgeit/shraddha/LinkedListData.txt");
		 * 
		 * BufferedWriter bw=new BufferedWriter(fw);
		 * 
		 * PrintWriter pw=new PrintWriter(bw);
		 * 
		 * Node node=head; while(node.next!=null) { pw.print(node.data+" ");
		 * node=node.next; } pw.print(node.data); pw.close();
		 */

	}

}
