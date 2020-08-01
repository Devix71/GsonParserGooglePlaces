package com.gson.json.script;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.gson.json.readingfavs.Items;
import com.gson.json.readingfavs.readingfavs;

public class FavoritesSearch extends readingfavs {
	public static void main(String[] args)throws IOException {
		Scanner a = new Scanner(System.in);
		System.out.println("What coffee shop are you looking for ?");
		
		String coffeename = a.nextLine();
		a.close();
		
		String fileData = new String(Files.readAllBytes(Paths
			.get("F:/Favourites.txt")));
	
	Gson gson = new GsonBuilder().setPrettyPrinting().create();
	
	Items itm1 = (Items)gson.fromJson(fileData, Items.class);
	
	for(int i =0;i< itm1.getFavourites().size();i++) {		
		if(itm1.getFavourites().get(i).getName().equals(coffeename)) {
			
			System.out.println(itm1.getFavourites().get(i).getName());
			System.out.println(itm1.getFavourites().get(i).getAddress());
			System.out.println(itm1.getFavourites().get(i).getCoordinates().getLatitude());
			System.out.println(itm1.getFavourites().get(i).getCoordinates().getLongitude());
					}
				}
			}	
	
		}
