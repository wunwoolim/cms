//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by FernFlower decompiler)
//

package com.example.cms.domain.user;

import java.sql.Date;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Table(
        name = "web_user"
)
@Entity
public class User {
    @Id
    @GeneratedValue(
            strategy = GenerationType.IDENTITY
    )
    private int id;
    private String username;
    private String password;
    private String name;
    private Date birth;
    private String gender;
    private String tel;
    private String pnum;

    public User(UserRequsetDto userRequestDto) {
        this.username = userRequestDto.getUsername();
        this.password = userRequestDto.getPassword();
        this.name = userRequestDto.getName();
        this.birth = userRequestDto.getBirth();
        this.gender = userRequestDto.getGender();
        this.tel = userRequestDto.getTel();
        this.pnum = userRequestDto.getPnum();
    }

    public User(String username, String password, String name, Date birth, String gender, String tel, String pnum) {
        this.username = username;
        this.password = password;
        this.name = name;
        this.birth = birth;
        this.gender = gender;
        this.tel = tel;
        this.pnum = pnum;
    }

    public User(String username, String password) {
        this.username = username;
        this.password = password;
    }

    public void update(UserRequsetDto userRequsetDto) {
        this.password = userRequsetDto.getPassword() != null ? userRequsetDto.getPassword() : this.password;
        this.name = userRequsetDto.getName() != null ? userRequsetDto.getName() : this.name;
        this.tel = userRequsetDto.getTel() != null ? userRequsetDto.getTel() : this.tel;
        this.pnum = userRequsetDto.getPnum() != null ? userRequsetDto.getPnum() : this.pnum;
    }

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

    public User() {
    }
}
