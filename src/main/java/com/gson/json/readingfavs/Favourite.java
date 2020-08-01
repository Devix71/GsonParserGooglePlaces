package com.gson.json.readingfavs;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Favourite implements Serializable
{

@SerializedName("id")
@Expose
private String id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("Address")
@Expose
private String address;
@SerializedName("Coordinates")
@Expose
private Coordinates coordinates;
private final static long serialVersionUID = 4762183784767825311L;

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public Favourite withId(String id) {
this.id = id;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Favourite withName(String name) {
this.name = name;
return this;
}

public String getAddress() {
return address;
}

public void setAddress(String address) {
this.address = address;
}

public Favourite withAddress(String address) {
this.address = address;
return this;
}

public Coordinates getCoordinates() {
return coordinates;
}

public void setCoordinates(Coordinates coordinates) {
this.coordinates = coordinates;
}

public Favourite withCoordinates(Coordinates coordinates) {
this.coordinates = coordinates;
return this;
}
@Override
public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("***** Store details *****\n");
	sb.append("Name "+getName()+"\n");
	sb.append("Adress "+getAddress()+"\n");
	sb.append("Coordinates " +getCoordinates() + "\n");
	sb.append("*****************************\n");
	return sb.toString();
}

}
