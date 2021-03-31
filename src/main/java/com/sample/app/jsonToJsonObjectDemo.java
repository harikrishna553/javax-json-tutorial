package com.sample.app;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class jsonToJsonObjectDemo {
	
	public static void main(String[] args) {
		String jsonString = "\n" + 
				"{\n" + 
				"    \"firstName\": \"Ram\",\n" + 
				"    \"lastName\": \"Gurram\",\n" + 
				"    \"id\": 32,\n" + 
				"    \"male\": false,\n" + 
				"    \"dateOfBirth\": \"10/01/1985\"\n" + 
				"}\n" + 
				"";
		
		JsonReader reader = Json.createReader(new StringReader(jsonString));
		
		JsonObject jsonObject = reader.readObject();
		
		System.out.println("firstName : " + jsonObject.getString("firstName"));
		System.out.println("lastName : " + jsonObject.getString("lastName"));
		System.out.println("id : " + jsonObject.getInt("id"));
		System.out.println("male : " + jsonObject.getBoolean("male"));
		System.out.println("dateOfBirth : " + jsonObject.getString("dateOfBirth"));
	}

}
