package com.xo;

 import java.io.BufferedReader;
 import java.io.IOException;
 import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) throws IOException {
        Field field = new Field();
        field.eraseField();
        field.showField();

        Player player1 = new Player("Nick");
        Player player2 = new Player("Comp");

        player1.metka = 'X';
        player2.metka = '0';

        for (int i=0;i<field.fieldSize;i++){

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        System.out.println(player1.name + " введите номер строки: ");
        int x = Integer.parseInt(reader.readLine())-1;
        System.out.println(player1.name + " введите номер столбца: ");
        int y = Integer.parseInt(reader.readLine())-1;

            field.changeFieldXY(x,y,player1.metka);
            field.showField();

            System.out.println();

            System.out.println(player2.name + " введите номер строки: ");
             x = Integer.parseInt(reader.readLine())-1;
            System.out.println(player2.name + " введите номер столбца: ");
             y = Integer.parseInt(reader.readLine())-1;
            field.changeFieldXY(x,y,player2.metka);
            field.showField();

        }



    }
}
