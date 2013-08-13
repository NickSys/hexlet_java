package com.hexlet;
import com.hexlet.humans.Student;
public class Main {
    public static void main(String[] args)
    {
        Student studentMax = new Student();
        studentMax.name = "Max";

        studentMax.course.name = "Java";
        studentMax.sayHello();
        Student studentSlava = new Student();
        studentSlava.sayHello();
    }

}
