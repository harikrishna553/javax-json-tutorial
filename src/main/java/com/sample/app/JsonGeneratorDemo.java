package com.sample.app;

import java.io.ByteArrayOutputStream;
import java.io.IOException;

import javax.json.Json;
import javax.json.stream.JsonGenerator;

public class JsonGeneratorDemo {
	public static void main(String args[]) throws IOException {
		try (ByteArrayOutputStream bos = new ByteArrayOutputStream()) {

			try (JsonGenerator jsonGenerator = Json.createGenerator(bos);) {

				jsonGenerator.writeStartObject();

				jsonGenerator.write("id", 123);
				jsonGenerator.write("name", "Krishna");

				// Write nested json document
				jsonGenerator.writeStartObject("address").write("street", "Chodeswari").write("city", "Bangalore")
						.writeEnd();

				// Write array content
				jsonGenerator.writeStartArray("hobbies");
				jsonGenerator.write("Cricket");
				jsonGenerator.write("Chess");
				jsonGenerator.writeEnd();

				jsonGenerator.writeEnd();

			}

			String finalString = new String(bos.toByteArray());

			System.out.println(finalString);

		}

	}

}
