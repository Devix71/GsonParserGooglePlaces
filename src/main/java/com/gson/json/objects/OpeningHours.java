package com.gson.json.objects;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class OpeningHours implements Serializable
{

@SerializedName("open_now")
@Expose
private Boolean openNow;
private final static long serialVersionUID = 1405112706365390687L;

public Boolean getOpenNow() {
return openNow;
}

public void setOpenNow(Boolean openNow) {
this.openNow = openNow;
}

public OpeningHours withOpenNow(Boolean openNow) {
this.openNow = openNow;
return this;
}

}
