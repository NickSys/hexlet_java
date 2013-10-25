package com.lesson3.ui.message.console;

import com.lesson3.ui.message.IOnStringInput;

public class DotMessageShower extends ConsoleMessageShower{

    private static char SYMBOL = '.';

    public DotMessageShower(String message, IOnStringInput onStringInput) {
        super(message,SYMBOL,onStringInput);
    }



}

