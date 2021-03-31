package com.sample.app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.json.Json;
import javax.json.JsonObject;

public class JsonCreateDemo {

	public static void main(String args[]) {
		LocalDate dateOfBirth = LocalDate.of(1985, 1, 10);
		Date date = Date.from(dateOfBirth.atStartOfDay(ZoneId.systemDefault()).toInstant());

		JsonObject json = Json.createObjectBuilder()
							.add("firstName", "Ram")
							.add("lastName", "Gurram")
							.add("id", 32)
							.add("male", false)
							.add("dateOfBirth", new SimpleDateFormat("DD/MM/YYYY").format(date)).build();
		
		String result = json.toString();

		System.out.println(result);
	}

}

