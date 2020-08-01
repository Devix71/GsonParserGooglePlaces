package com.gson.json.readingfavs;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class readingfavs {

	public static void main(String[] args)throws IOException {


		// Get Gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// read JSON file data as String
		String fileData = new String(Files.readAllBytes(Paths
				.get("F:/Favourites.txt")));

		// parse json string to object
		Items itm1 = (Items)gson.fromJson(fileData, Items.class);
		// print object data
		System.out.println("\n\nCoffee Store\n\n" + itm1);
		


	}

	
}


