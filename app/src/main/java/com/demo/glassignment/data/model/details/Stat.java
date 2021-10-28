
package com.demo.glassignment.data.model.details;

 
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Stat {

    @SerializedName("base_stat")
    @Expose
    private  int baseStat;
    @SerializedName("effort")
    @Expose
    private  int effort;
    @SerializedName("stat")
    @Expose
    private Stat__1 stat;

    public  int getBaseStat() {
        return baseStat;
    }

    public void setBaseStat( int baseStat) {
        this.baseStat = baseStat;
    }

    public  int getEffort() {
        return effort;
    }

    public void setEffort( int effort) {
        this.effort = effort;
    }

    public Stat__1 getStat() {
        return stat;
    }

    public void setStat(Stat__1 stat) {
        this.stat = stat;
    }

}
