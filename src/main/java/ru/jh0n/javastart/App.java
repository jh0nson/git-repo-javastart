package ru.jh0n.java;

/**
 * Hello world!
 *
 */
public class App {
    public static void main(String[] args) {
        byte b1 = 10;
        short sh1 = 10000;
        int in1 = 15;
        long lo1 = 10L;
        float fl1 = 10.1f;
        double db1 = 15.273;
        boolean bl1 = true;

    System.out.println(function(1,4,6,7)); //пункт 3 дз
    System.out.println(checksumm(5,6)); //пункт 4 дз
    checkposorneg(10); //пункт 5 дз
    System.out.println(checknegative(-10)); //пункт 6 дз
    printhello("Джонни"); //пункт 7 дз
    checkyear(2016); // пункт 8 дз




    }

    private static int function(int a, int b, int c, int d) {
        return a * (b + (c / d));
    }

    private static boolean checksumm(int a, int b) {
        int summ = a + b;
        return summ >= 10 && summ <= 20;
    }

    private static void checkposorneg(int a) {
        if (a >= 0) {
            System.out.println("Число положительное");
        } else {
            System.out.println("Число отрицательное");
        }
    }
    private static boolean checknegative(int a)
    {
        return a < 0;
    }

    private static void printhello(String txt){System.out.println("Привет, "+txt+"!");}

    private static void checkyear(int year)
    {
        if ( ((( year % 4) == 0 && (year % 100) != 0)) || (year % 400 == 0)){
            System.out.println("Год високосный!");
        } else {System.out.println("Год не високосный!");}
    }

}