package com.lesson3.ui.message.console;


import com.lesson3.ui.message.IOnStringInput;
import com.lesson3.ui.message.MessageShower;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class ConsoleMessageShower extends MessageShower {

    private final char symbol;

    public ConsoleMessageShower(String message,char symbol, IOnStringInput onStringInput) {
        super(onStringInput, message);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showLine();
        System.out.println(symbol + " " + getMessage() + " " + symbol);
        showLine();
        inputString();
    }

    private void inputString(){
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader bufferedReader = new BufferedReader(inputStreamReader);
        try {

            String stringFromUser = bufferedReader.readLine();
            getOnStringInput().onStringInput(stringFromUser);

        } catch (IOException e){
            e.printStackTrace();
        }

    }

    private void showLine(){
        for (int i=0; i<getMessage().length()+4;i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}