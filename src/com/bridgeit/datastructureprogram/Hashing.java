/**
 * Purpose:Program to implement hashing function.
 * 
 * @author Shraddha Thanekar
 * @since  8-05-2018
 *
 */
package com.bridgeit.datastructureprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();
		System.out.println("Enter the size:");
		int size = utility.inputInteger();
		HashList list = new HashList(size);
		FileReader read = new FileReader("/home/bridgeit/shraddha/Hash.txt");
		BufferedReader br = new BufferedReader(read);
		String file = br.readLine();
         System.out.println(file);
		for (String fileString : file.split("\\s", 0))
		{
			int number = Integer.parseInt(fileString);
			
			list.add(number);			
		}
		System.out.println("Enter the number to be found: ");
		
		int addNumber=utility.inputInteger();		
		list.search(addNumber);		
		list.display1();		
		list.write();
	
	
	
	

	}

}
