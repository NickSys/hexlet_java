package com.lesson3.ui.message;

public class InputAgeListener implements IOnStringInput{
    @Override
    public void onStringInput(String input) {
        System.out.println("Your age is: " + input);
    }
}
