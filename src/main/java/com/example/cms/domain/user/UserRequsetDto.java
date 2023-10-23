//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.domain.user;

import java.sql.Date;

public class UserRequsetDto {
    private int id;
    private String username;
    private String password;
    private String name;
    private Date birth;
    private String gender;
    private String tel;
    private String pnum;

    public int getId() {
        return this.id;
    }

    public String getUsername() {
        return this.username;
    }

    public String getPassword() {
        return this.password;
    }

    public String getName() {
        return this.name;
    }

    public Date getBirth() {
        return this.birth;
    }

    public String getGender() {
        return this.gender;
    }

    public String getTel() {
        return this.tel;
    }

    public String getPnum() {
        return this.pnum;
    }

    public void setId(final int id) {
        this.id = id;
    }

    public void setUsername(final String username) {
        this.username = username;
    }

    public void setPassword(final String password) {
        this.password = password;
    }

    public void setName(final String name) {
        this.name = name;
    }

    public void setBirth(final Date birth) {
        this.birth = birth;
    }

    public void setGender(final String gender) {
        this.gender = gender;
    }

    public void setTel(final String tel) {
        this.tel = tel;
    }

    public void setPnum(final String pnum) {
        this.pnum = pnum;
    }

    public UserRequsetDto() {
    }
}
