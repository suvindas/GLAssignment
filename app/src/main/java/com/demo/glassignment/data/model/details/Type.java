
package com.demo.glassignment.data.model.details;

 
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class Type {

    @SerializedName("slot")
    @Expose
    private  int slot;
    @SerializedName("type")
    @Expose
    private Type__1 type;

    public  int getSlot() {
        return slot;
    }

    public void setSlot( int slot) {
        this.slot = slot;
    }

    public Type__1 getType() {
        return type;
    }

    public void setType(Type__1 type) {
        this.type = type;
    }

}
