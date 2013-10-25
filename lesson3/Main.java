package com.lesson3;

import com.lesson3.ui.message.InputAgeListener;
import com.lesson3.ui.message.InputNameListener;
import com.lesson3.ui.message.MessageShower;
import com.lesson3.ui.message.console.DotMessageShower;
import com.lesson3.ui.message.console.NumberMessageShower;
import com.lesson3.ui.message.console.StarMessageShower;

public class Main {

    public static void main(String[] args) {

        StringListener stringListener = new StringListener();

        showMessage(new StarMessageShower("Wat is your name: ", new InputNameListener()));

       showMessage(new DotMessageShower("What is your age: ",new InputAgeListener()));



    }

    public static void showMessage(MessageShower ms) {
        ms.show();

    }
}
