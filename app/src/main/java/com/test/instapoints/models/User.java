package com.test.instapoints.models;

/**
 * Created by eder on 26/07/2016.
 */
public class User {
    private String name;
    private String email;
    private String avatarUrl;

    public User(){}

    public User(String name, String email, String avatarUrl){
        this.name = name;
        this.email = email;
        this.avatarUrl = avatarUrl;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUri) {
        this.avatarUrl = avatarUri;
    }
}
