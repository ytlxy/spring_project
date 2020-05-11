package com.cn.domain;

import java.io.Serializable;

public class Account implements Serializable {
    private String username;
    private String passwd;
    private Double money;
    private User user;

    @Override
    public String toString() {
        return "Account{" +
                "username='" + username + '\'' +
                ", passwd='" + passwd + '\'' +
                ", money=" + money +
                ", user=" + user +
                '}';
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPasswd() {
        return passwd;
    }

    public void setPasswd(String passwd) {
        this.passwd = passwd;
    }

    public Double getMoney() {
        return money;
    }

    public void setMoney(Double money) {
        this.money = money;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }
}
