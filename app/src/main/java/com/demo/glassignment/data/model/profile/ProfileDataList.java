package com.demo.glassignment.data.model.profile;

import java.util.List;

public class ProfileDataList {
    private String question;
    private List<Preferences> preferences;
    private String invitation_type;

    public String getQuestion() {
        return question;
    }

    public void setQuestion(String question) {
        this.question = question;
    }

    public List<Preferences> getPreferences() {
        return preferences;
    }

    public void setPreferences(List<Preferences> preferences) {
        this.preferences = preferences;
    }

    public String getInvitation_type() {
        return invitation_type;
    }

    public void setInvitation_type(String invitation_type) {
        this.invitation_type = invitation_type;
    }


}