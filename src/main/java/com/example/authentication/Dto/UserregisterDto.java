package com.example.authentication.Dto;

public class UserregisterDto {
     String email;
     String password;
     String roleid;

     String error;

    public String getError() {
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getRoleid() {
        return roleid;
    }

    public void setRoleid(String roleid) {
        this.roleid = roleid;
    }

    public UserregisterDto(String roleid) {
        this.roleid = roleid;
    }

    public UserregisterDto() {
    }

    @Override
    public String toString() {
        return "UserregisterDto{" +
                "email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", roleid='" + roleid + '\'' +
                ", error='" + error + '\'' +
                '}';
    }

    public UserregisterDto(String email, String password, String error) {
        this.email = email;
        this.password = password;
        this.error= error;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

}
