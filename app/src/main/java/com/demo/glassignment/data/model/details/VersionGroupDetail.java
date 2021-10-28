
package com.demo.glassignment.data.model.details;

 
import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;


public class VersionGroupDetail {

    @SerializedName("level_learned_at")
    @Expose
    private  int levelLearnedAt;
    @SerializedName("move_learn_method")
    @Expose
    private MoveLearnMethod moveLearnMethod;
    @SerializedName("version_group")
    @Expose
    private VersionGroup versionGroup;

    public  int getLevelLearnedAt() {
        return levelLearnedAt;
    }

    public void setLevelLearnedAt( int levelLearnedAt) {
        this.levelLearnedAt = levelLearnedAt;
    }

    public MoveLearnMethod getMoveLearnMethod() {
        return moveLearnMethod;
    }

    public void setMoveLearnMethod(MoveLearnMethod moveLearnMethod) {
        this.moveLearnMethod = moveLearnMethod;
    }

    public VersionGroup getVersionGroup() {
        return versionGroup;
    }

    public void setVersionGroup(VersionGroup versionGroup) {
        this.versionGroup = versionGroup;
    }

}
