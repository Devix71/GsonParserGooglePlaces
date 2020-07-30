package com.gson.json.objects;
import java.io.Serializable;
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class PlusCode implements Serializable
{

@SerializedName("compound_code")
@Expose
private String compoundCode;
@SerializedName("global_code")
@Expose
private String globalCode;
private final static long serialVersionUID = 5476071757371360914L;

public String getCompoundCode() {
return compoundCode;
}

public void setCompoundCode(String compoundCode) {
this.compoundCode = compoundCode;
}

public PlusCode withCompoundCode(String compoundCode) {
this.compoundCode = compoundCode;
return this;
}

public String getGlobalCode() {
return globalCode;
}

public void setGlobalCode(String globalCode) {
this.globalCode = globalCode;
}

public PlusCode withGlobalCode(String globalCode) {
this.globalCode = globalCode;
return this;
}

}
