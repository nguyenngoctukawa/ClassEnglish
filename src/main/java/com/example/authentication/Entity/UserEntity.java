package com.example.authentication.Entity;

import lombok.AllArgsConstructor;
import lombok.Data;

import javax.persistence.*;
import java.util.Date;

@Data
@AllArgsConstructor
@Entity
@Table(name = "tUser")
public class UserEntity {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(columnDefinition = "serial")
    private Long userID;
    @Column(columnDefinition = "serial")
    private Long roleID;
    private String firstname;
    String lastname;
    String email;
    String password;
    Boolean activeaccount;
    String gender;
    String address;
    Date birthdate;
    String phonenumber;
    Date timecreate;
    Date expiry;
    int numberoffail;
    String target;
    String notes;


    public UserEntity(Long roleID, String email, String password) {
        this.roleID = roleID;
        this.email = email;
        this.password = password;
    }

    public String getTarget() {
        return target;
    }

    public void setTarget(String target) {
        this.target = target;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public UserEntity() {
    }

    public Long getUserID() {
        return userID;
    }

    public void setUserID(Long userID) {
        this.userID = userID;
    }

    public Long getRoleID() {
        return roleID;
    }

    public void setRoleID(Long roleID) {
        this.roleID = roleID;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
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

    public Boolean getActiveaccount() {
        return activeaccount;
    }

    public void setActiveaccount(Boolean activeaccount) {
        this.activeaccount = activeaccount;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getBirthdate() {
        return birthdate;
    }

    public void setBirthdate(Date birthdate) {
        this.birthdate = birthdate;
    }

    public String getPhonenumber() {
        return phonenumber;
    }

    public void setPhonenumber(String phonenumber) {
        this.phonenumber = phonenumber;
    }

    public Date getTimecreate() {
        return timecreate;
    }

    public void setTimecreate(Date timecreate) {
        this.timecreate = timecreate;
    }

    public Date getExpiry() {
        return expiry;
    }
    public void setExpiry(Date expiry) {
        this.expiry = expiry;
    }

    public int getNumberoffail() {
        return numberoffail;
    }

    public void setNumberoffail(int numberoffail) {
        this.numberoffail = numberoffail;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "userID=" + userID +
                ", roleID=" + roleID +
                ", firstname='" + firstname + '\'' +
                ", lastname='" + lastname + '\'' +
                ", email='" + email + '\'' +
                ", password='" + password + '\'' +
                ", activeaccount=" + activeaccount +
                ", gender='" + gender + '\'' +
                ", address='" + address + '\'' +
                ", birthdate=" + birthdate +
                ", phonenumber='" + phonenumber + '\'' +
                ", timecreate=" + timecreate +
                ", expiry=" + expiry +
                ", numberoffail=" + numberoffail +
                ", target='" + target + '\'' +
                ", notes='" + notes + '\'' +
                '}';
    }
}
