package com.lesson2;

public class Student extends Human{

    private int course = 1;

    public Student(String name) {
        super(name);
        System.out.println("In Student()");
    }
    public int getCourse() {
        return course;
    }
    public void setCourse(int course) {
        this.course = course;
    }
}
