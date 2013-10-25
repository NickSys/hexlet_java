package com.lesson3.ui.message.console;

import com.lesson3.ui.message.IOnStringInput;

public class NumberMessageShower extends ConsoleMessageShower{

    private static char SYBMOL = '#';

    public NumberMessageShower(String message, IOnStringInput onStringInput) {
        super(message, SYBMOL, onStringInput);
    }
}
