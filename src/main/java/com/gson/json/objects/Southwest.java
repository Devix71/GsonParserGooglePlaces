package com.gson.json.objects;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Southwest implements Serializable
{

@SerializedName("lat")
@Expose
private Double lat;
@SerializedName("lng")
@Expose
private Double lng;
private final static long serialVersionUID = 5093147893536857181L;

public Double getLat() {
return lat;
}

public void setLat(Double lat) {
this.lat = lat;
}

public Southwest withLat(Double lat) {
this.lat = lat;
return this;
}

public Double getLng() {
return lng;
}

public void setLng(Double lng) {
this.lng = lng;
}

public Southwest withLng(Double lng) {
this.lng = lng;
return this;
}

}
