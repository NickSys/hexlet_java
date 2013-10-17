package com.lesson3;

public class NumberMessageShower extends ConsoleMessageShower {

    private static char SYBMOL = '#';

    public NumberMessageShower(String message) {
        super(message, SYBMOL);
    }
}
