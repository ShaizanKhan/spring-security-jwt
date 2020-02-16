package com.shaizankhan.springsecurityjwt.model;

import java.io.Serializable;

/**
 * @author Shaizan.Khan
 * created on 16-02-2020
 */
public class AuthenticationResponse implements Serializable {

    private final String jwt;

    public AuthenticationResponse(String jwt) {
        this.jwt = jwt;
    }

    public String getJwt() {
        return jwt;
    }
}