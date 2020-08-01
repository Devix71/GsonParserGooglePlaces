package com.gson.json.script;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.List;
import java.util.Scanner;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.stream.JsonWriter;
import com.gson.json.objects.Marker;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileOutputStream;
import java.io.FileReader;  

public class Favorites extends GsonScript{

	static int z = 0;
	
	/* ramas de facut :
	 * OPTIMIZAT
	 */
	
	

	public static void main(String[] args)throws IOException {
		
		Scanner a = new Scanner(System.in);
		System.out.println("What coffee shop do you want to add to favourites ? ");
		
		String coffeename = a.nextLine();
		a.close();
		
		BufferedReader br = new BufferedReader(new FileReader("F:/Favourites.txt"));     
		if (br.readLine() == null) {
		     z = 1;
		}
		else {
			 z = 2;
		}
		br.close();
		
		String fileData = new String(Files.readAllBytes(Paths
				.get("Locations.txt")));
		
		Gson gson = new GsonBuilder().setPrettyPrinting().create();
		
		Marker mrk1 = (Marker)gson.fromJson(fileData, Marker.class);
		
		for(int i =0;i< mrk1.getResults().size();i++) {
			
			if(mrk1.getResults().get(i).getName().equals(coffeename)) {
				
				System.out.println(mrk1.getResults().get(i).getName());
				System.out.println(mrk1.getResults().get(i).getVicinity());
				System.out.println(mrk1.getResults().get(i).getGeometry().getLocation().getLat());
				System.out.println(mrk1.getResults().get(i).getGeometry().getLocation().getLng());
			}
		}
		
		FileOutputStream out = new FileOutputStream(new File("F:/Favourites.txt"),true);
		OutputStreamWriter osw = new OutputStreamWriter(out);
		JsonWriter writer = new JsonWriter(osw);
		
		for(int i =0;i< mrk1.getResults().size();i++) {
			if(mrk1.getResults().get(i).getName().equals(coffeename)) {
				
				switch (z) {
				
					case 1:
						
						writer.setIndent("\t");
							writer.beginObject();
								writer.name("favourites").beginArray();
									writer.beginObject();
										writer.name("id").value(mrk1.getResults().get(i).getId());
										writer.name("name").value(mrk1.getResults().get(i).getName());
										writer.name("Address").value(mrk1.getResults().get(i).getVicinity());
										writer.name("Coordinates").beginObject();
											writer.name("Latitude").value(mrk1.getResults().get(i).getGeometry().getLocation().getLat());
											writer.name("Longitude").value(mrk1.getResults().get(i).getGeometry().getLocation().getLng());
										writer.endObject();
									writer.endObject();
								writer.endArray();
							writer.endObject();
						writer.flush();
					writer.close();
			 break;
					case 2:
						
						Path path = Paths.get("F:/Favourites.txt");
						List<String> lines = Files.readAllLines(path, StandardCharsets.UTF_8);
						int position = lines.size()-2;
						int position2 = lines.size()-1;
						int position3 = lines.size();
						int position4 = lines.size()+1;
						int position5 = lines.size()+2;
						int position6 = lines.size()+3;
						int position7 = lines.size()+4;
						int position8 = lines.size()+5;
						int position9 = lines.size()+6;
						int position10 = lines.size()+7;
						String extraLine = "		,";
						String extraLine2 ="		{";
						String extraLine3 ="			"+'"'+"id"+'"'+": "+'"' + mrk1.getResults().get(i).getId() + '"'+",";
						String extraLine4 ="			" +'"'+"name"+'"'+": "+'"'+mrk1.getResults().get(i).getName()+'"'+",";
						String extraLine5 ="			" +'"'+"Address"+'"'+": "+'"'+mrk1.getResults().get(i).getVicinity()+'"'+",";
						String extraLine6 ="			" +'"'+"Coordinates"+'"'+": "+"{";
						String extraLine7 ="				"+'"'+"Latitude"+'"'+": "+mrk1.getResults().get(i).getGeometry().getLocation().getLat()+",";
						String extraLine8 ="				"+'"'+"Longitude"+'"'+": "+mrk1.getResults().get(i).getGeometry().getLocation().getLng();
						String extraLine9 ="			}";
						String extraLine10="		}";
						
						

						lines.add(position, extraLine);
						lines.add(position2, extraLine2);
						lines.add(position3, extraLine3);
						lines.add(position4, extraLine4);
						lines.add(position5, extraLine5);
						lines.add(position6, extraLine6);
						lines.add(position7, extraLine7);
						lines.add(position8, extraLine8);
						lines.add(position9, extraLine9);
						lines.add(position10, extraLine10);
						
						Files.write(path, lines, StandardCharsets.UTF_8);
						/*FileWriter myWriter = new FileWriter("F:/Favourites.txt",true);
						  myWriter.append(",");
							myWriter.close();
								
									writer.setIndent("\t");
								
									writer.beginObject(); //{
										writer.name("id").value(mrk1.getResults().get(i).getId());
										writer.name("name").value(mrk1.getResults().get(i).getName());
										writer.name("Address").value(mrk1.getResults().get(i).getVicinity());
										writer.name("Coordinates").beginObject();
											writer.name("Latitude").value(mrk1.getResults().get(i).getGeometry().getLocation().getLat());
											writer.name("Longitude").value(mrk1.getResults().get(i).getGeometry().getLocation().getLng());
										writer.endObject();
							        writer.endObject();
							    
							   writer.flush();
						writer.close(); */
		   break;
		   
				}
		
			}
		
		}

	}
	
}
