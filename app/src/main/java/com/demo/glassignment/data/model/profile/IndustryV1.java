package com.demo.glassignment.data.model.profile;

public class IndustryV1 {
    private int id;
    private String name;
    private boolean preference_only;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public boolean isPreference_only() {
        return preference_only;
    }

    public void setPreference_only(boolean preference_only) {
        this.preference_only = preference_only;
    }
}