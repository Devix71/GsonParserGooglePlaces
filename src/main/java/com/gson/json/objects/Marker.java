package com.gson.json.objects;

import java.io.Serializable;
import java.util.Arrays;
import java.util.List;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class Marker implements Serializable
{

@SerializedName("html_attributions")
@Expose
private List<Object> htmlAttributions = null;
@SerializedName("results")
@Expose
private List<Result> results = null;
@SerializedName("status")
@Expose
private String status;
private final static long serialVersionUID = -7844411886514455844L;

public List<Object> getHtmlAttributions() {
return htmlAttributions;
}

public void setHtmlAttributions(List<Object> htmlAttributions) {
this.htmlAttributions = htmlAttributions;
}

public Marker withHtmlAttributions(List<Object> htmlAttributions) {
this.htmlAttributions = htmlAttributions;
return this;
}

public List<Result> getResults() {
return results;
}

public void setResults(List<Result> results) {
this.results = results;
}

public Marker withResults(List<Result> results) {
this.results = results;
return this;
}

public String getStatus() {
return status;
}

public void setStatus(String status) {
this.status = status;
}

public Marker withStatus(String status) {
this.status = status;
return this;
}

@Override
public String toString(){
	return  ""+ Arrays.toString(getResults().toArray());
}

}
