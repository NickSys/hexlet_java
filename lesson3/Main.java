package com.lesson3;

public class Main {

    public static void main(String[] args) {

        showMessage(new StarMessageShower("Hello star Java"));

        showMessage(new DotMessageShower("Hello dot java"));

        showMessage(new NumberMessageShower("Hello dot java"));

    }

    public static void showMessage(MessageShower ms) {
        ms.show();

    }
}
