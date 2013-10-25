package com.lesson3;

import com.lesson3.ui.message.IOnStringInput;

public class StringListener implements IOnStringInput{

    @Override
    public void onStringInput(String input) {
        System.out.println("User input: " + input);
    }
}
