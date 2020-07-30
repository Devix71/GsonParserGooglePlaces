package com.gson.json.objects;


import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Location implements Serializable
{

@SerializedName("lat")
@Expose
private Double lat;
@SerializedName("lng")
@Expose
private Double lng;
private final static long serialVersionUID = -4093699792177033341L;

public Double getLat() {
return lat;
}

public void setLat(Double lat) {
this.lat = lat;
}

public Location withLat(Double lat) {
this.lat = lat;
return this;
}

public Double getLng() {
return lng;
}

public void setLng(Double lng) {
this.lng = lng;
}

public Location withLng(Double lng) {
this.lng = lng;
return this;
}

@Override
public String toString(){
	return getLat() + ", " + getLng();
}
}
