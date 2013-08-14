package com.xo;


public class Player {

    public String name = "N/A";

    public char metka ;

    public Player(String name){
        this.name = name;
    }

    public String getName(){
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
