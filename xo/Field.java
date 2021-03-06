package com.xo;



public class Field {
    // git
    private static final int FIELD_SIZE_MAX = 9;

    private static final int DEFAULT_FIELD_SIZE = 3;

    private static final char DEFAULT_CELL_VALUE = ' ';

    public final int fieldSize;

    private final char[][] field;

    public int[][] listMove1;

    public int[][] listMove2;

    public Field() {
        this(DEFAULT_FIELD_SIZE);
    }

    public Field(int size) {
        if (size>0 && size<FIELD_SIZE_MAX) {
        fieldSize = size;
        }
        else
        {
            fieldSize = FIELD_SIZE_MAX;
            System.out.println("Указанный размер поля слишком велик, устанавливаем " + FIELD_SIZE_MAX );
        }

        field = new char[fieldSize][fieldSize];
        listMove1 = new int[fieldSize][fieldSize];
        listMove2 = new int[fieldSize][fieldSize];
    }

    public int getFieldSize() {
        return fieldSize;
    }

    public void eraseField() {
        for (int i=0; i < fieldSize;i++) {
            eraseLine(i);
        }
    }

    public void showField() {
        showCoordLine();
        System.out.println();
        for (int i=0; i < fieldSize;i++) {
            showLine(i);
            System.out.println();
        }
    }

    private void eraseLine(int lineNumber) {
        for (int i=0; i < fieldSize;i++) {
            field[i][lineNumber] = DEFAULT_CELL_VALUE;
        }
    }

    private void showLine (int lineNumber) {
        System.out.print(lineNumber+1+ " ");
        for (int i=0; i < fieldSize;i++) {
            showCell(i,lineNumber);
        }
    }

    private void showCell(int x,int y) {
        System.out.print("[" + field[x][y] + "]");
    }

    private void showCoordLine() {
        System.out.print("  ");
        for (int i=1; i <= fieldSize; i++) {
            System.out.print(" " + i + " ");

        }
    }

    public void changeFieldXY(int newX,int newY,char charXO) {
        field[newX][newY] = charXO;
    }


}
