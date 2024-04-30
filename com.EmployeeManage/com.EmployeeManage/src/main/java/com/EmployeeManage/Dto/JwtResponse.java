package com.EmployeeManage.Dto;

import com.fasterxml.jackson.databind.annotation.JsonPOJOBuilder;
import org.springframework.stereotype.Component;

@Component
@JsonPOJOBuilder
public class JwtResponse {
    private String token;
    private String username;

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public JwtResponse() {
    }

    public JwtResponse(String token, String username) {
        this.token = token;
        this.username = username;
    }

    @Override
    public String toString() {
        return "JwtResponse{" +
                "token='" + token + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
