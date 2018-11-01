package ru.jh0n.javastart;

import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class TicTacToe {
    private static final char charX ='X';
    private static final char empty ='.';
    private static final char charO ='O';
    private static int size;
    private static int block;
    private static Random rnd=new Random();
    private static Scanner sc=new Scanner(System.in);
    private static char[][] map;
    private static boolean gameover=false;
    public static void main(String[] args) {
        go();
    }

    private static void go(){
        initGame();
        map=new char[size][size];
        initMap();
        printMap();
        while (true){
            humanTurn();
            checkWin(charX);
            if (!checkSpace()) {
                System.out.println("Ничья!!!");
                break;
            }
            if (gameover) {
                System.out.println("Вы победили!!!");
                break;
            }
            aiTurn();
            checkWin(charO);
            if (!checkSpace()) {
                System.out.println("Ничья!!!");
                break;
            }
            if (gameover) {
                System.out.println("Компьютер победил");
                break;
            }

        }
    }
    private static void initGame() {
        System.out.println("Введите размер поля [3-10]:");
        do {
            size = sc.nextInt();
        } while (size < 3 || size>10);
        System.out.println("Введите размер линии для выигрыша [3-"+size+"]:");
        do {
            block = sc.nextInt();
        }while (block<3 || block>size);
    }
    private static void initMap(){

        for (int i=0;i<size;i++){
            for (int n=0;n<size;n++){
                map[i][n]=empty;
            }
        }
    }
    private static void printMap(){
        //if (size>=10){
        //    System.out.print("  ");
        //} else System.out.print(" ");
        for (int x=0;x<size+1;x++){
            System.out.print(x+" ");
        }
        System.out.println();
        for (int y=0;y<size;y++){
            if (y<size-1&&size>=10) System.out.print(" ");
            System.out.print(y+1);
            for (int x=0;x<size;x++){
                System.out.print(" " + map[x][y]);
            }
            System.out.println();
        }
    }
    private static void humanTurn(){
        System.out.println("Ваш ход. Введите координаты хода:");
        int x,y;
        do {
            x=sc.nextInt();
            y=sc.nextInt();
        } while (x<1||y<1||x>size||y>size||map[x-1][y-1]!=empty);
        map[x-1][y-1]=charX;
        printMap();
    }
    private static void aiTurn() {
        int x,y;
        System.out.println("Ход компьютера");
        do {
            x=rnd.nextInt(size);
            y=rnd.nextInt(size);
        } while (map[x][y]!=empty);
        map[x][y]=charO;
        printMap();
    }
    private static void checkWin (char symb){
        String test;
        char [] summSymb=new char[block];
        char [] checkLine=new char[size];
        //формируем строку для проверки
        for (int i=0;i<block;i++){
            summSymb[i]=symb;
            //System.out.print(summSymb[i]+" "+i);
        }
        //проверка вертикалей
        for (int x=0;x<size;x++){
            for (int y=0;y<size;y++){
                checkLine[y]=map[x][y];
            }
            if (checkLines(String.valueOf(checkLine),String.valueOf(summSymb))) gameover=true;

        }
        //проверка горизонтали
        for (int y=0;y<size;y++){
            for (int x=0;x<size;x++){
                checkLine[x]=map[x][y];
            }
            if (checkLines(String.valueOf(checkLine),String.valueOf(summSymb))) gameover=true;


        }
        //проверка диагоналей
        for (int i=0;i<size;i++){
            checkLine[i]=map[i][i];
        }
        if (checkLines(String.valueOf(checkLine),String.valueOf(summSymb))) gameover=true;
        for (int i=0;i<size;i++){
            checkLine[i]=map[size-1-i][i];
        }
        if (checkLines(String.valueOf(checkLine),String.valueOf(summSymb))) gameover=true;

    }
    private static boolean checkLines (String control,String contents){
        return control.contains(contents);
    }
    private static boolean checkSpace(){
        for (int x=0;x<size;x++){
            for (int y=0;y<size;y++){
                if (map[x][y] == empty) return true;
            }
        }
        return false;
    }




}
