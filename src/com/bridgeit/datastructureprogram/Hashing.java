package com.bridgeit.datastructureprogram;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class Hashing {

	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();

		LinkedList list = new LinkedList();
		
		int i;

		FileReader read = new FileReader("/home/bridgeit/shraddha/Hash.txt");

		BufferedReader br = new BufferedReader(read);

		String file = br.readLine();

		System.out.println(file);

		String[] array = file.split("\\s");
		
		for ( i = 0; i < array.length; i++) 
		{
			list.add(Integer.parseInt(array[i]));

		}
		
	
	}

}
