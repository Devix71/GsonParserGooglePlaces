package com.gson.json.objects;

import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Geometry implements Serializable
{

@SerializedName("location")
@Expose
private Location location;
@SerializedName("viewport")
@Expose
private Viewport viewport;
private final static long serialVersionUID = 1801337877661428015L;

public Location getLocation() {
return location;
}

public void setLocation(Location location) {
this.location = location;
}

public Geometry withLocation(Location location) {
this.location = location;
return this;
}

public Viewport getViewport() {
return viewport;
}

public void setViewport(Viewport viewport) {
this.viewport = viewport;
}

public Geometry withViewport(Viewport viewport) {
this.viewport = viewport;
return this;
}

@Override
public String toString(){
	return getLocation() + "\n" ;
}
}