package com.lesson3;


public abstract class MessageShower {

    private final String message;

    public MessageShower(String message) {
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public abstract void show();



}
