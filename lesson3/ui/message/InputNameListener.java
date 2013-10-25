package com.lesson3.ui.message;


public class InputNameListener implements IOnStringInput{
    @Override
    public void onStringInput(String input) {
        System.out.println("Your name is: " + input);

    }
}
