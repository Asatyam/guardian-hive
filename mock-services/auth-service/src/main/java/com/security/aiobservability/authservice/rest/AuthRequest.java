package com.security.aiobservability.authservice.rest;

public class AuthRequest {

    private String username;
    private String password;

    public AuthRequest(String password, String username) {
        this.password = password;
        this.username = username;
    }
    public String getUsername() {
        return username;
    }
    public String getPassword() {
        return password;
    }
    public void setPassword(String password) {
        this.password = password;
    }
    public void setUsername(String username) {
        this.username = username;
    }
}
