package com.shaizankhan.springsecurityjwt.model;

import java.io.Serializable;

/**
 * @author Shaizan.Khan
 * created on 16-02-2020
 */
public class AuthenticationRequest implements Serializable {

    private String username;
    private String password;

    //need default constructor for JSON Parsing
    public AuthenticationRequest() {
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public AuthenticationRequest(String username, String password) {
        this.setUsername(username);
        this.setPassword(password);
    }
}