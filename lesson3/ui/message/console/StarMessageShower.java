package com.lesson3.ui.message.console;


import com.lesson3.ui.message.IOnStringInput;

public class StarMessageShower extends ConsoleMessageShower{

    private static char SYMBOL = '*';

    public StarMessageShower(String message, IOnStringInput onStringInput) {
        super(message,SYMBOL,onStringInput);
    }



}
