package com.lesson;


public class ExampleStaticFieldClass {

    public static int staticField=6;

    public int nonStaticField;

    public void hello() {
        System.out.println("hello");
    }
    public static void hello2() {
        System.out.println("hello2" + staticField);
    }

}
