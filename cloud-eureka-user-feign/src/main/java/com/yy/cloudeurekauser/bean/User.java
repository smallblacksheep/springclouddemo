package com.yy.cloudeurekauser.bean;

import java.io.Serializable;

public class User implements Serializable {
    private Integer id;
    private String userName;

    public User() {
    }

    public User(String userName) {
        this.userName = userName;
    }

    public User(Integer id, String userName) {
        this.id = id;
        this.userName = userName;
    }

    public Integer getId() {
        return id;
    }
    public void setId(Integer id) {
        this.id = id;
    }
    public String getUserName() {
        return userName;
    }
    public void setUserName(String userName) {
        this.userName = userName;
    }
}
