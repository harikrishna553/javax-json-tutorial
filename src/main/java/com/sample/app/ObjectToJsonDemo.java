package com.sample.app;

import java.text.SimpleDateFormat;
import java.time.LocalDate;
import java.time.ZoneId;
import java.util.Date;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonObjectBuilder;

import com.sample.app.model.Employee;

public class ObjectToJsonDemo {
	private static String getJson(Employee emp) {
		if (emp == null) {
			return "";
		}

		JsonObjectBuilder objectBuilder = Json.createObjectBuilder()
				.add("firstName", emp.getFirstName())
				.add("lastName", emp.getLastName())
				.add("id", emp.getId())
				.add("birthdate", new SimpleDateFormat("DD/MM/YYYY").format(emp.getDateOfBirth()));

		JsonObject jsonObject = objectBuilder.build();

		return jsonObject.toString();
	}

	public static void main(String args[]) {
		LocalDate dateOfBirth = LocalDate.of(1985, 1, 10);
		Date date = Date.from(dateOfBirth.atStartOfDay(ZoneId.systemDefault()).toInstant());

		Employee emp1 = new Employee(32, "Ram", "Gurram", date);

		System.out.println(getJson(emp1));
	}

}

