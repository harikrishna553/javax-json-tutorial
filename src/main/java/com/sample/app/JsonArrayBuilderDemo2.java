package com.sample.app;

import javax.json.Json;
import javax.json.JsonArray;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

/**
 * {
	"emps": [{
		"id": 1,
		"name": "Ram"
	}, {
		"id": 2,
		"name": "Krishna"
	}],
	"totalCount": 2
}
 *
 */
public class JsonArrayBuilderDemo2 {
	public static void main(String[] args) {
		JsonObjectBuilder emp1JsonBuilder = Json.createObjectBuilder();
		emp1JsonBuilder.add("id",1).add("name", "Ram");
		
		JsonObjectBuilder emp2JsonBuilder = Json.createObjectBuilder();
		emp2JsonBuilder.add("id",2).add("name", "Krishna");
		
		JsonArray emps = Json.createArrayBuilder().add(emp1JsonBuilder).add(emp2JsonBuilder).build();
		
		JsonObjectBuilder finalObjBuilder = Json.createObjectBuilder();
		finalObjBuilder.add("emps", emps);
		finalObjBuilder.add("totalCount", 2);
		
		JsonObject finalObj = finalObjBuilder.build();
		String resultJson = finalObj.toString();
		
		System.out.println(resultJson);
		
	}

}
