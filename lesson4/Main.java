package com.lesson4;


import java.util.Iterator;

public class Main {
    public static void main(String[] args) {
        Building building = new Building();
        Human max = new Human("Max");
        Human nick = new Human("Nick");
        building.addHuman(max);
        building.addHuman(nick);



       for (Human human : building)
       {
           System.out.println(human);
       }



    }
}
