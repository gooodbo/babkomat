package com.syka;

import java.io.IOException;
import java.util.Scanner;

public class Menu {
    Common common;
    public Menu(Common common) {
        this.common = common;
    }

    public void menu() throws IOException {

        Listmake userList = new Listmake();
        userList.readUsers();
        boolean mainMenu = true;

        while (mainMenu) {

            int choice = 0;
            ListSet userSet = new ListSet();
            System.out.println("------------------------------------------");
            System.out.println("1. Посмотреть баланс.");
            System.out.println("2. Снять деньги.");
            System.out.println("3. Выход.");
            Scanner scan = new Scanner(System.in);
            if (scan.hasNextInt()) choice = scan.nextInt();
            switch (choice) {

                case 1: {
                    System.out.println("Ваш баланс: " + userList.getBalance(common.getCountPass())+" руб.");
                    break;
                }

                case 2: {
                    Menu menu = new Menu(common);
                    int choiceMoney = 0;
                    System.out.println("------------------------------------------");
                    System.out.println("Выберите сумму:");
                    System.out.println("1. 5 руб.");
                    System.out.println("2. 10 руб.");
                    System.out.println("3. 20 руб.");
                    System.out.println("4. 50 руб.");
                    System.out.println("5. Другая сумма.");
                    if (scan.hasNextInt()) choiceMoney = scan.nextInt();

                    switch (choiceMoney) {

                        case 1: {
                            menu.withdrawMoney(5, userList.getBalance(common.getCountPass()),userList);
                            userSet.setUsers(userList);
                            break;
                        }

                        case 2: {
                            menu.withdrawMoney(10, userList.getBalance(common.getCountPass()),userList);
                            userSet.setUsers(userList);
                            break;
                        }

                        case 3: {
                            menu.withdrawMoney(20, userList.getBalance(common.getCountPass()),userList);
                            userSet.setUsers(userList);
                            break;
                        }

                        case 4: {
                            menu.withdrawMoney(50, userList.getBalance(common.getCountPass()),userList);
                            userSet.setUsers(userList);
                            break;
                        }

                        case 5: {
                            int cash = 0;
                            System.out.print("Введите сумму: ");
                            if (scan.hasNextInt()) cash = scan.nextInt();
                            menu.withdrawMoney(cash, userList.getBalance(common.getCountPass()),userList);
                            userSet.setUsers(userList);
                            break;
                        }

                    }
                    break;
                }

                case 3: {
                    System.exit(0);
                }
            }
        }
    }

    public void withdrawMoney(int remove, int oldBalance, Listmake userList) {
        int newBanance;
        if ((oldBalance - remove) >= 0) newBanance = oldBalance - remove;
        else {
            System.out.println("Недостаточно средств");
            return;
        }
        userList.setBalance(common.getCountPass(), newBanance);
        System.out.println("Кэш успешно снят!");
    }
}
