package com.sample.app;

import java.io.StringReader;
import java.math.BigDecimal;

import javax.json.Json;
import javax.json.stream.JsonParser;
import javax.json.stream.JsonParser.Event;

/**
 * { "emps": [{ "id": 1, "name": "Ram" }, { "id": 2, "name": "Krishna" }],
 * "totalCount": 2 }
 *
 */
public class JsonParserDemo {

	public static void main(String[] args) {

		String jsonString = "{\n" + "  \"id\": 1,\n" + "  \"firstName\": \"Ram\",\n" + "  \"lastName\": \"Gurram\"\n"
				+ "}";

		JsonParser parser = Json.createParser(new StringReader(jsonString));
		String key = null;
		while (parser.hasNext()) {
			final Event event = parser.next();
			switch (event) {
			case KEY_NAME:
				key = parser.getString();
				System.out.print(key);
				break;
			case VALUE_STRING:
				String string = parser.getString();
				System.out.println(" -> " + string);
				break;
			case VALUE_NUMBER:
				BigDecimal number = parser.getBigDecimal();
				System.out.println(" -> " + number);
				break;
			case VALUE_TRUE:
				System.out.print(true);
				break;
			case VALUE_FALSE:
				System.out.print(false);
				break;
			case START_ARRAY:
				System.out.println("[");
				break;
			case END_ARRAY:
				System.out.println("]");
				break;
			case START_OBJECT:
				break;
			case VALUE_NULL:
				System.out.print("null");
				break;
			case END_OBJECT:
				System.out.println();
				break;
			default:
				break;
			}
		}
		parser.close();
	}

}
