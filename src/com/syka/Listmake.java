package com.syka;

import java.io.*;
import java.util.ArrayList;

public class Listmake {

    public Listmake() {

        this.userList = new ArrayList<>();
    }

    ArrayList<User> userList;

    public void readUsers() throws IOException {
        String s = null;
        java.io.FileReader fileReader = new java.io.FileReader("/home/ivasik/Рабочий стол/IdeaProg/Bank/bank.txt");
        BufferedReader bufferedReader = new BufferedReader(fileReader);

        while ((s = bufferedReader.readLine()) != null) {
            User user = new User();
            String[] fileData = s.split("\\|");
            user.setUserName(fileData[0]);
            user.setPassword(Integer.parseInt(fileData[1]));
            user.setBalance(Integer.parseInt(fileData[2]));
            userList.add(user);
        }

    }

    public ArrayList<User> getUserList() {
        return userList;
    }


    public String getUser(int i) {

        return userList.get(i).getUserName();
    }

    public int getPassword(int i) {

        return userList.get(i).getPassword();
    }

    public int getBalance(int i) {

        return userList.get(i).getBalance();
    }
}