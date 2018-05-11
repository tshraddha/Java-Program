/**
 * Purpose: Program to create Data Management.
 * 
 * @author Shraddha Thanekar
 * @since  10-05-2018
 *
 */
package com.bridgeit.objectorientedprograms;

import java.io.FileReader;
import java.util.Iterator;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;
import org.json.simple.parser.JSONParser;

public class DataManagement {

	public static void main(String[] args) {

		    JSONParser parser = new JSONParser();
		try {

			Object obj = parser.parse(new FileReader("/home/bridgeit/shraddha/JSon.json"));

			JSONObject jsonObject = (JSONObject) obj;

			JSONArray list = (JSONArray) jsonObject.get("Details");

			System.out.println("Details");

			Iterator<String> iterator = list.iterator();

			while (iterator.hasNext())
			{
				System.out.println(iterator.next()); 
			}

		} catch (Exception e) 
		{
			e.printStackTrace();
		}
	}

}
