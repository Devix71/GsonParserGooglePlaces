package com.gson.json.objects;


import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Result implements Serializable
{

@SerializedName("business_status")
@Expose
private String businessStatus;
@SerializedName("geometry")
@Expose
private Geometry geometry;
@SerializedName("icon")
@Expose
private String icon;
@SerializedName("id")
@Expose
private String id;
@SerializedName("name")
@Expose
private String name;
@SerializedName("opening_hours")
@Expose
private OpeningHours openingHours;
@SerializedName("photos")
@Expose
private List<Photo> photos = null;
@SerializedName("place_id")
@Expose
private String placeId;
@SerializedName("plus_code")
@Expose
private PlusCode plusCode;
@SerializedName("price_level")
@Expose
private Integer priceLevel;
@SerializedName("rating")
@Expose
private Double rating;
@SerializedName("reference")
@Expose
private String reference;
@SerializedName("scope")
@Expose
private String scope;
@SerializedName("types")
@Expose
private List<String> types = null;
@SerializedName("user_ratings_total")
@Expose
private Integer userRatingsTotal;
@SerializedName("vicinity")
@Expose
private String vicinity;
private final static long serialVersionUID = 8081676768038590145L;

public String getBusinessStatus() {
return businessStatus;
}

public void setBusinessStatus(String businessStatus) {
this.businessStatus = businessStatus;
}

public Result withBusinessStatus(String businessStatus) {
this.businessStatus = businessStatus;
return this;
}

public Geometry getGeometry() {
return geometry;
}

public void setGeometry(Geometry geometry) {
this.geometry = geometry;
}

public Result withGeometry(Geometry geometry) {
this.geometry = geometry;
return this;
}

public String getIcon() {
return icon;
}

public void setIcon(String icon) {
this.icon = icon;
}

public Result withIcon(String icon) {
this.icon = icon;
return this;
}

public String getId() {
return id;
}

public void setId(String id) {
this.id = id;
}

public Result withId(String id) {
this.id = id;
return this;
}

public String getName() {
return name;
}

public void setName(String name) {
this.name = name;
}

public Result withName(String name) {
this.name = name;
return this;
}

public OpeningHours getOpeningHours() {
return openingHours;
}

public void setOpeningHours(OpeningHours openingHours) {
this.openingHours = openingHours;
}

public Result withOpeningHours(OpeningHours openingHours) {
this.openingHours = openingHours;
return this;
}

public List<Photo> getPhotos() {
return photos;
}

public void setPhotos(List<Photo> photos) {
this.photos = photos;
}

public Result withPhotos(List<Photo> photos) {
this.photos = photos;
return this;
}

public String getPlaceId() {
return placeId;
}

public void setPlaceId(String placeId) {
this.placeId = placeId;
}

public Result withPlaceId(String placeId) {
this.placeId = placeId;
return this;
}

public PlusCode getPlusCode() {
return plusCode;
}

public void setPlusCode(PlusCode plusCode) {
this.plusCode = plusCode;
}

public Result withPlusCode(PlusCode plusCode) {
this.plusCode = plusCode;
return this;
}

public Integer getPriceLevel() {
return priceLevel;
}

public void setPriceLevel(Integer priceLevel) {
this.priceLevel = priceLevel;
}

public Result withPriceLevel(Integer priceLevel) {
this.priceLevel = priceLevel;
return this;
}

public Double getRating() {
return rating;
}

public void setRating(Double rating) {
this.rating = rating;
}

public Result withRating(Double rating) {
this.rating = rating;
return this;
}

public String getReference() {
return reference;
}

public void setReference(String reference) {
this.reference = reference;
}

public Result withReference(String reference) {
this.reference = reference;
return this;
}

public String getScope() {
return scope;
}

public void setScope(String scope) {
this.scope = scope;
}

public Result withScope(String scope) {
this.scope = scope;
return this;
}

public List<String> getTypes() {
return types;
}

public void setTypes(List<String> types) {
this.types = types;
}

public Result withTypes(List<String> types) {
this.types = types;
return this;
}

public Integer getUserRatingsTotal() {
return userRatingsTotal;
}

public void setUserRatingsTotal(Integer userRatingsTotal) {
this.userRatingsTotal = userRatingsTotal;
}

public Result withUserRatingsTotal(Integer userRatingsTotal) {
this.userRatingsTotal = userRatingsTotal;
return this;
}

public String getVicinity() {
return vicinity;
}

public void setVicinity(String vicinity) {
this.vicinity = vicinity;
}

public Result withVicinity(String vicinity) {
this.vicinity = vicinity;
return this;
}


@Override
public String toString(){
	StringBuilder sb = new StringBuilder();
	sb.append("***** Store details *****\n");
	sb.append("Name "+getName()+"\n");
	sb.append("Adress "+getVicinity()+"\n");
	sb.append("Coordinates " +getGeometry() + "\n");
	sb.append("*****************************\n");
	return sb.toString();
}



}
