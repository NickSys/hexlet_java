package com.lesson3.ui.message;


import com.lesson3.ui.message.IOnStringInput;

public abstract class MessageShower {

    private final IOnStringInput onStringInput;

    private final String message;

    protected MessageShower(IOnStringInput onStringInput, String message) {
        this.onStringInput = onStringInput;
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public IOnStringInput getOnStringInput() {
        return onStringInput;
    }

    public abstract void show();

}
