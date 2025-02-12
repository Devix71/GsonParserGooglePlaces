package com.gson.json.objects;
import java.io.Serializable;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Photo implements Serializable
{

@SerializedName("height")
@Expose
private Integer height;
@SerializedName("html_attributions")
@Expose
private List<String> htmlAttributions = null;
@SerializedName("photo_reference")
@Expose
private String photoReference;
@SerializedName("width")
@Expose
private Integer width;
private final static long serialVersionUID = 4541031503701978203L;

public Integer getHeight() {
return height;
}

public void setHeight(Integer height) {
this.height = height;
}

public Photo withHeight(Integer height) {
this.height = height;
return this;
}

public List<String> getHtmlAttributions() {
return htmlAttributions;
}

public void setHtmlAttributions(List<String> htmlAttributions) {
this.htmlAttributions = htmlAttributions;
}

public Photo withHtmlAttributions(List<String> htmlAttributions) {
this.htmlAttributions = htmlAttributions;
return this;
}

public String getPhotoReference() {
return photoReference;
}

public void setPhotoReference(String photoReference) {
this.photoReference = photoReference;
}

public Photo withPhotoReference(String photoReference) {
this.photoReference = photoReference;
return this;
}

public Integer getWidth() {
return width;
}

public void setWidth(Integer width) {
this.width = width;
}

public Photo withWidth(Integer width) {
this.width = width;
return this;
}

}
