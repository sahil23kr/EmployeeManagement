package com.EmployeeManage.Dto;

import org.springframework.stereotype.Component;

@Component
public class JwtRequest {
    private String email;
    private String password;

    public String getEmail() {
        return email;
    }

    public void setEmail(String userName) {
        this.email = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public JwtRequest() {
    }
}
