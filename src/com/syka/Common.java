package com.syka;

import java.io.IOException;
import java.util.Scanner;

public class Common {

    private int countPass;

    public int getCountPass() {
        return countPass;
    }

    public void setCountPass(int countPass) {
        this.countPass = countPass;
    }

    public void checkName() throws IOException {

        int countOfUserAttempt = 3, arrayCount;
        int a;
        String username = "";
        Listmake userList = new Listmake();
        userList.readUsers();
        arrayCount = userList.getUserList().size();

        for (int i = 0; i < countOfUserAttempt; i++) {

            System.out.println("Введите пользователя: ");
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextLine()) username = scan.nextLine();

            for (a = 0; a < arrayCount; a++) {

                if (username.equals(userList.getUser(a))) {
                    System.out.println("Пользователь найден!");
                    setCountPass(a);
                    i = countOfUserAttempt;
                }
            }

            if (i == countOfUserAttempt - 1) {
                System.out.print("Попытки кончились ");
                System.exit(0);
            }
        }
    }

    public void checkPassword() throws IOException {
        int password = 0;
        int countOfPasswordAttempt = 3;
        Listmake userList = new Listmake();
        userList.readUsers();
        Scanner scan = new Scanner(System.in);

        System.out.println("Password: " + userList.getPassword(getCountPass()));

        for (int i = 0; i < countOfPasswordAttempt; i++) {
            System.out.println("Введите пароль: ");
            if (scan.hasNextInt()) password = scan.nextInt();
            if (password == userList.getPassword(getCountPass())) {
                System.out.println("Добро пожаловать! ");
                i = countOfPasswordAttempt;
                break;
            }

            if (i == countOfPasswordAttempt - 1) {
                System.out.print("Попытки кончились ");
                System.exit(0);
            }
        }
    }

}