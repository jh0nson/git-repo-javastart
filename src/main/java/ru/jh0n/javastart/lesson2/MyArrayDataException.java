package ru.jh0n.javastart.lesson2;

public class MyArrayDataException extends Exception {
    private static int x,y;


    public MyArrayDataException(String dataException, int i, int n) {
        x=n+1;
        y=i+1;
    }
    public static String result(){
        return  "ќшибка в €чейке "+"["+x+"]"+"["+y+"];";
    }


}