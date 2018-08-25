package com.syka;

import java.io.IOException;
import java.util.ArrayList;

public class example {

    public static void main(String[] args) throws IOException {
        Common check = new Common();
        Menu show = new Menu();
        check.checkName();
        check.checkPassword();
        show.menu();
    }
}
