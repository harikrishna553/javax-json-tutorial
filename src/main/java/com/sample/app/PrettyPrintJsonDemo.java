package com.sample.app;

import java.io.IOException;
import java.io.StringWriter;
import java.io.Writer;
import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonWriterFactory;
import javax.json.stream.JsonGenerator;

public class PrettyPrintJsonDemo {
	
	private static String getPrettyJson(JsonObject jsonObject) throws IOException {
		Map<String, Boolean> config = new HashMap<>();

		config.put(JsonGenerator.PRETTY_PRINTING, true);
		        
		JsonWriterFactory writerFactory = Json.createWriterFactory(config);
		
		try(Writer writer = new StringWriter()) {
		    writerFactory.createWriter(writer).write(jsonObject);
		    return writer.toString();
		}
		        
	}
	public static void main(String args[]) throws IOException {
		LocalDate dateOfBirth = LocalDate.of(1985, 1, 10);
		Date date = Date.from(dateOfBirth.atStartOfDay(ZoneId.systemDefault()).toInstant());

		JsonObject jsonObject = Json.createObjectBuilder()
							.add("firstName", "Ram")
							.add("lastName", "Gurram")
							.add("id", 32)
							.add("male", false)
							.add("dateOfBirth", new SimpleDateFormat("DD/MM/YYYY").format(date)).build();
		
		String result = getPrettyJson(jsonObject);

		System.out.println(result);
	}
}
