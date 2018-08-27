package com.syka;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Scanner;

public class ListSet {

    public void setUsers(Listmake userList) throws IOException {
        int arrayCount = userList.getUserList().size();

        PrintWriter writer = new PrintWriter("/home/ivasik/Стол/bank.txt", "UTF-8");
        for (int i = 0; i < arrayCount; i++) {
            writer.print(userList.getUser(i));
            writer.print("|");
            writer.print(userList.getPassword(i));
            writer.print("|");
            writer.println(userList.getBalance(i));
        }
        writer.close();
    }
}
