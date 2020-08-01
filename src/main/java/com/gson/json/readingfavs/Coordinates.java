package com.gson.json.readingfavs;


import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Coordinates implements Serializable
{

@SerializedName("Latitude")
@Expose
private Double latitude;
@SerializedName("Longitude")
@Expose
private Double longitude;
private final static long serialVersionUID = 2580985592798938137L;

public Double getLatitude() {
return latitude;
}

public void setLatitude(Double latitude) {
this.latitude = latitude;
}

public Coordinates withLatitude(Double latitude) {
this.latitude = latitude;
return this;
}

public Double getLongitude() {
return longitude;
}

public void setLongitude(Double longitude) {
this.longitude = longitude;
}

public Coordinates withLongitude(Double longitude) {
this.longitude = longitude;
return this;
}
@Override
public String toString(){
	return getLatitude() + ", " + getLongitude();
}


}
