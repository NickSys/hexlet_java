package com.lesson2;


public class Main {
    public static void main(String[] args) {

        Human human = new Human("Max");
        human.setAge(30);
        System.out.println(human.getName()+ ", age - " + human.getAge());
        human.birthDay();
        System.out.println(human.getName()+ ", age after birthday- " + human.getAge());
        System.out.println("~~~~~~~~~~~~~~~~~~~");



        Student student = new Student("Nick");
        student.setAge(38);
        student.setCourse(1);
        System.out.println(student.getName() + ", age - " + student.getAge() +", course - " + student.getCourse());

        House houseForStudents = new House();

        House houseForTeachers = new House();

        houseForStudents.setHuman(student);
        System.out.println("Owner house: " + houseForStudents.getOwnerName());

        Teacher teacher = new Teacher("vasa vasa");
        houseForTeachers.setHuman(teacher);

        System.out.println("Owner house: " + houseForTeachers.getOwnerName());

        System.out.println("Count human in house Students - " + houseForStudents.countHuman);
        System.out.println("Count human in house Teachers - " + houseForTeachers.countHuman);

    }
}
