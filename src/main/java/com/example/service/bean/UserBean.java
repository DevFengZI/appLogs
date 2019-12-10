package com.example.service.bean;

public class UserBean {

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPassworld() {
        return passworld;
    }

    public void setPassworld(String passworld) {
        this.passworld = passworld;
    }

    public UserBean(String name, String passworld) {
        this.name = name;
        this.passworld = passworld;
    }

    public String name;
    public String passworld;
}
