package com.syka;

import java.io.IOException;
import java.util.Scanner;

public class Menu {

    public void menu() throws IOException {

        Listmake userList = new Listmake();
        userList.readUsers();
        Common common = new Common();
        boolean mainMenu = true;

        while (mainMenu) {

            int choice = 0;

            System.out.println("1. Посмотреть баланс.");
            System.out.println("2. Снять деньги.");
            System.out.println("3. Выход.");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) choice = scan.nextInt();
            switch (choice) {

                case 1: {
                    System.out.println("Ваш баланс: " + userList.getBalance(common.getCountPass()));
                    break;
                }

            }
        }
    }
}
