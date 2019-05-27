package ru.jh0n.javastart.lesson1;

import java.util.Random;

public class Biathlon {
    public static void main(String[] args) {
        int i,n;
        //boolean t;
        Human athlet[] = new Human[4];
        Random rnd = new Random();
        for (i=0;i<4;i++) {
            athlet[i]=new Human();
            athlet[i].setName("athlet"+(i+1));
            athlet[i].setMaxjumpheight(140+rnd.nextInt(30));
            athlet[i].setMaxrunlenght(80+rnd.nextInt(20));
            //athlet[i].run();

        }
        Barrier barrier[] = new Barrier[10];
        for (i=0;i<10;i++){
            if ((rnd.nextInt(100)%2)==0) barrier[i]=new Treadmill(); else barrier[i]=new Wall();
            System.out.println(barrier[i].getAction()+" " + barrier[i].getBarrier());
        }

        for (i=0;i<4;i++){
            System.out.println(athlet[i].getName());
            for (n=0;n<10;n++){
                if (barrier[n].getAction()=="jump") {
                    if (athlet[i].getMaxjumpheight()<barrier[i].getBarrier()) {
                        System.out.println(athlet[i].getName()+" fail");
                        break;
                    } else athlet[i].jump();
                } else {
                    if (athlet[i].getMaxrunlenght()<barrier[i].getBarrier()) {
                        System.out.println(athlet[i].getName()+" fail");
                        break;
                    } else athlet[i].run();

                } if (n==9) System.out.println(athlet[i].getName()+" winner");
            }
        }

    }
}
