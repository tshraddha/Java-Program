
package com.bridgeit.objectorientedprograms;

import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class JsonExample {

	@SuppressWarnings("unchecked")
	public static void main(String[] args) throws IOException {
		JSONObject obj = new JSONObject();
		obj.put("name", "shraddha");
		obj.put("id", 123);
		System.out.print(obj);
		
		
		try (FileWriter file = new FileWriter("/home/bridgeit/shraddha/JsonExample.json")) {
			file.write(obj.toJSONString());
			System.out.println();
			System.out.println("Successfully Copied JSON Object to File...");
			System.out.println("\nJSON Object: " + obj);
		}
	}

}
