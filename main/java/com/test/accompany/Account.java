package com.test.accompany;

/**
 * Created by jeffrey on 2017-03-11.
 */

public class Account {

    private String username;
    private int age;
    private String bio;


    public Account() {

    }

    public Account(String username, int age, String bio) {
        this.setUsername(username);
        this.setAge(age);
        this.setBio(bio);

    }

    // get and set

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getBio() {
        return bio;
    }

    public void setBio(String bio) {
        this.bio = bio;
    }

}