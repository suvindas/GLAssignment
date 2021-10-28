
package com.demo.glassignment.data.model.details;

 
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VersionDetail {

    @SerializedName("rarity")
    @Expose
    private  int rarity;
    @SerializedName("version")
    @Expose
    private Version__1 version;

    public  int getRarity() {
        return rarity;
    }

    public void setRarity( int rarity) {
        this.rarity = rarity;
    }

    public Version__1 getVersion() {
        return version;
    }

    public void setVersion(Version__1 version) {
        this.version = version;
    }

}
