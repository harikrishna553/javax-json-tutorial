package com.sample.app;

import java.util.ArrayList;
import java.util.List;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;
import javax.json.JsonString;

public class JsonArrayToListDemo {
	public static void main(String[] args) {
		JsonArrayBuilder empNamesArrayBuilder = Json.createArrayBuilder();

		empNamesArrayBuilder.add("Ram");
		empNamesArrayBuilder.add("Rahim");
		empNamesArrayBuilder.add("Joel");
		empNamesArrayBuilder.add("PTR");

		JsonArray empNamesJsonArr = empNamesArrayBuilder.build();

		String json = empNamesJsonArr.toString();

		System.out.println(json);

		List<String> empNames = new ArrayList<>();

		List<JsonString> jsonStrings = empNamesJsonArr.getValuesAs(JsonString.class);

		for (JsonString j : jsonStrings) {
			empNames.add(j.getString());
		}

		empNames.stream().forEach(System.out::println);

	}
}
