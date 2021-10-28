package com.demo.glassignment.data.model.profile;

import java.util.List;

public class Likes {
    private List<Profiles> profiles;
    private boolean can_see_profile;
    private int likes_received_count;

    public List<Profiles> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profiles> profiles) {
        this.profiles = profiles;
    }

    public boolean isCan_see_profile() {
        return can_see_profile;
    }

    public void setCan_see_profile(boolean can_see_profile) {
        this.can_see_profile = can_see_profile;
    }

    public int getLikes_received_count() {
        return likes_received_count;
    }

    public void setLikes_received_count(int likes_received_count) {
        this.likes_received_count = likes_received_count;
    }


}