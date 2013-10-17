package com.lesson3;


public class ConsoleMessageShower extends MessageShower {

    private final char symbol;

    public ConsoleMessageShower(String message,char symbol) {
        super(message);
        this.symbol = symbol;
    }

    @Override
    public void show() {
        showLine();
        System.out.println(symbol + " " + getMessage() + " " + symbol);
        showLine();
    }

    private void showLine(){
        for (int i=0; i<getMessage().length()+4;i++){
            System.out.print(symbol);
        }
        System.out.println();
    }
}


