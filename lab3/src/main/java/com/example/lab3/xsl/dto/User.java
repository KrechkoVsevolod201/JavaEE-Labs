package com.example.lab3.xsl.dto;

import com.example.lab3.model.UserEntity;

import javax.xml.bind.annotation.XmlElement;

public class User {
    private int id;
    private String username;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(UserEntity user) {
        this.id = user.getId();
        this.username = user.getUsername();
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }
}
