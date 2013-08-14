package com.lesson2;


import sun.jvm.hotspot.opto.Node_Array;

public class Human {



    private final String name;

    private int age;



    public Human(String name) {
        this.name = name;
        System.out.println("In Human()");
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;

    }
    public void birthDay() {
        age++;
    }
}