package com.gson.json.script;

import java.io.IOException;



import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.json.objects.Geometry;
import com.gson.json.objects.Location;
import com.gson.json.objects.Marker;
import com.gson.json.objects.Result;




public class EmployeeGsonExample {

	public static void main(String[] args) throws IOException {
		Marker mrk = createMarker();

		// Get Gson object
		Gson gson = new GsonBuilder().setPrettyPrinting().create();

		// read JSON file data as String
		String fileData = new String(Files.readAllBytes(Paths
				.get("F:/gson-example/Locations.txt")));

		// parse json string to object
		Marker mrk1 = (Marker)gson.fromJson(fileData, Marker.class);
		// print object data
		System.out.println("\n\nEmployee Object\n\n" + mrk1);

		// create JSON String from Object
		String jsonEmp = gson.toJson(mrk);
		System.out.print(jsonEmp);

	}

	public static Marker createMarker() {

		Marker mrk = new Marker();
		
		Result res = new Result();
		
		
		
		 res.setName("David");
		 res.setVicinity("Alea mantuleasa 69");
		 Geometry add = new Geometry();
		 Location loc = new Location();
		 loc.setLat(25.23);
		 loc.setLng(11.45);
		 add.setLocation(loc);
		 res.setGeometry(add);
		 List<Result> ceva = new ArrayList<Result>();
		 mrk.setResults(ceva);
	

		return mrk;
	}
}
