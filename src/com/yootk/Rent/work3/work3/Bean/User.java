package com.yootk.Rent.work3.work3.Bean;

public class User {
    String name;
    int money;

    public User() {
    }

    public User(String name, int monry) {
        this.name = name;
        this.money = monry;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int monry) {
        this.money = monry;
    }

    @Override
    public String toString() {
        return "User{" +
                "name='" + name + '\'' +
                ", monry=" + money +
                '}';
    }
}
