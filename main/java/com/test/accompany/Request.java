package com.test.accompany;

import com.google.android.gms.maps.GoogleMap;

import java.io.Serializable;

/**
 * Created by jeffrey on 2017-03-11.
 */

public class Request implements Serializable {

    private String username;
    private String reciever;
    private int age;
    private String title;
    private GoogleMap location;
    private Boolean recieverAccept;
    private Boolean originalReqAccept;

    public Request() {

    }

    public Request(String username, String reciever, int age, GoogleMap location, String title,
                   Boolean recieverAccept, Boolean originalReqAccept) {
        this.setUsername(username);
        this.setReciever(reciever);
        this.setAge(age);
        this.setLocation(location);
        this.setTitle(title);
        this.setRecieverAccept(recieverAccept);
        this.setOriginalReqAccept(originalReqAccept);
    }


    // get and set
    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getReciever() {
        return reciever;
    }

    public void setReciever(String reciever) {
        this.reciever = reciever;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public GoogleMap getLocation() {
        return location;
    }

    public void setLocation(GoogleMap location) {
        this.location = location;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public Boolean getRecieverAccept() {
        return recieverAccept;
    }

    public void setRecieverAccept(Boolean recieverAccept) {
        this.recieverAccept = recieverAccept;
    }

    public Boolean getOriginalReqAccept() {
        return originalReqAccept;
    }

    public void setOriginalReqAccept(Boolean originalReqAccept) {
        this.originalReqAccept = originalReqAccept;
    }


}
