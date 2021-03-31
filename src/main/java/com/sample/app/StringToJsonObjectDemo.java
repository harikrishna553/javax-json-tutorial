package com.sample.app;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

public class StringToJsonObjectDemo {
	public static void main(String[] args) {
		String jsonStr = "{\"firstName\":\"Ram\",\"lastName\":\"Gurram\",\"id\":32,\"male\":false,\"dateOfBirth\":\"10/01/1985\"}\n";

		JsonReader jsonReader = Json.createReader(new StringReader(jsonStr));

		JsonObject jsonObject = jsonReader.readObject();
		System.out.println(jsonObject);
	}
}
