package com.lesson3;

public class DotMessageShower extends ConsoleMessageShower{

    private static char SYMBOL = '.';

    public DotMessageShower(String message) {
        super(message,SYMBOL);
    }



}

