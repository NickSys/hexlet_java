package com.lesson;

public class Human {

    public static final int MIN_AGE =0;
    private static final int MAX_AGE =120;
    private static final int MIN_NAME_LENGHT =3;
    private String name;

    private int age;

    public int getAge() {
         return age;
    }

    public void setAge(int newAge) {
        if (newAge> Human.MIN_AGE && newAge< Human.MAX_AGE) {
           age = newAge;
        } else
        {
            System.out.println("age error!");
        }
    }

    public String getName() {
        return name;
    }

    public void setName(String newName) {
        if (newName !=null && newName.length()> Human.MIN_NAME_LENGHT)
        {
           name = newName;
        } else {
            System.out.println("Name is empty or lenght <3");
        }

    }
}
