package com.lesson3;


public class StarMessageShower extends ConsoleMessageShower{

    private static char SYMBOL = '*';

    public StarMessageShower(String message) {
        super(message,SYMBOL);
    }



}
