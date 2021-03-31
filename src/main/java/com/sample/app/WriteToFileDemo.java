package com.sample.app;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;
import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.json.JsonWriter;

public class WriteToFileDemo {
	public static void main(String[] args) throws IOException {
		final String JSON_STRING = "{\n" + 
				"    \"firstName\": \"Ram\",\n" + 
				"    \"lastName\": \"Gurram\",\n" + 
				"    \"id\": 32,\n" + 
				"    \"male\": false,\n" + 
				"    \"dateOfBirth\": \"10/01/1985\"\n" + 
				"}\n";
		
		final String FILE_TO_WRITE = "/Users/Shared/json/emp.json";
		
		try (JsonReader reader = Json.createReader(new StringReader(JSON_STRING));
				OutputStream os = new FileOutputStream(FILE_TO_WRITE);
				JsonWriter jsonWriter = Json.createWriter(os);) {
			
			JsonObject jsonObject = reader.readObject();

			jsonWriter.writeObject(jsonObject);
		}

	}

}
