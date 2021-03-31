package com.sample.app;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonArrayBuilder;

public class JsonArrayBuilderDemo {
	public static void main(String[] args) {
		JsonArrayBuilder empNamesArrayBuilder = Json.createArrayBuilder();
		
		empNamesArrayBuilder.add("Ram");
		empNamesArrayBuilder.add("Rahim");
		empNamesArrayBuilder.add("Joel");
		empNamesArrayBuilder.add("PTR");
		
		JsonArray empNamesArr = empNamesArrayBuilder.build();
		
		String json = empNamesArr.toString();
		
		System.out.println(json);
		
	}

}
