package com.syka;

public class User {

    private String userName;
    private int password;
    private int balance;

    public String getUserName() {
        return userName;
    }

    public int getPassword() {
        return password;
    }

    public int getBalance() {
        return balance;
    }

    public void setUserName(String name) {
        this.userName = name;
    }

    public void setPassword(int pass) {
        this.password = pass;
    }

    public void setBalance(int cash) {
        this.balance = cash;
    }

    @Override
    public String toString() {
        return "User{" +
                "userName='" + userName + '\'' +
                ", password=" + password +
                ", balance=" + balance +
                '}';
    }
}


