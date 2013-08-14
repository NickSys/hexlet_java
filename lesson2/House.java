package com.lesson2;


public class House {

    private Human human;

    public int countHuman=0;

    public Human getHuman() {
        return human;
    }

    public void setHuman(Human human) {
        this.human = human;
        countHuman++;
    }

    public String getOwnerName() {
        return human.getName();
    }
}
