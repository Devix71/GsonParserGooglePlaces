package com.gson.json.readingfavs;


import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Items implements Serializable
{

@SerializedName("favourites")
@Expose
private List<Favourite> favourites = null;
private final static long serialVersionUID = -7633588527892319727L;

public List<Favourite> getFavourites() {
return favourites;
}

public void setFavourites(List<Favourite> favourites) {
this.favourites = favourites;
}

public Items withFavourites(List<Favourite> favourites) {
this.favourites = favourites;
return this;
}
@Override
public String toString(){
	return  ""+ Arrays.toString(getFavourites().toArray());
}


}
