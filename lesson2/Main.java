package com.lesson2;


public class Main {
    public static void main(String[] args) {
        Human human = new Human("Max");
        System.out.println(human.getName());
        System.out.println("~~~~~~~~~~~~~~~~~~~");
        Student student = new Student("Nick");
        System.out.println(student.getName());
        House house = new House();
        Human houseOwner = student;
        house.setHuman(student);
        System.out.println("Owner house: "+house.getOwnerName());

        Teacher teacher = new Teacher("vasa vasa");
        house.setHuman(teacher);
        System.out.println("Owner house: "+house.getOwnerName());
    }
}
