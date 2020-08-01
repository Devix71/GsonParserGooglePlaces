package com.gson.json.script;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.json.objects.Marker;




public class GsonScript {

	public static void main(String[] args) throws IOException {
		
		// Get Gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// read JSON file data as String
		String fileData = new String(Files.readAllBytes(Paths
				.get("Locations.txt")));

		// parse json string to object
		Marker mrk1 = (Marker)gson.fromJson(fileData, Marker.class);
		// print object data
		System.out.println("\n\nCoffee Store\n\n" + mrk1);

	}

}
