/**
 * Purpose: Program that takes two double command-line arguments t and v and prints the wind chill..
 * 
 * @author Shraddha Thanekar
 * @since  19-04-2018
 *
 */
package com.bridgeit.algorithm.program;

import com.bridgeit.utility.Utility;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import com.bridgeit.utility.Utility;

public class BinarySearchWord {

	public static void main(String[] args) throws IOException {

		Utility utility = new Utility();

		FileReader read=new FileReader("/home/bridgeit/shraddha/WordSearch.txt");
		
		BufferedReader br=new BufferedReader(read);
		
		String file=br.readLine();
		
		System.out.println(file);
		
		String[] stringArray=file.split("\\s");
		
		String stringArray1[]=utility.wordSort(stringArray);
		
		System.out.println("Enter the key:");

		String key = utility.inputString();

		int result=utility.binarySearchWord(stringArray1,0,stringArray1.length-1, key);
        
		if(result==-1)
		{
		System.out.println("key not present ");
		
	}
		else
		{
			System.out.println("key present at "+result+"location");
		}
	}
}
