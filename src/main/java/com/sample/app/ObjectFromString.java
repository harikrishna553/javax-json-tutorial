package com.sample.app;

import java.io.StringReader;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;

import com.sample.app.model.Employee;

public class ObjectFromString {

	public static void main(String[] args) throws ParseException {
		String jsonString = "{\"firstName\":\"Ram\",\"lastName\":\"Gurram\",\"id\":32,\"dateOfBirth\":\"10/01/1985\"}";
		
		JsonReader reader = Json.createReader(new StringReader(jsonString));
		JsonObject jsonObject = reader.readObject();
		
		int id = jsonObject.getInt("id");
		String firstName = jsonObject.getString("firstName");
		String lastName = jsonObject.getString("lastName");
		
		String birthDate = jsonObject.getString("dateOfBirth");
		DateFormat dateFormat = new SimpleDateFormat("DD/MM/YYYY");
		Date dateOfBirth = dateFormat.parse(birthDate);
		
		Employee emp = new Employee(id, firstName, lastName, dateOfBirth);
		
		System.out.println(emp);
	}
}
