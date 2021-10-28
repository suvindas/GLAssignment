package com.demo.glassignment.data.model.profile;

import java.util.List;

public class Invites {
    private List<Profiles> profiles;
    private int totalPages;
    private int pending_invitations_count;

    public List<Profiles> getProfiles() {
        return profiles;
    }

    public void setProfiles(List<Profiles> profiles) {
        this.profiles = profiles;
    }

    public int getTotalPages() {
        return totalPages;
    }

    public void setTotalPages(int totalPages) {
        this.totalPages = totalPages;
    }

    public int getPending_invitations_count() {
        return pending_invitations_count;
    }

    public void setPending_invitations_count(int pending_invitations_count) {
        this.pending_invitations_count = pending_invitations_count;
    }


}