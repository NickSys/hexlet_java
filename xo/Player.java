package com.xo;


import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

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

    public int doMove(){
        int x=inputCoord("строки : ");
        int y=inputCoord("столбца: ");

      }

    private int inputCoord(String rowOrColum){
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int numberRowOrColum=0;
        try{
        System.out.println(this.name + " введите номер " + rowOrColum);
        numberRowOrColum = Integer.parseInt(reader.readLine())-1;
        }
        catch(IOException e) {
            System.out.println(e);
        }


        return numberRowOrColum;
    }



}
