package com.sample.app;

import java.io.StringReader;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

/**
 * 
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
 *
 */
public class JsonQueryDemo {
	public static void main(String[] args) {
		String jsonStr  = "{\n" + 
				"	\"emps\": [{\n" + 
				"		\"id\": 1,\n" + 
				"		\"name\": \"Ram\"\n" + 
				"	}, {\n" + 
				"		\"id\": 2,\n" + 
				"		\"name\": \"Krishna\"\n" + 
				"	}],\n" + 
				"	\"totalCount\": 2\n" + 
				"}";
		
		JsonReader reader = Json.createReader(new StringReader(jsonStr));

		JsonObject jsonObject = reader.readObject();
		
		int employeeid = jsonObject.getJsonArray("emps").getJsonObject(0).getInt("id");
		String employeeName = jsonObject.getJsonArray("emps").getJsonObject(1).getString("name");
		
		System.out.println("id : " + employeeid);
		System.out.println("name : " + employeeName);
	}

}
