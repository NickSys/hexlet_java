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


        player1.doMove();







    }
}
