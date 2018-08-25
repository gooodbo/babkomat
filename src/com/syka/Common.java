package com.syka;

import java.io.IOException;
import java.util.Scanner;

public class Common {


    public void checkName() throws IOException {
        int countPass = 0;
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
                    countPass = a;
                    i = countOfUserAttempt;
                    break;
                }
            }

            if (i == countOfUserAttempt - 1) {
                System.out.print("Попытки кончились ");
                System.exit(0);
            }
        }
    }

    public void checkPassword() {
        int countPass = 0;
        int password = 0;
        int countOfPasswordAttempt = 3;
        Listmake userList = new Listmake();

        for (int i = 0; i < countOfPasswordAttempt; i++) {
            System.out.println("Введите пароль: ");
            Scanner scan = new Scanner(System.in);

            if (scan.hasNextInt()) password = scan.nextInt();


            if (password == userList.getPassword(countPass)) {
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