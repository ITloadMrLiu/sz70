package com.itheima.domain;

/**
 * @program: myStudy
 * @description:
 * @author:
 * @create: 2019-08-02 21:31
 **/
public class Account {
    private Integer aid;
    private Integer money;
    private Integer uid;
    private User user;

    public Account() {
    }

    public Account(Integer aid, Integer money, Integer uid, User user) {
        this.aid = aid;
        this.money = money;
        this.uid = uid;
        this.user = user;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public Integer getAid() {
        return aid;
    }

    public void setAid(Integer aid) {
        this.aid = aid;
    }

    public Integer getMoney() {
        return money;
    }

    public void setMoney(Integer money) {
        this.money = money;
    }

    public Integer getUid() {
        return uid;
    }

    public void setUid(Integer uid) {
        this.uid = uid;
    }

    @Override
    public String toString() {
        return "Account{" +
                "aid=" + aid +
                ", money=" + money +
                ", uid=" + uid +
                ", user=" + user +
                '}';
    }
}
