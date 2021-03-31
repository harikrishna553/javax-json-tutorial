package com.sample.app;

import java.io.IOException;
import java.io.InputStream;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class ReadFromFileDemo {
	public static final String JSON_FILE = "employee.json";

	public static void main(String[] args) throws IOException {

		try (InputStream fis = ReadFromFileDemo.class.getClassLoader().getResourceAsStream(JSON_FILE);
				JsonReader jsonReader = Json.createReader(fis)) {

			JsonObject jsonObject = jsonReader.readObject();

			String result = jsonObject.toString();
			System.out.println(result);

		}

	}
}
