package com.demo.glassignment.data.model.profile;

public class GeneralInformation {
    private String date_of_birth;
    private String date_of_birth_v1;
    private Location location;
    private String drinking;
    private DrinkingV1 drinking_v1;
    private String first_name;
    private String gender;
    private String marital_status;
    private MaritalStatusV1 marital_status_v1;
    private String ref_id;
    private String smoking;
    private SmokingV1 smoking_v1;
    private String sun_sign;
    private SunSignV1 sun_sign_v1;
    private MotherTongue mother_tongue;
    private Faith faith;
    private int height;
    private Object cast;
    private Object kid;
    private Object diet;
    private Object politics;
    private Object pet;
    private Object settle;
    private int age;

    public String getDate_of_birth() {
        return date_of_birth;
    }

    public void setDate_of_birth(String date_of_birth) {
        this.date_of_birth = date_of_birth;
    }

    public String getDate_of_birth_v1() {
        return date_of_birth_v1;
    }

    public void setDate_of_birth_v1(String date_of_birth_v1) {
        this.date_of_birth_v1 = date_of_birth_v1;
    }

    public Location getLocation() {
        return location;
    }

    public void setLocation(Location location) {
        this.location = location;
    }

    public String getDrinking() {
        return drinking;
    }

    public void setDrinking(String drinking) {
        this.drinking = drinking;
    }

    public DrinkingV1 getDrinking_v1() {
        return drinking_v1;
    }

    public void setDrinking_v1(DrinkingV1 drinking_v1) {
        this.drinking_v1 = drinking_v1;
    }

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getMarital_status() {
        return marital_status;
    }

    public void setMarital_status(String marital_status) {
        this.marital_status = marital_status;
    }

    public MaritalStatusV1 getMarital_status_v1() {
        return marital_status_v1;
    }

    public void setMarital_status_v1(MaritalStatusV1 marital_status_v1) {
        this.marital_status_v1 = marital_status_v1;
    }

    public String getRef_id() {
        return ref_id;
    }

    public void setRef_id(String ref_id) {
        this.ref_id = ref_id;
    }

    public String getSmoking() {
        return smoking;
    }

    public void setSmoking(String smoking) {
        this.smoking = smoking;
    }

    public SmokingV1 getSmoking_v1() {
        return smoking_v1;
    }

    public void setSmoking_v1(SmokingV1 smoking_v1) {
        this.smoking_v1 = smoking_v1;
    }

    public String getSun_sign() {
        return sun_sign;
    }

    public void setSun_sign(String sun_sign) {
        this.sun_sign = sun_sign;
    }

    public SunSignV1 getSun_sign_v1() {
        return sun_sign_v1;
    }

    public void setSun_sign_v1(SunSignV1 sun_sign_v1) {
        this.sun_sign_v1 = sun_sign_v1;
    }

    public MotherTongue getMother_tongue() {
        return mother_tongue;
    }

    public void setMother_tongue(MotherTongue mother_tongue) {
        this.mother_tongue = mother_tongue;
    }

    public Faith getFaith() {
        return faith;
    }

    public void setFaith(Faith faith) {
        this.faith = faith;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    public Object getCast() {
        return cast;
    }

    public void setCast(Object cast) {
        this.cast = cast;
    }

    public Object getKid() {
        return kid;
    }

    public void setKid(Object kid) {
        this.kid = kid;
    }

    public Object getDiet() {
        return diet;
    }

    public void setDiet(Object diet) {
        this.diet = diet;
    }

    public Object getPolitics() {
        return politics;
    }

    public void setPolitics(Object politics) {
        this.politics = politics;
    }

    public Object getPet() {
        return pet;
    }

    public void setPet(Object pet) {
        this.pet = pet;
    }

    public Object getSettle() {
        return settle;
    }

    public void setSettle(Object settle) {
        this.settle = settle;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public static class Location {
        private String summary;
        private String full;

        public String getSummary() {
            return summary;
        }

        public void setSummary(String summary) {
            this.summary = summary;
        }

        public String getFull() {
            return full;
        }

        public void setFull(String full) {
            this.full = full;
        }
    }

    public static class DrinkingV1 {
        private int id;
        private String name;
        private String name_alias;

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

        public String getName_alias() {
            return name_alias;
        }

        public void setName_alias(String name_alias) {
            this.name_alias = name_alias;
        }
    }

    public static class MaritalStatusV1 {
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

    public static class SmokingV1 {
        private int id;
        private String name;
        private String name_alias;

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

        public String getName_alias() {
            return name_alias;
        }

        public void setName_alias(String name_alias) {
            this.name_alias = name_alias;
        }
    }

    public static class SunSignV1 {
        private int id;
        private String name;

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
    }

    public static class MotherTongue {
        private int id;
        private String name;

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
    }

    public static class Faith {
        private int id;
        private String name;

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
    }
}